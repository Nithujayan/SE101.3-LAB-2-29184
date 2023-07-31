
package com.mycompany.employeenewobj;
public class EmployeenewOBj 
{

    public static void main(String[] args) 
    {
         Employeenew E1=new Employeenew(10000.00f);
        E1.setEname("Bogdan");
        System.out.println("Employee name:"+E1.getName());
        E1.setBSalary(50000);
        System.out.println("Basic Salary:"+E1.getBSalary());
        E1.FindBonusAmount();
    }
    
    
}
