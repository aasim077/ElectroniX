package com.aasim.electonic.store.ProjectElectronicStore.services;

import com.aasim.electonic.store.ProjectElectronicStore.dtos.AddItemToCartRequest;
import com.aasim.electonic.store.ProjectElectronicStore.dtos.CartDto;

public interface CartService {

    //add items to the cart
    // case1 : Cart for use is not available : we'll create a cart then ADD the items
    // case2  : cast AVAILABLE addthe items to the cart

    CartDto addItemToCart(String userId , AddItemToCartRequest request);

    //remove item from cart
    void clearCart(String userId);

    //remove all items from the cart
    void removeItemsFromCart(String userId , int cartItem);

    CartDto getCartByUser(String userId);


}
