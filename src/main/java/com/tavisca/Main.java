package com.tavisca;

import com.tavisca.converter.CSVConverter;
import com.tavisca.converter.Converter;
import com.tavisca.converter.JSONConverter;
import com.tavisca.converter.XMLConverter;
import com.tavisca.input.JSONInput;

public class Main {

    public static void main(String[] args){
        JSONInput jsonInput = new JSONInput();
        Employees employees = new Employees();
        employees.setEmployees(jsonInput.input());

        Converter converter = new JSONConverter();
        converter.convert(employees);
    }

}
