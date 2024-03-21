package com.aasim.electonic.store.ProjectElectronicStore.security;

import com.aasim.electonic.store.ProjectElectronicStore.dtos.UserDto;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class JwtResponse{

    private String jwtToken;
    private UserDto user;
    //these are the requirements to get the data from the jwt and
    //give it to the Response

}
