package com.tavisca;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.json.simple.JSONObject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonPropertyOrder({"id","firstName", "lastName","hobbies"})
public class Employee {
    public long id;
    public String firstName;
    public String lastName;
    public Department empDept;


    public Employee(){
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.empDept = new Department();
    }

    public Employee(long id, String firstName, String lastName, Department empDept) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.empDept = empDept;
    }
}
