/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.text.DecimalFormat;

/**
 *
 * @author mike
 */
public class Employee {
    private int number;
    private String name;
    private double baseSalary;
    private int extraHours;
    private double overtimePay;
    private double overtimeMonth;
    private double incomeTax;
    private double typeTax;
    private boolean married;
    private int numOfChildren;
    private double grossSalary;
    public boolean madeChanges = true;
    DecimalFormat format = new DecimalFormat("#.00");
 
    public Employee()
    {}
    public Employee(int number, String name) {
        this.number = number;
        this.name = name;
    }
 
    public Employee(int number, String name, double baseSalary) {
        this.number = number;
        this.name = name;
        this.baseSalary = baseSalary;
    }
 
    public Employee(int number, String name, double baseSalary, boolean married, int numOfChildren) {
        this.number = number;
        this.name = name;
        this.baseSalary = baseSalary;
        this.married = married;
        this.numOfChildren = numOfChildren;
    }
 
    public void setNumber(int number) {
        this.number = number;
    }
 
    public int getNumber() {
        return number;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
 
    public double getBaseSalary() {
        return baseSalary;
    }
 
    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }
 
    public double getOvertimePay() {
        return overtimePay;
    }
 
    public void overtimeMonth(double overtimeMonth) {
        this.overtimeMonth = overtimeMonth;
    }
 
    public double getOvertimeMonth() {
        return overtimeMonth;
    }
 
    public void setNumOfChildren(int numOfChildren) {
        this.numOfChildren = numOfChildren;
    }
 
    public int getNumOfChildren() {
        return numOfChildren;
    }
 
    public void setMarried(boolean married) {
        this.married = married;
    }
 
    public boolean getMarried() {
        return married;
    }
 
    public void setIncomeTax(int incomeTax) {
        this.incomeTax = incomeTax;
    }
 
    public double getIncomeTax() {
        return incomeTax;
    }
 
    public double getGrossSalary() {
        return grossSalary;
    }
 
    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
   
    public void setExtraHours(int extraHours){
        this.extraHours = extraHours;
    }
   
    public int getExtraHours(){
        return extraHours;
    }
    public double grossSalary(double baseSalary) {
        return (baseSalary * incomeTax) / 100;
    }
 
    public void calculateTax() {
        if (married) {
            typeTax = typeTax - (2 + numOfChildren);
        } else {
            typeTax = typeTax - numOfChildren;
        }
 
        if (typeTax < 0) {
            typeTax = 0;
            incomeTax = baseSalary;
        } else {
            incomeTax = (baseSalary * typeTax) / 100;
        }
    }
    
      public void calculateTypeTax() {
        if (baseSalary > 0.01 && baseSalary <= 496.07) {
            typeTax = 1.92;
        } else if (baseSalary > 496.08 && baseSalary <= 4210.41) {
            typeTax = 6.40;
        } else if (baseSalary > 4210.42 && baseSalary <= 7399.42) {
            typeTax = 10.88;
        } else if (baseSalary > 7399.43 && baseSalary <= 8601.50) {
            typeTax = 16.00;
        } else if (baseSalary > 8601.51 && baseSalary <= 10298.35) {
            typeTax = 17.92;
        } else if (baseSalary > 10298.36 && baseSalary <= 20770.29) {
            typeTax = 21.36;
        } else if (baseSalary > 20770.30 && baseSalary <= 32736.83) {
            typeTax = 23.52;
        } else if (baseSalary > 32736.84 && baseSalary <= 62500) {
            typeTax = 30.00;
        } else if (baseSalary > 62500 && baseSalary <= 83333.33) {
            typeTax = 32.00;
        } else if (baseSalary > 83333.34 && baseSalary <= 250000) {
            typeTax = 34.00;
        } else if (baseSalary > 250000) {
            typeTax = 35.00;
        }
 
    }
 
 
    public void calculateGrossSalary() {
        double test = typeTax * baseSalary / 100;
        grossSalary = (baseSalary - test) + overtimePay;
    }
   
    public void calculateOvertimePay(){
        double payPerHour = baseSalary / 2;
        payPerHour = payPerHour / 15;
        payPerHour = payPerHour / 8;
       
        overtimePay = (extraHours * payPerHour) * 2;
       
    }
    
    public String showList()
    {
        String printList = "";
        for(int i = 0; i<Ventana.list.length; i++)
        {
            if(Ventana.list[i] != null)
            {
                printList += Ventana.list[i].toString();
            }
        }
        return printList;
    }
    
    public String showKidsList()
    {
        String kidList = "";
        for(int i = 0; i<Ventana.list.length; i++)
        {
            if(Ventana.list[i] != null && (Ventana.list[i].getNumOfChildren() > 3))
            {
                kidList += Ventana.list[i].toString();
            }  
        }
        return kidList;
    } 
   
    public String showMarriedEmployees()
    {
        String marriedList = "";
        for(int i = 0; i<Ventana.list.length; i++)
        {
            if(Ventana.list[i] != null&& Ventana.list[i].getMarried())
            {
                marriedList += Ventana.list[i].toString();
            }
        }
        return marriedList;
    }
    public String showTotalOverPay()
    {
        String overPayList = "";
        double total =0;
        for(int i = 0; i<Ventana.list.length; i++)
        {
            if(Ventana.list[i] != null )
            {
                overPayList += Ventana.list[i].toStringPayList(i);
                total += Ventana.list[i].getOvertimePay();
            }
        }
        overPayList += "Total: " + total;
           return overPayList;

    }
    public String toStringPayList(int count)
     {
         return"Employee Number: " + Ventana.list[count].getNumber() + "\nEmployee name: " +  Ventana.list[count].getName() + "\nOvertime pay: $" + Ventana.list[count].getOvertimePay() + "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-"+"\n";
      }
    
    public String toString() {
        String printMarried="";
        if(married == true)
        {
            printMarried = "The employee is married";
        }
        else
        {
            printMarried="The employee isn't married";
        }
	return "Employee Number: " + number + "\nEmployee name: " + name 
        		+ "\nSalary: $" + baseSalary + "\n"
                + "Overtime pay: $" + format.format(overtimePay) 
                + "\nGross Salary: $" + format.format(grossSalary)
                + "\nMarried: " + married + "\nNumber of children: "
                + numOfChildren + "\nType Tax: "
                + format.format(typeTax) +"%"+ "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n";
	}
}   


