package com.example.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.test.dto.Person;
import com.example.test.repository.PersonRepository;

@Service
public class PersonService {
  
  @Autowired
  public PersonRepository personRepository;
  
  public List<Person> findAllisSingle(Pageable pageable){
    List<Person> persons = personRepository.findByisSingleTrue(pageable);
    return persons;
  }
  
  public Iterable<Person> findAllSortByAge(Sort sort){
    Iterable<Person> persons = personRepository.findAll(sort);
    return persons;
  }

}
