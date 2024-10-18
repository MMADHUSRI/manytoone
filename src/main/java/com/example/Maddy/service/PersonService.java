package com.example.Maddy.service;

import com.example.Maddy.models.Person;
import com.example.Maddy.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PersonService {
    @Autowired
    public PersonRepository repository;
    public List<Person> getAllPerson(){
        return repository.findAll();
    }
    public String insertPerson(Person person){
        repository.save(person);
        return "Person Saved Successfully";
    }
    public String deletePerson( long id){
        repository.deleteById(id);
        return "Person id is deleted successfully";

    }

}
