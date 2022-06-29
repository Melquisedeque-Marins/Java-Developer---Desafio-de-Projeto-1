package com.melck.personapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.melck.personapi.entity.Person;
import com.melck.personapi.repository.PersonRepository;
import com.melck.personapi.services.exceptions.ObjectNotFoundException;

@Service
public class PersonService {
    
    @Autowired
    private PersonRepository personRepository;

    public Person findById(Long id){
       Optional<Person> p = personRepository.findById(id);
       return p.orElseThrow(() -> new ObjectNotFoundException("O Objeto com id: " + id + " não foi encontrado"));       }

    public Person create(Person person) {
        person.setId(null);
        return personRepository.save(person);
    }

    public List<Person> findAll() {
        List<Person> list = personRepository.findAll();

        return list;
    }
}
