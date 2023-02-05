package com.example.demo.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDate;


@Entity //For Hibernate
@Table //for Table in Database
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )




    private Long id;
    private String name, email;
    private LocalDate dob; // date of birth
    private Integer age;

    //Constructor #1
    public Student() {
    }


    //Constructor #2
    public Student(Long id, String name, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    //Constructor #3
    public Student(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }


    // Getter and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }


    /*
    README :
    In this class i only created:
     - 3 Different Constructors
     - Variables
        -Setter and Getters
        -to String method

    */






}
