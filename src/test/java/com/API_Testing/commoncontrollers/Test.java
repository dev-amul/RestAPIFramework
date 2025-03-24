package com.API_Testing.commoncontrollers;

import com.API_Testing.utitlites.MasterController;

import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        Properties pr =MasterController.loadProperties();
        System.out.println(pr.getProperty("env"));
    }
}
