package com.melck.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.melck.personapi.entity.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Long>{
    
}
