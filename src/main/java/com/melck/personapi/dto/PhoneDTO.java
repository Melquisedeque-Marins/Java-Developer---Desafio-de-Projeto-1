package com.melck.personapi.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.melck.personapi.enums.PhoneType;

public class PhoneDTO {
    
    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotEmpty
    @Size(min = 13, max = 14, message = "Formato de telefone não suportado")
    private String number;


    public PhoneDTO() {
    }


    public PhoneDTO(Long id, PhoneType type, String number) {
        this.id = id;
        this.type = type;
        this.number = number;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public PhoneType getType() {
        return type;
    }


    public void setType(PhoneType type) {
        this.type = type;
    }


    public String getNumber() {
        return number;
    }


    public void setNumber(String number) {
        this.number = number;
    }

    
    
    
}
