package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.*;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Getter
@Setter
@ToString
@Inheritance(strategy =  InheritanceType.TABLE_PER_CLASS)
@Entity

public abstract class ACode extends AEntity   {


    @Column
    protected String code;
    @Column
    protected String desp;
}

