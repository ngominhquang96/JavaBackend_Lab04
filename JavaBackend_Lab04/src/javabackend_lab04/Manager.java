/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend_lab04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ngomi
 */
public class Manager extends Employee {
    private int numberEmployee;

    public int getNumberEmployee() {
        return numberEmployee;
    }

    public void setNumberEmployee(int NumberEmployee) {
        this.numberEmployee = NumberEmployee;
    }

    public Manager() {
        super();
    }

    @Override
    public void displayInformation() {
        super.displayInformation(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Number Employee" + this.numberEmployee);
    }

    @Override
    public void inputData() {
        super.inputData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("input Number Employee");
        this.numberEmployee = new Scanner(System.in).nextInt();
    }

    @Override
    public float salary() {
        float salary;
        if ( this.numberEmployee <10 ){
            salary = this.salary + 500;
        }else {
            if( this.numberEmployee < 20)
                salary = this.salary + 1000;
            else
                salary = this.salary + 2000;
        }
        
        return salary(); //To change body of generated methods, choose Tools | Templates.
    }

   

    
}
