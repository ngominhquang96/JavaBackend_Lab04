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
public class Worker extends Employee{
    private int numberOfWorkDays;

    public int getNumberOfWorkDays() {
        return numberOfWorkDays;
    }

    public void setNumberOfWorkDays(int numberOfWorkDays) {
        this.numberOfWorkDays = numberOfWorkDays;
    }

    public Worker() {
        super();
    }

    @Override
    public float salary() {
        float salary = (float)this.salary*this.numberOfWorkDays/26;
        return salary; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DisplayInformation() {
        super.DisplayInformation(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Number Of WorkDays: " + this.numberOfWorkDays);
    }

    @Override
    public void inputData() {
        super.inputData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("input Number Of WorkDays");
        this.numberOfWorkDays = new Scanner(System.in).nextInt();
    }
    
    
    

    
}
