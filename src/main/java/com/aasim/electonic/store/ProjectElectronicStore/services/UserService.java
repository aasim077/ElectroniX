package com.aasim.electonic.store.ProjectElectronicStore.services;

import com.aasim.electonic.store.ProjectElectronicStore.dtos.PageableResponse;
import com.aasim.electonic.store.ProjectElectronicStore.dtos.UserDto;
import com.aasim.electonic.store.ProjectElectronicStore.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService{


    //create
    UserDto createUser(UserDto userDto);

    //update
    UserDto updateUser(UserDto userDto , String userId);

    //delete
    void deleteUser(String userId);


    //get Single user by id
    UserDto getUserById(String userId);

   //get ALL user
    PageableResponse<UserDto> getAllUser(int pageNumber , int pageSize , String sortBy , String sortDir);

    //get single user by email
    UserDto getUserByEmail(String email);

    //search User Specific features
    List<UserDto> searchUser(String keyword);


    Optional<User> findUserByEmailOptional(String email);










}
