package com.tavisca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name = "departments")
@XmlAccessorType(XmlAccessType.FIELD)
public class Departments {
    @XmlElement(name = "department")
    private List<Department> departments = null;

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
            this.departments = departments;
        }
}