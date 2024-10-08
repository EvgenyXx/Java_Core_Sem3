package com.evgenypavlov.spring.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Employee {
    private String name;
    private int year;
    private int month;
    private int day;


    public int compareDates(Employee other){
        if (other == null){
            throw new IllegalArgumentException("error");
        }

        int yearDiff = this.year - other.year;
        if (yearDiff != 0){
            return yearDiff;
        }

        int monthDiff = this.month - other.month;
        if (month !=0){
            return monthDiff;
        }
        return this.day - other.day;
    }
}
