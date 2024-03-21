package com.aasim.electonic.store.ProjectElectronicStore.dtos;
import com.aasim.electonic.store.ProjectElectronicStore.validate.ImageNameValid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto{

    private String userId;

    @Size(min = 3 , max = 20 , message = "Invalid Name !!")

    private String name;

//    @Email(message = "Invalid User Email !!")
    @Pattern(regexp = "^[a-z0-9][-a-z0-9]+@([-a-z0-9]+\\.)+[a-z]{2,5}$" ,message = "Invalid User Email")
    @NotBlank(message = "Email is Required")
    private String email;

    @NotBlank(message = "Password is Required !!")
    private String password;

    @Size(min = 4 , max = 6 , message = "Invalid Gender")
    private String gender;

    @NotBlank(message = "Write something about yourself")
    private String about;

    @ImageNameValid
    private String imageName;

    private Set<RoleDto> roles =new HashSet<>();



}

//  For any Query Contact : aasimahsan77@gmail.com
