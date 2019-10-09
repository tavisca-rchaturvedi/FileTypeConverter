package com.tavisca.input;
//import jdk.nashorn.internal.parser.JSONParser;
import com.tavisca.Department;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class EmployeeInput implements EmployeeInputInterface {
    @Override
    public List<com.tavisca.Employee> input() {
        List<com.tavisca.Employee> employees = new ArrayList<>();
        try {
            Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));
            JSONArray ja = (JSONArray) obj;
            ListIterator jo = ja.listIterator();

            while(jo.hasNext()){
                JSONObject job = (JSONObject) jo.next();
                String firstName = (String) job.get("firstName");
                String lastName = (String) job.get("lastName");
                long id = (Long) job.get("empID");
                long deptId =(Long) job.get("deptId");
                employees.add(new com.tavisca.Employee(id, firstName, lastName, deptId));
            }




        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return employees;
    }
}
