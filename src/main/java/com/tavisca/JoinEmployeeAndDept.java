package com.tavisca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JoinEmployeeAndDept {

    public static List<EmpDept> empDepts = new ArrayList<EmpDept>();
    public static Departments Join(Departments departments, Employees employees){
        departments.getDepartments().stream().forEach(department -> {
            EmpDept empDept = new EmpDept();
            empDept.deptId = department.deptId;
            empDept.deptName = department.name;
            List<Employee> employeeList = new ArrayList<Employee>();
            List<Employee> filteredList = employees.getEmployees().stream().filter(employee -> employee.deptId == department.deptId).collect(Collectors.toList());

            filteredList.forEach(employee -> {
                System.out.println(employee.id);
                employeeList.add(employee);
                EmpDept temp = new EmpDept();
                temp.deptName = department.name;
                temp.deptId = department.deptId;
                temp.firstName = employee.firstName;
                temp.lastName = employee.lastName;
                temp.id = employee.id;
                empDepts.add(temp);
            });
            if(filteredList.size() == 0)
                empDepts.add(empDept);

            department.employees =(ArrayList<Employee>)employeeList;
        });

        return departments;
    }
}
