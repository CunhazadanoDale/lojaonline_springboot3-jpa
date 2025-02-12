package com.aprendendoweb.curso.config;


import com.aprendendoweb.curso.entities.*;
import com.aprendendoweb.curso.entities.enums.OrderStatus;
import com.aprendendoweb.curso.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Eletronics");
        Category cat2 = new Category(null, "Books");

        Product p1 = new Product(null, "PC Gamer", "All in games", 995.0, " ");
        Product p2 = new Product(null, "SmarTV", "Nulla eu imperdist", 2149.0, " ");

        User u1 = new User(null, "Cunha", "cunha12@gmail.com", "99888999", "123456");
        User u2 = new User(null, "Pedro", "pedro32@gmail.com", "8399741231", "3214");

        Order o1 = new Order(null, Instant.parse("2019-06-23T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2023-07-30T23:53:07Z"), OrderStatus.WAITING_PAYMENT, u2);

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2));
        categoryRepository.saveAll(Arrays.asList(cat1, cat2));
        productRepository.saveAll(Arrays.asList(p1, p2));

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);

        productRepository.saveAll(Arrays.asList(p1, p2));

        OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice());
        OrderItem oi2 = new OrderItem(o1, p2, 1, p2.getPrice());

        orderItemRepository.saveAll(Arrays.asList(oi1, oi2));

        Payment pay1 = new Payment(null, Instant.parse("2019-06-23T21:53:07Z"), o1 );
        o1.setPayment(pay1);

        orderRepository.save(o1);


    }
}
