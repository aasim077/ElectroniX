package com.aasim.electonic.store.ProjectElectronicStore.services;

import com.aasim.electonic.store.ProjectElectronicStore.dtos.CategoryDto;
import com.aasim.electonic.store.ProjectElectronicStore.dtos.PageableResponse;

import java.util.List;

public interface CategoryService {
    //create
    CategoryDto create(CategoryDto categoryDto);

    //update
    CategoryDto update(CategoryDto categoryDto , String categoryId);

    //delete
    void delete(String categoryId);

    //getall
    PageableResponse<CategoryDto>  getAll(int pageNumber , int pageSize ,  String sortBy , String sortDir) ;


    //getsingle detail
    CategoryDto get(String categoryId);

    //search
    List<CategoryDto> searchCategory(String keyword);


}
