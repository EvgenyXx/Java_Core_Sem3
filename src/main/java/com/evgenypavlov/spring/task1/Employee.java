package com.evgenypavlov.spring.task1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    private String name;
    private double salary;

    public void raiseSalary(double percentage) {
        this.salary *= (1 + percentage / 100);
    }
}
