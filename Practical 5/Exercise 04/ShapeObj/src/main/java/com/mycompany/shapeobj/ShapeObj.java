

package com.mycompany.shapeobj;
public class ShapeObj 
{

    public static void main(String[] args) 
    {
       Circle c=new Circle(7.0);
               double circleArea = c.calculateArea();
               c.display();
               System.out.println("Area of the circle: "+circleArea);
        
               Rectangle r=new Rectangle(6.0,5.0);
               double rectangleArea = r.calculateArea();
               r.display();
               System.out.println("Area of the Rectangle: "+rectangleArea);
               
    }
}
