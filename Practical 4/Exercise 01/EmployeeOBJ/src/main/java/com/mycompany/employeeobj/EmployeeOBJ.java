

package com.mycompany.employeeobj;
public class EmployeeOBJ
{

    public static void main(String[] args) 
    {
         Employee E1=new Employee();
         E1.setId(111);
         E1.setEname("Mr.Bogdan");
         E1.setEDesignatione("Manager");
         
         System.out.println("ID:"+E1.getId());
         System.out.println("Nmae:"+E1.geteName());
         System.out.println("Designation:"+E1.getEDesignation()); 
         
         
         Employee E2=new Employee();
         E2.setId(222);
         E2.setEname("Ms.Bird");
         E2.setEDesignatione("IT manager");
         
         System.out.println("ID:"+E2.getId());
         System.out.println("Nmae:"+E2.geteName());
         System.out.println("Designation:"+E2.getEDesignation());
    }
}
