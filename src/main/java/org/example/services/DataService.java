package org.example.services;

import org.example.entities.Account;
import org.example.repositories.DataRepository;

public class DataService {

    private final DataRepository dataRepository =  new DataRepository();

    public Object getConvertedData() {

        Account data = dataRepository.findData();

        return null;
    }
}
