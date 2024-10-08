package com.evgenypavlov.spring.task2;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иван", 2023, 10, 15);
        Employee employee2 = new Employee("Петр", 2021, 10, 20);

        int result = employee1.compareDates(employee2);

        if (result < 0) {
            System.out.println("Дата рождения " + employee1.getName() + " раньше");
        } else if (result > 0) {
            System.out.println("Дата рождения " + employee2.getName() + " раньше");
        } else {
            System.out.println("Даты рождения одинаковые");
        }


    }
}
