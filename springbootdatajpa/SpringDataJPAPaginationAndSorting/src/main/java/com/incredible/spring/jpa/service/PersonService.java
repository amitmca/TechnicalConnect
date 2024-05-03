package com.incredible.spring.jpa.service;

import com.incredible.spring.jpa.entity.Person;
import com.incredible.spring.jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Transactional
    public List<Person> savePersons(List<Person> persons) {
        return personRepository.saveAll(persons);
    }
}