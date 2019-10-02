package EmployeeHW;

public class SalariedEmployee extends Employee {

    protected int weeklySalary;

    public SalariedEmployee(String firstName, String lastName,
                            int employeeID, int weeklySalary, int bonus) {
        super(firstName, lastName, employeeID, bonus);
        this.weeklySalary = weeklySalary;
    }


    @Override
    public double payCheck(int weeklySalary) {
        return weeklySalary + bonus;
    }

    public String printEmployeeFullName(){
        return firstName + " " + lastName;
    }
}

