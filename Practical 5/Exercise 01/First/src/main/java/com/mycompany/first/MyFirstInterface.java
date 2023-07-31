
package com.mycompany.first;
public interface MyFirstInterface 
{
    public static final int x=1;
    
    public abstract void display();
} 
/*(1) You can declare the variable with/without public static final keywords. The difference between these two approaches is that if you declare the variable with public static final keywords, 
it becomes a constant and its value cannot be changed.
If you declare the variable without these keywords, it becomes a normal variable, and its value can be changed.*/

/*(2) You must declare the abstract method with the abstract keyword. 
If you don’t use the abstract keyword, it becomes a normal method, and you must provide an implementation for it. 
An abstract method is a method that has no implementation and must be implemented by any class 
that implements the interface.*/