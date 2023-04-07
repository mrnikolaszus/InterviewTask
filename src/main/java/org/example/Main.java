package org.example;

import org.example.services.DataService;

public class Main {

    public static void main(String[] args) {

        Object convertedData = new DataService().getConvertedData();

        System.out.println(convertedData.toString());
    }
}