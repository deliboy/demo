package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.*;

@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class AEntity implements  Serializable{
    @Id
    @GeneratedValue
    protected long id;
}