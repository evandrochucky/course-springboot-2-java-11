package com.casa.ze.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casa.ze.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
