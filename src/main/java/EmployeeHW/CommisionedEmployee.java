package EmployeeHW;

class CommissionedEmployee extends Employee {
    protected int grossSales;
    protected double commissionRate;

    public CommissionedEmployee(String firstName, String lastName,
                                int employeeID, int grossSales,
                                double commissionRate, int bonus) {
        super(firstName, lastName, employeeID, bonus);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double payCheck(int grossSales, double commissionRate) {
        return grossSales * commissionRate + bonus;
    }

    public String printEmployeeFullName(){
        return firstName + " " + lastName;
    }
}

