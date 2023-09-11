// package CombiningCompAndInherit;

// public class CommissionCompensationModel implements CompensationModel {

// private double grossSales;

// private double commissionRate;

// public CommissionCompensationModel(double grossSales, double commissionRate) {

// this.grossSales = grossSales;

// this.commissionRate = commissionRate;

// }

// @Override

// public double earnings() {

// return grossSales * commissionRate;

// }

// @Override

// public double calculatePayment() {

// // TODO Auto-generated method stub

// return 0;

// }

// }
package CombiningCompAndInherit;

public class CommissionCompensationModel implements CompensationModel, Payable {

    private double grossSales;
    private double commissionRate;

    public CommissionCompensationModel(double grossSales, double commissionRate) {
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    //@Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String getCompensationModel() {
        return "Commission";
    }

    @Override
    public double calculatePayment() {
        return earnings(); // Calculate payment based on earnings
    }
}
