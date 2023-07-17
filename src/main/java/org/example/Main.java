package org.example;

import org.example.entities.Account;
import org.example.repositories.DataRepository;
import org.example.services.DataService;
import org.example.services.toStringServices;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        
        Object convertedData = new DataService().getConvertedData();



    }
}