package EmployeeHW;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee ("Yeliab", "Swehtam", 6969, 2000, 100);
        System.out.println("The Salaried Employee earned " + salariedEmployee.payCheck(2000));
        System.out.println("Salaried Employee got a Bonus of " + salariedEmployee.bonusAlert(100) + " and now earns " + salariedEmployee.payCheck(2000)
                + " Congratulations to " + salariedEmployee.printEmployeeFullName());

        CommissionedEmployee commissionedEmployee = new CommissionedEmployee("Scryan", "Chaumbers", 867,1500, 80, 0);
        System.out.println("The Commissioned Employee earned " + commissionedEmployee.payCheck(165500, .15));

        BasePlusEmployee basePlusEmployee = new BasePlusEmployee("Carles", "Swans", 5309, 234567,10, 55000, 0);
        System.out.println("The Base Plus Commission Employee earned " + basePlusEmployee.payCheck(90000));
    }
}

