package com.aasim.electonic.store.ProjectElectronicStore.repositories;

import com.aasim.electonic.store.ProjectElectronicStore.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem , Integer> {

}
