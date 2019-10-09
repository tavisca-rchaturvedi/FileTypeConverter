package com.tavisca.converter;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.tavisca.Department;
import com.tavisca.Departments;


import java.io.File;

public class CSVConverter implements Converter {
    @Override
    public void convert(Departments departments) {
        CsvMapper obj = new CsvMapper();
        try{
            CsvSchema schema = obj.schemaFor(Department.class).withHeader();
            obj.writer(schema).writeValue(new File("CSVOutput.csv"),departments.getDepartments());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
