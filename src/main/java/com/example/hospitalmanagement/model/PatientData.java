package com.example.hospitalmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.awt.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PatientData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;

    String age;

    String sex;

    String covidStatus;

    String isAdmit;

}
