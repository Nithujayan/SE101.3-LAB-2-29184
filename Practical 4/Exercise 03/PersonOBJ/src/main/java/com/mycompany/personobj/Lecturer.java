
package com.mycompany.personobj;
public class Lecturer extends Person
{
    private String programme;
    
    public Lecturer(int id,String name,String pro)
    {
        super(id,name);
        this.programme=pro;
    }
    public String getProgramme()
    {
        return programme;
    }
}
