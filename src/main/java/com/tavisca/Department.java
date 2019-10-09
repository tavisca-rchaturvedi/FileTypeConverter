package com.tavisca;

public class Department {
    public long id;
    public String name;

    public Department(){
        this.id = 0;
        this.name = "";
    }

    public Department(long id, String name){
        this.id = id;
        this.name = name;
    }
}
