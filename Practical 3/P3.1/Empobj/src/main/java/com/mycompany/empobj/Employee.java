
package com.mycompany.empobj;
public class Employee 
{
    private String Name;
    private int Age;
    private float Salary;
    
    public Employee(String name,int age,float salary)
    {
       this.Name=name;    
       this.Age=age;
       this.Salary=salary;
    }
    public String getName()
    {
        return Name;
    }
     
    public int getAge()
    {
        return Age;
    }
     
    public float getSalary()
    {
        return Salary;
    }
}
