
package com.mycompany.studentobj;
final class Student  // now Student class is final class so we cant put student class as a sub class(extends)
{
    final int marks=100;
    final void display()// then we cant put the methods into the classes only in main method
    {
        System.out.println("Marks: "+marks);
    }
        
}
