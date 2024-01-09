package com.example.projectshopping.model.repository;

import com.example.projectshopping.model.entities.order.Order;
import com.example.projectshopping.model.enums.OrderStatus;
import java.util.Optional;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface OrderRepository {


    // Filter orders by customer ID
    List<Order> findAllOrdersByUserId(long userId);

    // Filter orders by status
    List<Order> findAllByOrderStatus(OrderStatus orderStatus);

    // Filter orders by date created between specified dates
    List<Order> findAllByDateCreatedBetween(LocalDate fromDate, LocalDate toDate);

    // Retrieves an order by its ID
    Optional<Order> findById(long id);

    // Saves an order to the database
    Order save(Order order);

    // Deletes an order from the database
    void delete(Order order);

    // Filters orders by total amount greater than a specified value
    List<Order> findAllByTotalPriceGreaterThan(BigDecimal totalPrice);

    // Filters orders by total amount less than a specified value
    List<Order> findAllByTotalPriceLessThan(BigDecimal totalPrice);

    // Filters orders by total amount between specified values
    List<Order> findAllByTotalPriceBetween(BigDecimal fromPrice, BigDecimal toPrice);

    List<Order> findAll();

    // Filters orders by total amount greater than a specified value and sorts them by date created in descending order

}