package com.example.demo.entity;

import java.io.Serializable;
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
public class Rsvn implements Serializable{
    
    @Id
    @GeneratedValue
    long id;

    @Column(name = "createTime")
    LocalDateTime createTime;

    @Column(name = "checkInTime")
    LocalDateTime checkInTime;

    @Column(name = "checkOutTime")
    LocalDateTime checkOutTime;

    @Column(name = "serviceDate")
    LocalDate serviceDate;

}
