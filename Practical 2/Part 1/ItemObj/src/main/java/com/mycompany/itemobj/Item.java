
package com.mycompany.itemobj;
public class Item 
{
     private int location;
     private String description;
     
     public Item(int location,String description)
     {
         this.location=location;
         this.description=description;
     }
     public void DisplayItem()
     {
         System.out.println("Location Number: "+location);
         System.out.println("Description: "+description);
     }
     
     /////
     //setter method to location
    public void setlocation(int ln)
    {
        location=ln;
    }
    //getter method to location
    public int getlocation()
    {
        return location;
    }
    //setter method to description
    public void setdescription(String dn)
    {
        description=dn;
    }
    //getter method to description
    public String getdescription()
    {
        return description;
    }
     
     
}
