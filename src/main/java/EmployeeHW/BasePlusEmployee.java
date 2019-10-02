package EmployeeHW;

public class BasePlusEmployee extends CommissionedEmployee {
    protected int baseSalary;

    public BasePlusEmployee(String firstName, String lastName, int employeeID,
                            int grossSales, double commissionRate,
                            int baseSalary, int bonus) {
        super(firstName, lastName, employeeID, grossSales, commissionRate, bonus);
        this.baseSalary = baseSalary;
    }

    public double payCheck(int baseSalary) {
        return grossSales * commissionRate + baseSalary + bonus;
    }

    public String printEmployeeFullName() {
        return firstName + " " + lastName;
    }


}
