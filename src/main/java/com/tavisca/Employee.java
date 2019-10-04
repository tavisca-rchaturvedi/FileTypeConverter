package com.tavisca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
    long id;
    String firstName;
    String lastName;
    List<String> hobbies;


    public Employee(){
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.hobbies = new ArrayList<>();
    }

    public Employee(long id, String firstName, String lastName, List<String> hobbies) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hobbies = hobbies;
    }
}
