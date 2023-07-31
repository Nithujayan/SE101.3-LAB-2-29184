
package com.mycompany.employeenewobj;
public class Employeenew 
{
    private String EmpName;
    private float BSalary;
    private float Bonus;
    private float BonusAmount;
    
    public void setEname(String ename)
    {
        this.EmpName=ename;        
    }
    public String getName()
    {
        return(EmpName);
    }
    public void setBSalary(float bsalary)
    {
        this.BSalary=bsalary;        
    }
    public float getBSalary()
    {
       return(BSalary);
    }
    public Employeenew (float  bonus)
    {
        this.Bonus=bonus;
    }
    public void FindBonusAmount()
    {
        System.out.println("Bonus: "+Bonus);
       BonusAmount=BSalary+Bonus; 
        System.out.println("Bonus Amount:"+BonusAmount);
    }
}
