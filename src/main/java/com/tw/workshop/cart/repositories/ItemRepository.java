package com.tw.workshop.cart.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.tw.workshop.cart.entities.Item;

@RepositoryRestResource
public interface ItemRepository extends MongoRepository<Item, String> {
}

