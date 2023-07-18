package org.example.services;

import org.example.entities.Account;
import org.example.repositories.DataRepository;

import javax.accessibility.AccessibleAction;
import java.util.List;
import java.util.Objects;

public class toStringServices {


    public String toStringData(DataRepository dataRepository) {
        Account account =  dataRepository.findData();
        final String id = "ID";
        final String date = "Date";
        final String sum = "amount";
        final String comment = "info";
        final String type = "p-nt type";

        var stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("Full name : %s %s %s %n", account.getPerson().getName(), account.getPerson().getSurname(), account.getPerson().getPatronymic()))
                        .append(String.format("| %10s | %19s | %15s | %20s | %10s | %n", id, date, sum, comment, type));
        account.getBills().forEach(bill -> stringBuilder.append(String.format("| %10d | %5td %5tB %5tY | %15d | %20s |            | %n", bill.getId(), bill.getDate(), bill.getDate(), bill.getDate(), bill.getSum(), bill.getComment())));

       account.getPayments().forEach(payment -> stringBuilder.append(String.format("| %10d | %5td %5tB %5tY | %15d | %20s | %10s | %n", payment.getId(), payment.getDate(), payment.getDate(), payment.getDate(), payment.getSum(), Objects.toString(payment.getComment(), "no info"), payment.getType().getSysname())));

        return stringBuilder.toString();
    }
}
