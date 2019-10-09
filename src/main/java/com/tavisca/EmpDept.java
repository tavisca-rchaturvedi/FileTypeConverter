package com.tavisca;

public class EmpDept {
    public long id;
    public String firstName;
    public String lastName;
    public String deptName;
    public long deptId;

    public EmpDept(){
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.deptName = "";
        this.deptId = 0;
    }

    public EmpDept(long id, String firstName, String lastName, String deptName, long deptId){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptName = deptName;
        this.deptId = deptId;
    }

}
