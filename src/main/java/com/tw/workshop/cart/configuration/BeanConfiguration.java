package com.tw.workshop.cart.configuration;

import com.tw.workshop.cart.item.ItemDAO;
import com.tw.workshop.cart.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.tw.workshop.cart.cart.CartDAO;
import com.tw.workshop.cart.entities.Cart;
import com.tw.workshop.cart.entities.Item;
import com.tw.workshop.cart.repositories.CartRepository;

import java.util.List;

@Configuration
public class BeanConfiguration {
    @Bean
    @Autowired
    public CartDAO getCartDao(CartRepository cartRepository) {
        return new CartDAO() {
            @Override
            public void delete(Cart cart) {
                cartRepository.delete(cart);
            }

            @Override
            public Cart save(Cart cart) {
                return cartRepository.save(cart);
            }

            @Override
            public List<Cart> findByCustomerId(String customerId) {
                return cartRepository.findByCustomerId(customerId);
            }
        };
    }

    @Bean
    @Autowired
    public ItemDAO getItemDao(ItemRepository itemRepository) {
        return new ItemDAO() {
            @Override
            public Item save(Item item) {
                return itemRepository.save(item);
            }

            @Override
            public void destroy(Item item) {
                itemRepository.delete(item);
            }

            @Override
            public Item findOne(String id) {
                return itemRepository.findOne(id);
            }
        };
    }
}
