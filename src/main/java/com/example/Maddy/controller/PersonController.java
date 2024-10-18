package com.example.Maddy.controller;

import com.example.Maddy.models.Person;
import com.example.Maddy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    public PersonService service;
    @GetMapping
    public List<Person> getAll(){
        return service.getAllPerson();
    }
    @PostMapping
    public String save(@RequestBody Person person){
        return service.insertPerson(person);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id){
        return service.deletePerson(id);
    }
}
