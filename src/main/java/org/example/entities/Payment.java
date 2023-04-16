package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Long id;

    // Сумма пополнения в копейка
    private Long sum;

    // Дата операции пополнения
    private LocalDate date;

    // Комментарий к операции
    private String comment;

    // Способ пополнения
    private PaymentType type;
}
