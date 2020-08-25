package com.casa.ze.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casa.ze.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
