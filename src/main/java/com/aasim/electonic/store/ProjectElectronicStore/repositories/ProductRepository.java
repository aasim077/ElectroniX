package com.aasim.electonic.store.ProjectElectronicStore.repositories;

import com.aasim.electonic.store.ProjectElectronicStore.entities.Category;
import com.aasim.electonic.store.ProjectElectronicStore.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
    //SEARCH
    Page<Product> findByTitleContaining(String subtitle ,Pageable pageable);
    Page<Product> findByLiveTrue(Pageable pageable);

    Page<Product> findByCategory(Category category , Pageable pageable);




    //others requirement we can add here




}



