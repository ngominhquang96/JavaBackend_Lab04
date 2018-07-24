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
    public ArrayList<Officer> listOfficer;
    public ArrayList<Worker> listWorker;
    public ArrayList<Manager> listManager;
    public void inputListEmployee(){
        System.out.println("nhap so nhan vien");
        int number  = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap vao loai nhan vien : 1: Officer, 2: Worker, 3: Manager");
            int type = new Scanner(System.in).nextInt();
            switch (type){
                case 1:
                    Officer officer = new Officer();
                    officer.inputData();
                    listOfficer.add(officer);
                    break;
                case 2:
                    Worker worker = new Worker();
                    worker.inputData();
                    listWorker.add(worker);
                    break;
                case 3:
                    Manager manager = new Manager();
                    manager.inputData();
                    listManager.add(manager);
                    break;
            }   
        }
    }
    public void disPlayEmployee(){
         if( ! this.listOfficer.isEmpty()){
            for (int i = 0; i < this.listOfficer.size(); i++) {
                Officer office = listOfficer.get(i);
                if (office != null) {
                    System.out.println("Nhan vien van phong thu " + i );
                    office.DisplayInformation();;
                }
            }
        }
        
        if( ! this.listWorker.isEmpty()){
            for (int i = 0; i < this.listWorker.size(); i++) {
                Worker worker = listWorker.get(i);
                if (worker != null) {
                    System.out.println("Cong nhan thu  " + i );
                    worker.DisplayInformation();;
                }
            }
        }
       
        if( ! this.listManager.isEmpty()){
            for (int i = 0; i < this.listManager.size(); i++) {
                Manager manager = listManager.get(i);
                if (manager != null) {
                    System.out.println("Quan ly thu  " + i );
                    manager.DisplayInformation();;
                }
            }
        }
    }
    public Officer searchOfficerbySalary(){
        Officer officerofSalaryMax = this.listOfficer.get(0);
        for (int i = 1; i < listOfficer.size(); i++) {
            if( officerofSalaryMax.salary() < listOfficer.get(i).salary()){
                officerofSalaryMax = listOfficer.get(i);
            }
        }
        return officerofSalaryMax;
    }
     public Worker searchWorkerBySalary(){
        Worker workofSalaryMax = this.listWorker.get(0);
        for (int i = 1; i < listWorker.size(); i++) {
            if( workofSalaryMax.salary() < listWorker.get(i).salary()){
                workofSalaryMax = listWorker.get(i);
            }
        }
        return workofSalaryMax;
    }
      public Manager searchManagerBySalary(){
        Manager managerOfSalaryMax = this.listManager.get(0);
        for (int i = 1; i < listManager.size(); i++) {
            if( managerOfSalaryMax.salary() < listManager.get(i).salary()){
                managerOfSalaryMax = listManager.get(i);
            }
        }
        return managerOfSalaryMax;
    }
    public void searchEmployeeBySalaryAndGender(int numberSelectByGender){
        Officer officerByGender = new Officer();
        officerByGender.setSalary(0);
        officerByGender.setCoefficient(0);
        for (int i = 0; i < this.listOfficer.size(); i++) {
            if (this.listOfficer.get(i).gender.getCode()==numberSelectByGender){
                if(this.listOfficer.get(i).salary()>officerByGender.salary()){
                    officerByGender = this.listOfficer.get(i);
                }
            }
        }
        Worker workerByGender = new Worker();
        workerByGender.setSalary(0);
        workerByGender.setNumberOfWorkDays(0);
        for (int i = 0; i < this.listWorker.size(); i++) {
            if (this.listWorker.get(i).gender.getCode()==numberSelectByGender){
                if(this.listWorker.get(i).salary()>officerByGender.salary()){
                    workerByGender = this.listWorker.get(i);
                }
            }
        }
        
        Manager managerByGender = new Manager();
        managerByGender.setSalary(numberSelectByGender);
        managerByGender.setNumberEmployee(numberSelectByGender);
        for (int i = 0; i < this.listManager.size(); i++) {
            if (this.listManager.get(i).gender.getCode()==numberSelectByGender){
                if(this.listOfficer.get(i).salary()>officerByGender.salary()){
                    managerByGender = this.listManager.get(i);
                }
            }
        }
        float maxSalary = officerByGender.salary();
        if( workerByGender.salary() > maxSalary){
            if( workerByGender.salary() >= managerByGender.salary()){
                workerByGender.DisplayInformation();
            }else {
                managerByGender.DisplayInformation();
            }
        }else {
            if( managerByGender.salary() >= maxSalary){
                managerByGender.DisplayInformation();
            }else{
                officerByGender.DisplayInformation();
            }
        }
        
    }
    public void searchEmployeeBySalary(){
        System.out.println(" Nhập 1- để tìm kiems nhân viên có lương cao nhất theo vị trí , khác 1 - để tìm "
                + "kiếm nhân viên có lương cao nhất theo giới tính");
        int numberSelect = new Scanner(System.in).nextInt();
        if ( numberSelect == 1){
            System.out.println(" Nhập 1 để tìm nv van phòng có lương cao nhât , 0- để tìm công nhân có lương cao nhất ,"
                    + "-1 để tìm manager có lương cao nhất");
            int numberSelectByLevel = new Scanner(System.in).nextInt();
            switch (numberSelectByLevel) {
                case 1:
                    Officer officer = searchOfficerbySalary();
                    System.out.println("Nhân viên văn phòng có lương cao nhất là");
                    officer.DisplayInformation();
                    break;
                case 0 :
                    Worker worker = searchWorkerBySalary();
                    System.out.println("Công nhân có lương cao nhất");
                    worker.DisplayInformation();
                    break;
                case -1 :
                    Manager manager = searchManagerBySalary();
                    System.out.println("Manager có lương cao nhất");
                    manager.DisplayInformation();
                    break;
            }
        }else {
            System.out.println(" Nhập 1 để tìm nhân viên nam có lương cao nhất , -1 để tìm nhân viên không xác đinh giới tính "
                    + " lương cao nhất 0 để tìm nhân viên nữ có lương cao nhất ");
            int numberSelectByGender = new Scanner(System.in).nextInt();
            switch (numberSelectByGender) {
                case 1:
                    System.out.println("Nhân viên Nam có lương cao nhất là");
                    searchEmployeeBySalaryAndGender(numberSelectByGender);
                    break;
                case 0 :
                    System.out.println("Nhân viên Nữ có lương cao nhất là ");
                    searchEmployeeBySalaryAndGender(numberSelectByGender);
                    break;
                case -1:
                    System.out.println("Nhân viên Không xác định giới tính  có lương cao nhất là ");
                    searchEmployeeBySalaryAndGender(numberSelectByGender);
                    break;
                    
                    
                   
            }
        }
        
    }
    
}
