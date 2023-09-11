package CombiningCompAndInherit;

public class SalariedCompensationModel implements CompensationModel {

    private double weeklySalary;

    public SalariedCompensationModel(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    
    public double earnings() {
        return weeklySalary;
    }

    @Override
    public double calculatePayment() {
        return earnings(); // Calculate payment based on earnings
    }

    @Override
    public String getCompensationModel() {
        return "Salaried"; // Return the compensation model name
    }
}
