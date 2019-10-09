package com.tavisca.input;
//import jdk.nashorn.internal.parser.JSONParser;
import com.tavisca.Department;
import com.tavisca.Employee;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class JSONInput implements Input {
    @Override
    public List<Employee> input() {
        List<Employee> employees = new ArrayList<>();
        try {
            Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));
            JSONArray ja = (JSONArray) obj;
            ListIterator jo = ja.listIterator();

            while(jo.hasNext()){
                JSONObject job = (JSONObject) jo.next();
                String firstName = (String) job.get("firstName");
                String lastName = (String) job.get("lastName");
                long id = (Long) job.get("empID");
                JSONObject empDept =  (JSONObject) job.get("dept");
                employees.add(new Employee(id, firstName, lastName, new Department((long)empDept.get("id"), (String)empDept.get("name"))));
            }


        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return employees;
    }
}
