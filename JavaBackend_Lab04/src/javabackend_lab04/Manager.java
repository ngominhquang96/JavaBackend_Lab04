/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend_lab04;

import java.util.Scanner;

/**
 *
 * @author ngomi
 */
public class Manager extends Employee {
    private int NumberEmployee;

    public int getNumberEmployee() {
        return NumberEmployee;
    }

    public void setNumberEmployee(int NumberEmployee) {
        this.NumberEmployee = NumberEmployee;
    }

    public Manager() {
        super();
    }

    @Override
    public void DisplayInformation() {
        super.DisplayInformation(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Number Employee" + this.NumberEmployee);
    }

    @Override
    public void inputData() {
        super.inputData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("input Number Employee");
        this.NumberEmployee = new Scanner(System.in).nextInt();
    }

    @Override
    public float salary() {
        float salary;
        if ( this.NumberEmployee <10 ){
            salary = this.salary + 500;
        }else {
            if( this.NumberEmployee < 20)
                salary = this.salary + 1000;
            else
                salary = this.salary + 2000;
        }
        
        return salary(); //To change body of generated methods, choose Tools | Templates.
    }

    
    

    
}
