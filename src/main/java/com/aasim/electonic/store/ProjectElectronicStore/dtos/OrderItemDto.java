package com.aasim.electonic.store.ProjectElectronicStore.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderItemDto {


    private int orderItemid;

    private int quantity;

    private  int totalPrice;


    private ProductDto product;


//    private OrderDto order;
}

//  For any Query Contact : aasimahsan77@gmail.com
