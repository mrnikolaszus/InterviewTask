package org.example.services;

import org.example.entities.Account;
import org.example.repositories.DataRepository;

import javax.accessibility.AccessibleAction;
import java.util.Objects;

public class toStringServices {

    public toStringServices(DataRepository dataRepository) {
        Account account =  dataRepository.findData();

        String id = "ID";
        String date = "Date";
        String sum = "amount";
        String comment = "info";
        String type = "p-nt type";

        System.out.printf("Full name : %s %s %s %n", account.getPerson().getName(), account.getPerson().getSurname(), account.getPerson().getPatronymic());
        System.out.printf("| %10s | %19s | %15s | %20s | %10s | %n", id, date, sum, comment, type);
        account.getBills().forEach(bill -> System.out.printf("| %10d | %5td %5tB %5tY | %15d | %20s |            | %n", bill.getId(), bill.getDate(), bill.getDate(), bill.getDate(), bill.getSum(), bill.getComment()));
        account.getPayments().forEach(payment -> System.out.printf("| %10d | %5td %5tB %5tY | %15d | %20s | %10s | %n", payment.getId(), payment.getDate(), payment.getDate(), payment.getDate(), payment.getSum(), Objects.toString(payment.getComment(), "no info"), payment.getType().getSysname()));





    }
}
