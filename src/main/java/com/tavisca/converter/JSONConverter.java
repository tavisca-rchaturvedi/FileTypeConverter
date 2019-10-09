package com.tavisca.converter;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tavisca.Employees;
import com.tavisca.writer.FileWriter;

import java.io.IOException;

public class JSONConverter implements Converter {
    @Override
    public void convert(Employees employees) {
        ObjectMapper obj = new ObjectMapper();
        try{
            String jsonStr = obj.writeValueAsString(employees);
            System.out.println(jsonStr);
            FileWriter writer = new FileWriter();
            writer.writer(jsonStr, "JSONOutput.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
