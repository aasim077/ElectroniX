package com.aasim.electonic.store.ProjectElectronicStore.dtos;

import com.aasim.electonic.store.ProjectElectronicStore.entities.CartItem;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartDto{
    private String cartId;
    private Date createdAt;
    private UserDto user;
    //mampping cart items
    private List<CartItem> items = new ArrayList<>();


}
//  For any Query Contact : aasimahsan77@gmail.com

