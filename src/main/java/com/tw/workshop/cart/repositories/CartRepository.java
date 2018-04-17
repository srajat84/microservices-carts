package com.tw.workshop.cart.repositories;

import com.tw.workshop.cart.entities.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(exported = false)
public interface CartRepository extends MongoRepository<Cart, String> {
    List<Cart> findByCustomerId(@Param("custId") String id);
}

