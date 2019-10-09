package com.tavisca.converter;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.tavisca.Department;
import com.tavisca.Departments;
import com.tavisca.EmpDept;
import com.tavisca.JoinEmployeeAndDept;


import java.io.File;

public class CSVConverter implements Converter {
    @Override
    public void convert(Departments departments) {
        CsvMapper obj = new CsvMapper();
        try{
            CsvSchema schema = obj.schemaFor(EmpDept.class).withHeader();
            obj.writer(schema).writeValue(new File("CSVOutput.csv"), JoinEmployeeAndDept.empDepts);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
