package com.tavisca.input;

import com.tavisca.Department;
import com.tavisca.Employee;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DepartmentInput implements DepartmentInputInterface {
    @Override
    public List<Department> input() {
        List<Department> departments = new ArrayList<>();
        try {
            Object obj = new JSONParser().parse(new FileReader("Dept.json"));
            JSONArray ja = (JSONArray) obj;
            ListIterator jo =  ja.listIterator();
            while(jo.hasNext()){
                JSONObject job = (JSONObject) jo.next();
                String deptName = (String) job.get("name");
                long id = (Long) job.get("deptId");
                departments.add(new Department(id, deptName, new ArrayList<Employee>()));
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return departments;
    }
}
