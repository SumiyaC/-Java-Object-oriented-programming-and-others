// package CombiningCompAndInherit;

// public class BasePlusCommissionCompensationModel implements CompensationModel {

// private double grossSales;

// private double commissionRate;

// private double baseSalary;

// public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {

// this.grossSales = grossSales;

// this.commissionRate = commissionRate;

// this.baseSalary = baseSalary;

// }

// @Override

// public double earnings() {

// return baseSalary + (grossSales * commissionRate);

// }

// @Override

// public double calculatePayment() {

// // TODO Auto-generated method stub

// return 0;

// }

// }
//changed//
package CombiningCompAndInherit;

public class BasePlusCommissionCompensationModel implements CompensationModel {

    private double grossSales;
    private double commissionRate;
    private double baseSalary;

    public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculatePayment() {
        return earnings();
    }

    @Override
    public String getCompensationModel() {
        return "Base Plus Commission";
    }

    public double earnings() {
        return baseSalary + (grossSales * commissionRate);
    }
}


