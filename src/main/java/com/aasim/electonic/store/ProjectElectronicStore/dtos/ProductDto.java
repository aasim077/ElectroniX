package com.aasim.electonic.store.ProjectElectronicStore.dtos;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
//@ToString

public class ProductDto{
    private String productImageName;
    private String productId;
    private String title;
    private CategoryDto category;
    private String description;
    private int price;
    private int discountedPrice;
    private int quantity;
    private Date addedDate;
    private boolean live;
    private boolean stock;

}
//  For any Query Contact : aasimahsan77@gmail.com
