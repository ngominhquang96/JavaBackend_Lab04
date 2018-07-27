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
public class Employee {
    protected static int idCurrent = 1;
    protected int id;
    protected String name;
    protected Gender gender;
    protected float salary;

    public static int getIdCurrent() {
        return idCurrent;
    }

    public static void setIdCurrent(int idCurrent) {
        Employee.idCurrent = idCurrent;
    }

    public int getId() {
        return id;
    }

    public final void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Employee() {
        this.id = idCurrent;
        idCurrent++;
    }
    
    public void inputData(){
        System.out.println("input name ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("input gender");
        int gender = new Scanner(System.in).nextInt();
        switch (gender){
            case 1:
                this.gender = Gender.NAM;
                break;
            case 0:
                this.gender = Gender.NU;
                break;
            case -1:
                this.gender = Gender.KHONG_XAC_DINH;
        }
        System.out.println("input salary");
        this.salary = new Scanner(System.in).nextFloat();
    }
    public void displayInformation(){
        System.out.println("id :" + this.id + "name :" + this.name + "gender :" + this.gender.getName());
    }
    public float salary(){
        float salary = 0;
        return salary;
    }
    
}
