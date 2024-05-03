package com.incredible.spring.jpa;

import com.incredible.spring.jpa.entity.Person;
import com.incredible.spring.jpa.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class BatchInsertTest {

    @Autowired
    private PersonService personService;

    @Test
    public void testBatchInsert() {
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 200; i++) {
            persons.add(new Person("Name" + i, "name" + i + "@example.com"));
        }

        personService.savePersons(persons);

        // Add assertions or further test logic as needed.
    }
}