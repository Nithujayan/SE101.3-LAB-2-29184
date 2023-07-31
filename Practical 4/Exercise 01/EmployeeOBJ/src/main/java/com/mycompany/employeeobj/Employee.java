
package com.mycompany.employeeobj;
public class Employee
{
    private int empID;
    private String empName;
    private String empDesignation;
    
    public void setId(int id)
    {
        this.empID=id;        
    }
    public int getId()
    {
        return empID;
    }
    public void setEname(String ename)
    {
        this.empName=ename;     
    }
    public String geteName()
    {
        return empName;
    }
    public void setEDesignatione(String des)
    {
        this.empDesignation=des;     
    }
    public String getEDesignation()
    {
        return empDesignation;
    }
}
