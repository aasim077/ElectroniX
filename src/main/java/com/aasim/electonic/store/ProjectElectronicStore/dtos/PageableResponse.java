package com.aasim.electonic.store.ProjectElectronicStore.dtos;

import lombok.*;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PageableResponse<T>{

////    this class is used to send the response

    private List<T> content;
    private int pageNumber;
    private int pageSize;
    private long totalElements;
    private int totalPages;
    private boolean lastpage;

}

//  For any Query Contact : aasimahsan77@gmail.com
