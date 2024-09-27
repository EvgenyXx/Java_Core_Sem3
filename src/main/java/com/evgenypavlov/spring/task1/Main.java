package com.evgenypavlov.spring.task1;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Иван", 1000);
        employees[1] = new Employee("Петр", 1500);
        employees[2] = new Manager("Мария", 2000); // Руководитель

        Manager.raiseSalaryForAllExceptManagers(employees, 10); // Повышение зарплаты на 10%

        for (Employee employee : employees) {
            System.out.println(STR."\{employee.getName()}: \{employee.getSalary()}");
        }



    }
}