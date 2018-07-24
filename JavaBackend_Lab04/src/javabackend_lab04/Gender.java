/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend_lab04;

/**
 *
 * @author ngomi
 */
public enum Gender {
    NAM(1,"nam"),NU(0,"nu"),KHONG_XAC_DINH(-1,"khong xac dinh");
    
    private int code;
    private String name;
       private Gender(int code, String name){
        this.code = code;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
 
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    
}
