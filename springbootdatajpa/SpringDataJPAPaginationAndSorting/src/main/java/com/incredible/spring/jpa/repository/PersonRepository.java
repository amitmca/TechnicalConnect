package com.incredible.spring.jpa.repository;

import com.incredible.spring.jpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}