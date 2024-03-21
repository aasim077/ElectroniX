package com.aasim.electonic.store.ProjectElectronicStore.repositories;

import com.aasim.electonic.store.ProjectElectronicStore.entities.Order;
import com.aasim.electonic.store.ProjectElectronicStore.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, String> {

    List<Order> findByUser(User user);


}
