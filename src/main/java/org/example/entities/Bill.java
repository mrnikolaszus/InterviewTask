package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill {

     private Long id;

     // Сумма списания в копейках
     private Long sum;

     // Дата списания
     private LocalDate date;

     // Комментарий к операции
     private String comment;
}
