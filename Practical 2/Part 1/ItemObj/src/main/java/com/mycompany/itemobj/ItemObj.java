package com.mycompany.itemobj;
public class ItemObj 
{

    public static void main(String[] args) 
    {
         Item e1=new Item(01,"Colombo");
         e1.DisplayItem();
     
         ////// setter getter method
        e1.setlocation(01);
        e1.setdescription("colombo");
        System.out.println("Location Number is:"+e1.getlocation());
        System.out.println("Description:"+e1.getdescription());
    }
}
