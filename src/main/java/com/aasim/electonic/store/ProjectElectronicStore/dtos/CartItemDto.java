package com.aasim.electonic.store.ProjectElectronicStore.dtos;

import com.aasim.electonic.store.ProjectElectronicStore.entities.Product;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartItemDto {
    private int cartItemId;
    private Product product;
    private int quantity;
    private int totalPrice;


}
//  For any Query Contact : aasimahsan77@gmail.com
