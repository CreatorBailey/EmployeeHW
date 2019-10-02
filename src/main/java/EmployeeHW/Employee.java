package EmployeeHW;

public class Employee {
    protected String firstName;
    protected String lastName;
    protected int employeeID;
    protected int bonus;

    public Employee (String firstName, String lastName, int employeeID, int bonus){
        this.firstName=firstName;
        this.lastName=lastName;
        this.employeeID=employeeID;
        this.bonus = bonus;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public double payCheck(int employeePayCheck){
        return employeePayCheck + bonus;
    }

    public int bonusAlert(int bonus){
        return bonus;
    }

    public String printEmployeeFullName(){
        return firstName + " " + lastName;
    }
}


