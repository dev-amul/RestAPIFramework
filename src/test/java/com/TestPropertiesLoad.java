package com;

import com.API_Testing.utitlites.MasterController;

public class TestPropertiesLoad {
    public static void main(String[] args) {
        System.out.println(MasterController.loadProperties().getProperty("baseurl"));
    }
}
