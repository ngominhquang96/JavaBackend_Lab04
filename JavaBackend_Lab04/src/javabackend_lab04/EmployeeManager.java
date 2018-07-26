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
public class EmployeeManager {
    public ArrayList<Employee> listObject;
    public ArrayList<Integer> listIndexEmployee;
    public void inputListEmployee(){
        System.out.println("nhap so nhan vien");
        int number  = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap vao loai nhan vien : 1: Officer, 2: Worker, 3: Manager");
            int type = new Scanner(System.in).nextInt();
            switch (type){
                case 1:
                    Employee e1 =  new Officer();
                    e1.inputData();
                    listObject.add(e1);
                    listIndexEmployee.add(1);
                    break;
                case 2:
                    Employee e2 =  new Worker();
                    e2.inputData();
                    listObject.add(e2);
                    listIndexEmployee.add(2);
                    break;
                case 3:
                    Employee e3 =  new Officer();
                    e3.inputData();
                    listObject.add(e3);
                    listIndexEmployee.add(3);
                    break;
            }   
        }
    }
    public void disPlayEmployee(){
         if( ! this.listObject.isEmpty()){
            for (int i = 0; i < this.listObject.size(); i++) {
                if (listObject.get(i) != null) {
                    System.out.println("Nhan vien thu " + i );
                    listObject.get(i).displayInformation();;
                }
            }
    }
        
        
    }
    public Employee searchBySalaryAndIndexEmployee(int indexEmployee){
        Employee employee = new Employee();
        for (int i = 0; i < listIndexEmployee.size(); i++) {
            if (listIndexEmployee.get(i)==indexEmployee){
                employee = listObject.get(i);
                break;
            }
        }
        
        for (int i = 1; i < listObject.size(); i++) {
            if (listIndexEmployee.get(i)==indexEmployee){
                if(listObject.get(i).salary()>employee.salary()){
                    employee =listObject.get(i);
                }
            }
        }
        return employee;
    }
   
  
    public Employee searchBySalaryAndGender(int genderCode){
        Employee employee =new Employee();
        for (int i = 0; i < listObject.size(); i++) {
            if (listObject.get(i).gender.getCode()== genderCode){
                employee = listObject.get(i);
                break;
            }
        }
       
        for (int i = 1; i < listObject.size(); i++) {
            if (listObject.get(i).gender.getCode()==genderCode){
                if(listObject.get(i).salary()>employee.salary()){
                    employee =listObject.get(i);
                }
            }
        }
        return employee;
    }
    public void searchEmployeeBySalary(){
        System.out.println(" Nhập 1- để tìm kiems nhân viên có lương cao nhất theo vị trí , khác 1 - để tìm "
                + "kiếm nhân viên có lương cao nhất theo giới tính");
        int numberSelect = new Scanner(System.in).nextInt();
        if ( numberSelect == 1){
            System.out.println(" Nhập 1 để tìm nv van phòng có lương cao nhât , 2 để tìm công nhân có lương cao nhất ,"
                    + "3 để tìm manager có lương cao nhất");
            int indexEmployee = new Scanner(System.in).nextInt();
            Employee employee = searchBySalaryAndIndexEmployee(indexEmployee);
        }else {
            System.out.println(" Nhập 1 để tìm nhân viên nam có lương cao nhất , -1 để tìm nhân viên không xác đinh giới tính "
                    + " lương cao nhất 0 để tìm nhân viên nữ có lương cao nhất ");
            int genderCode = new Scanner(System.in).nextInt();
            Employee e = searchBySalaryAndGender(genderCode);
            e.displayInformation();
        }
        
    }
    
}
