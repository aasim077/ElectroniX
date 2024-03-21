package com.aasim.electonic.store.ProjectElectronicStore.services.impl;

import com.aasim.electonic.store.ProjectElectronicStore.dtos.CreateOrderRequest;
import com.aasim.electonic.store.ProjectElectronicStore.dtos.OrderDto;
import com.aasim.electonic.store.ProjectElectronicStore.dtos.OrderUpdateRequest;
import com.aasim.electonic.store.ProjectElectronicStore.dtos.PageableResponse;
import com.aasim.electonic.store.ProjectElectronicStore.entities.*;
import com.aasim.electonic.store.ProjectElectronicStore.exceptions.BadApiRequestException;
import com.aasim.electonic.store.ProjectElectronicStore.exceptions.ResourceNotFoundException;
import com.aasim.electonic.store.ProjectElectronicStore.helper.Helper;
import com.aasim.electonic.store.ProjectElectronicStore.repositories.CartRepository;
import com.aasim.electonic.store.ProjectElectronicStore.repositories.OrderRepository;
import com.aasim.electonic.store.ProjectElectronicStore.repositories.UserRepository;
import com.aasim.electonic.store.ProjectElectronicStore.services.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ModelMapper mapper;

    @Autowired
    private CartRepository cartRepository;

    @Override
    public OrderDto createOrder(CreateOrderRequest orderDto) {

        String userId = orderDto.getUserId();
        String cartId = orderDto.getCartId();


        //         av userId chaiye so userRepository use Karo


        //fetch user
        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User Not Found With Given Id"));

        //we are fetching this Cart Id
        Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new ResourceNotFoundException("Cart with given id not found on Server"));


        //how many items in the carts we can user through. this
        List<CartItem> cartItems = cart.getItems();

        //what is the cart is empty We can use this .
        if (cartItems.size() <= 0) {

            throw new BadApiRequestException("Invalid number of items in cart !!");

        }
        // other checks (you want to Code)

        Order order = Order.builder().billingName(orderDto.getBillingName())
                .billingPhone(orderDto.getBillingPhone())
//                .orderAmount(orderDto.getOrderAmount())
                .billingAddress(orderDto.getBillingAddress())
                .orderedDate(new Date())
                .deliveredDate(null)
                .paymentStatus(orderDto.getPaymentStatus())
                .orderStatus(orderDto.getOrderStatus())
                .orderId(UUID.randomUUID().toString())
                .user(user)
                .build();


//        /orderitems , amount we dinn;t set
        AtomicReference<Integer> orderAmount = new AtomicReference<>(0);

//        converting cart items into order items
        List<OrderItem> orderItems = cartItems.stream().map(cartItem -> {

            //            cart items -> Order Items
            OrderItem orderItem = OrderItem.builder().quantity(cartItem.getQuantity())
                    .product(cartItem.getProduct())
                    .totalPrice(cartItem.getQuantity() * cartItem.getProduct().getDiscountedPrice())
                    .order(order).build();

            orderAmount.set(orderAmount.get() + orderItem.getTotalPrice());
            return orderItem;

        }).collect(Collectors.toList());
        order.setOrderItems(orderItems);
        order.setOrderAmount(orderAmount.get());

        cart.getItems().clear();
        cartRepository.save(cart);
        Order savedOrder = orderRepository.save(order);
        return mapper.map(savedOrder, OrderDto.class);

    }

    @Override
    public void removeOrder(String orderId) {

        //first fetch the order
        //if order is deleted then ordere items also  deleted // because order items ke cascade me CascadeType.All
        Order order = orderRepository.findById(orderId).orElseThrow(() -> new ResourceNotFoundException("order is not found"));
        orderRepository.delete(order);

    }

    @Override
    public List<OrderDto> getOrdersOfUser(String userId) {

        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("Users Not found !!"));
        System.out.println(user.getEmail());

        List<Order> orders = orderRepository.findByUser(user);


        List<OrderDto> orderDtos = orders.stream().map(order -> mapper.map(order, OrderDto.class)).collect(Collectors.toList());
        return orderDtos;

    }

    @Override
    public PageableResponse<OrderDto> getOrders(int pageNumber, int pageSize, String sortBy, String sortDir) {

        Sort sort = (sortDir.equalsIgnoreCase("desc") ? (Sort.by(sortBy).descending()) : (Sort.by(sortBy).ascending()));
        Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);
        Page<Order> page = orderRepository.findAll(pageable);
        return Helper.getPageableResponse(page, OrderDto.class);

    }

    @Override
    public OrderDto updateOrder(String orderId, OrderUpdateRequest request) {
        //
        Order order = orderRepository.findById(orderId).orElseThrow(() -> new BadApiRequestException("Order Id is not Present"));
        order.setBillingPhone(request.getBillingPhone());
        order.setBillingName(request.getBillingName());
        order.setBillingAddress(request.getBillingAddress());
        order.setPaymentStatus(request.getPaymentStatus());
        order.setOrderStatus(request.getOrderStatus());
        order.setDeliveredDate(request.getDeliveredDate());
        Order updateOrder = orderRepository.save(order);

        OrderDto orderDto1 = mapper.map(updateOrder, OrderDto.class);
        return orderDto1;

    }
}
//For any Query Contact : aasimahsan77@gmail.com