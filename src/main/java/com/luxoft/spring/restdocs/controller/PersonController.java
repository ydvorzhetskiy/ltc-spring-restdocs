package com.luxoft.spring.restdocs.controller;

import com.luxoft.spring.restdocs.demo.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/person/{id}")
    public Person anyPerson(@PathVariable("id") int id) {
        return new Person(id, "Ivan", 18);
    }
}
