package com.aasim.electonic.store.ProjectElectronicStore.dtos;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImageResponse{

      private String imageName;
      private boolean success;
      private HttpStatus status;




}
//  For any Query Contact : aasimahsan77@gmail.com
