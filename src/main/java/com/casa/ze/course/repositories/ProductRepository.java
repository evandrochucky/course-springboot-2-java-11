package com.casa.ze.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casa.ze.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
