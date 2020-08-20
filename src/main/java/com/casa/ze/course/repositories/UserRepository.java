package com.casa.ze.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casa.ze.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
