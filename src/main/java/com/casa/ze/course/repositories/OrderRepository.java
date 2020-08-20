package com.casa.ze.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casa.ze.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
