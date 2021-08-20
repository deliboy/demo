package com.example.demo.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;

import lombok.*;


@Entity
 @Table(name = "rsvn"
 , uniqueConstraints = {@UniqueConstraint(name = "uk-name-email", columnNames = { "testByte", "email" })} 
          ,
           indexes = {
                  @Index(name = "ix_a", columnList = "checkinTime, checkoutTime"),
                  @Index(name = "ix_b", columnList = "createTime, serviceDate", unique = true),
                  @Index(name = "ix_c", columnList = "testInteger") }
)
@Getter @Setter @ToString @Builder
public class Rsvn extends AEntity     {
    
    private LocalDateTime createTime;

    private LocalDateTime checkinTime;

    private LocalDateTime checkoutTime;

    private LocalDate serviceDate;

    private Byte testByte;

    private Short testShort;

    private Integer testInteger;

    private Integer testInteger2;

    private BigDecimal testBigDecimal;

    private Float testFloat;

    private Double testDouble;

    private Boolean testBoolean;

    private Date testDate;

    private Timestamp testTimespan;

    private String testString;

     @Column(length = 20, nullable =false)
     @ColumnDefault("'empty'")
     private String name;

    private String email;

}