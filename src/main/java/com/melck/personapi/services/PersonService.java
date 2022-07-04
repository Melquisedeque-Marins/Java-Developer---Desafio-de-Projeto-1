package com.melck.personapi.services;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.melck.personapi.dto.PersonDTO;
import com.melck.personapi.dto.PhoneDTO;
import com.melck.personapi.entity.Person;
import com.melck.personapi.entity.Phone;
import com.melck.personapi.repository.PersonRepository;
import com.melck.personapi.services.exceptions.ObjectNotFoundException;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private ModelMapper modelMapper;

    public PersonService() {
    }

    public Person findById(Long id){
        Optional<Person> p = personRepository.findById(id);
        return p.orElseThrow(() -> new ObjectNotFoundException("O Objeto com id: " + id + " não foi encontrado"));       }

    public Person create(PersonDTO personDTO) {
        Person personToSave = modelMapper.map(personDTO, Person.class);
        return personRepository.save(personToSave);
    }

    public List<Person> findAll() {
        List<Person> list = personRepository.findAll();

        return list;
    }

    public void delete(Long id) {
        findById(id);
        personRepository.deleteById(id);
    }

    public Person updateById(Long id, Person person) {
        findById(id);
        Person personToUpdate = person;
        Person savedPerson = personRepository.save(personToUpdate);
        return savedPerson;
    }

}
