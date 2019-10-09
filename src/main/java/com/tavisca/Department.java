package com.tavisca;

import java.util.ArrayList;

public class Department {
    public long deptId;
    public String name;
    public ArrayList<Employee> employees;

    public Department(){
        this.deptId = 0;
        this.name = "";
        this.employees = new ArrayList<Employee>();
    }

    public Department(long deptId, String name, ArrayList<Employee> employees){
        this.deptId = deptId;
        this.name = name;
        this.employees = employees;
    }
}
