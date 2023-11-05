package com.org.address.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    private Long id;
    private String streetno;
    private String homeno;
    private String city;
    private String state;
    private String country;
    private String pincode;
}
