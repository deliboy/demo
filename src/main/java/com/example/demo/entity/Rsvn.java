package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name="rsvn")
@Getter
@Setter
@ToString
public class Rsvn extends AEntity     {
    
    @Id
    @GeneratedValue
    long id;

    LocalDateTime createTime;

    LocalDateTime checkInTime;

    LocalDateTime checkOutTime;

    LocalDate serviceDate;

}