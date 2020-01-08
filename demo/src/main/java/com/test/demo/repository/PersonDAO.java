package com.test.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.entity.Person;

@Repository
public interface PersonDAO extends CrudRepository<Person, Long> {
 
  //  public List<Person> findByFullNameLike(String name);
 
 
}
