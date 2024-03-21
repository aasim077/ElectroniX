package com.aasim.electonic.store.ProjectElectronicStore.services;

import com.aasim.electonic.store.ProjectElectronicStore.dtos.CreateOrderRequest;
import com.aasim.electonic.store.ProjectElectronicStore.dtos.OrderDto;
import com.aasim.electonic.store.ProjectElectronicStore.dtos.OrderUpdateRequest;
import com.aasim.electonic.store.ProjectElectronicStore.dtos.PageableResponse;

import java.util.List;

public interface OrderService{

    //create order
    //

    OrderDto createOrder(CreateOrderRequest orderDto);

 //remove order
 void removeOrder(String orderId);

 //get orders of user
    List<OrderDto> getOrdersOfUser (String userId) ;
    //get orders
    //
  PageableResponse<OrderDto> getOrders(int pageNumber , int  pageSize , String sortBy , String sortDir);
  OrderDto updateOrder(String orderId ,  OrderUpdateRequest request);

    //other methods realted to order



}
