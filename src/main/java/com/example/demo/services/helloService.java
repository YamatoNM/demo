package com.example.demo.services;
import  com.example.demo.constants.AppConstant;

public class helloService {
    public helloService(){
        AppConstant appConstant = new AppConstant();
    }
    public String getMessage(){
        return AppConstant.HelloMessage;
    }
}
