package com.incredible.spring.jpa;

import com.incredible.spring.jpa.entity.Person;
import com.incredible.spring.jpa.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
public class PaginationAndSortingTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void paginationAndSortingTogether(){

        String sortBy = "name";
        String sortDir = "desc";
        int pageNo = 1;
        int pageSize = 5;

        // Sort object
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())?
                Sort.by(sortBy).ascending(): Sort.by(sortBy).descending();

        // Pageable object
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

        Page<Person> page = personRepository.findAll(pageable);

        List<Person> persons = page.getContent();

        persons.forEach((p) ->{
            System.out.println(p);
        });

        // total pages
        int totalPage = page.getTotalPages();
        // total elements
        long totalElements = page.getTotalElements();
        // number of elements
        int numberOfElements = page.getNumberOfElements();
        // size
        int size = page.getSize();

        // last
        boolean isLast = page.isLast();
        // first
        boolean isFirst = page.isFirst();
        System.out.println("total page -> " + totalPage);
        System.out.println("totalElements -> " + totalElements);
        System.out.println("numberOfElements -> " + numberOfElements);
        System.out.println(" size ->" + size);
        System.out.println(" isLast -> " + isLast);
        System.out.println(" isFirst -> " + isFirst);
    }
}