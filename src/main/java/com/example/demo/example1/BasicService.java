package com.example.demo.example1;

public class BasicService {


    public String basicMethod(){
        return "BasicString";
    }

    public String secondBasicMethod(String vardas, String pavarde){
        if(vardas == null){
            vardas="";
        }
        if(pavarde == null){
            pavarde="";
        }

        return vardas.concat(pavarde);
    }

}
