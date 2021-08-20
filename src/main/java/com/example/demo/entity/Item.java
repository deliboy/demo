package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.*;
@Getter
@Setter
@ToString
@Entity
public class Item extends ACode  {

      String name;
      @ManyToOne
      Category category;
    
}