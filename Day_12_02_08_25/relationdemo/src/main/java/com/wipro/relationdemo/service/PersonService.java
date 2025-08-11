package com.wipro.relationdemo.service;

import java.util.List;

import com.wipro.relationdemo.entity.Person;

public interface PersonService {
    Person save(Person person);
    List<Person> findAll();

}
