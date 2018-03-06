package com.example.test.rest;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.test.dto.Person;
import com.example.test.repository.PersonRepository;
import com.example.test.service.PersonService;


@RestController
@RequestMapping("/api")
public class PersonResource {
  
  @Autowired
  public PersonRepository personRepository;
  
  @Autowired
  public PersonService personService;
  
  @PostMapping("/person")
  public void createPerson(@RequestBody Person person) {
    personRepository.save(person);
  }
  
  @PutMapping("/person")
  public void updatPerson(@RequestBody Person person) {
    personRepository.save(person);
  }
  
  @GetMapping("/{id}/person")
  public Optional<Person> getPerson(@PathVariable Long id) {
    return personRepository.findById(id);
  }
  
  @DeleteMapping("/{id}/person")
  public void delteperson(@PathVariable Person id) {
    personRepository.delete(id);
  }
  
  @GetMapping("/person")
  public Iterable<Person> getAllPerson(Pageable pageable){
    return personRepository.findAll(pageable);
  } 
  
  @GetMapping("/person/isSingle")
  public Iterable<Person> getAllisSingle(Pageable pageable){
    List<Person> persons = personService.findAllisSingle(pageable);
    return persons;
  }
  
  @GetMapping("/person/sort")
  public Iterable<Person> getAllAge(Sort sort){
    Iterable<Person> persons = personService.findAllSortByAge(sort);
    return persons;
  }

}
