package com.aasim.electonic.store.ProjectElectronicStore.repositories;

import com.aasim.electonic.store.ProjectElectronicStore.entities.Cart;
import com.aasim.electonic.store.ProjectElectronicStore.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository <Cart , String>{

 Optional<Cart> findByUser(User user);


}
