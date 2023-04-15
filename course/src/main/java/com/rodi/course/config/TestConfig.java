package com.rodi.course.config;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rodi.course.entities.Category;
import com.rodi.course.entities.Order;
import com.rodi.course.entities.User;
import com.rodi.course.entities.enums.OrderStatus;
import com.rodi.course.repositories.CategoryRepository;
import com.rodi.course.repositories.OrderRepository;
import com.rodi.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
    
        List<User> listUser = new ArrayList<>();
        User u1 = new User(null,"Rodrigo Silva","rodrigo@gmail.com","999784545","123456");
        listUser.add(u1);
        User u2 = new User(null,"Fernando Silva","fernando@gmail.com","998897454","656565");
        listUser.add(u2);
        User u3 = new User(null,"Bruna Silva","bruna@gmail.com","9994545","125659593456");
        listUser.add(u3);
        User u4 = new User(null,"Patricia Silva","patricia@gmail.com","9945454","87874");
        listUser.add(u4);
        
        List<Order> listOrders = new ArrayList<>();
        listOrders.add(new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1,OrderStatus.PAID));
        listOrders.add(new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2, OrderStatus.WAITING_PAYMENT));
        listOrders.add(new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u3, OrderStatus.SHIPPED));
        listOrders.add(new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u3, OrderStatus.CANCELED));

        List<Category> listCategory = new ArrayList<>();
        Category cat1 = new Category(null, "Electronics");
        listCategory.add(cat1);
        Category cat2 = new Category(null, "Books");
        listCategory.add(cat2);
        Category cat3 = new Category(null, "Computers");
        listCategory.add(cat3);

        userRepository.saveAll(listUser);
        orderRepository.saveAll(listOrders);
        categoryRepository.saveAll(listCategory);

    }


}
