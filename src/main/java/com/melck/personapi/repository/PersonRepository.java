package com.melck.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.melck.personapi.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
