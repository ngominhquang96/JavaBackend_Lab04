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
public class Officer extends Employee {
    private float coefficient;

    public float getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public Officer() {
        super();
    }
    

    @Override
    public float salary() {
        float salary = this.salary * this.coefficient;
        return salary; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DisplayInformation() {
        super.DisplayInformation(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("coefficient" + this.coefficient);
    }

    @Override
    public void inputData() {
        super.inputData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("input coefficient");
        this.coefficient = new Scanner(System.in).nextFloat();
    }
    
    
}
