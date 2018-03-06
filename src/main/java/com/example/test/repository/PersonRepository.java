package com.example.test.repository;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.test.dto.Person;

public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

  List<Person> findByisSingleTrue(Pageable pageable);

}
