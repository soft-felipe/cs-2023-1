package org.example._04;

public class Employee {

    double salary;
    double awards;

    public Employee(double salary, double awards) {
        this.salary = salary;
        this.awards = awards;
    }

    public double getAwards() { return awards; }

    public void employeeMethod() {
        double yearlySalary = getYearlySalary();
        double monthlySalary = getMonthlySalary(yearlySalary);
    }

    public double getYearlySalary() { return salary * 12; }

    public double getMonthlySalary(double yearlySalary) {
        return (yearlySalary + this.awards) / 12;
    }
}
