package com.tavisca.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.tavisca.Employee;
import com.tavisca.Employees;
import com.tavisca.writer.FileWriter;

import java.io.File;
import java.util.Collection;

public class CSVConverter implements Converter {
    @Override
    public void convert(Employees employees) {
        CsvMapper obj = new CsvMapper();
        try{
            CsvSchema schema = obj.schemaFor(Employee.class).withHeader();
//            CsvSchema schema = CsvSchema.builder().addColumn("id").addColumn("firstName").addColumn("lastName").addColumn("hobbies", CsvSchema.ColumnType.STRING).build();
            obj.writer(schema).writeValue(new File("CSVOutput.csv"),employees.getEmployees());
//            FileWriter writer = new FileWriter();
//            writer.writer(content, "CSVOutput.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
