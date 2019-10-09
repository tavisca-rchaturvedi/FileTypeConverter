package com.tavisca;

import com.tavisca.converter.CSVConverter;
import com.tavisca.converter.Converter;
import com.tavisca.converter.JSONConverter;
import com.tavisca.converter.XMLConverter;
import com.tavisca.input.DepartmentInput;
import com.tavisca.input.DepartmentInputInterface;
import com.tavisca.input.EmployeeInput;
import com.tavisca.input.EmployeeInputInterface;

public class Main {

    public static void main(String[] args){
        EmployeeInputInterface employeeInput = new EmployeeInput();
        Employees employees = new Employees();
        employees.setEmployees(employeeInput.input());

        DepartmentInputInterface departmentInput = new DepartmentInput();
        Departments departments = new Departments();
        departments.setDepartments(departmentInput.input());

        departments = JoinEmployeeAndDept.Join(departments, employees);

        Converter converter = new XMLConverter();
        converter.convert(departments);
    }

}
