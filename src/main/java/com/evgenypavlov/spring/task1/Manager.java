package com.evgenypavlov.spring.task1;


public class Manager extends Employee{

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public static void raiseSalaryForAllExceptManagers(Employee[] employees, double percentage) {
        if (percentage == 0 || percentage < 0){
            throw  new IllegalArgumentException(
                    "процент не может быть меньше нуля или юыть равеен нулю");
        }
        for (Employee employee : employees){
            if (!(employee instanceof Manager)){
                employee.raiseSalary(percentage);
            }
        }
    }


}
