package CombiningCompAndInherit;

public class HourlyCompensationModel implements CompensationModel, Payable {

    private double wage;
    private double hours;

    public HourlyCompensationModel(double wage, double hours) {
        this.wage = wage;
        this.hours = hours;
    }

    
    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            double overtimeHours = hours - 40;
            return (wage * 40) + (overtimeHours * wage * 1.5);
        }
    }

    @Override
    public double calculatePayment() {
        return earnings(); // Calculate payment based on earnings
    }

    @Override
    public String getCompensationModel() {
        return "Hourly"; // Return the compensation model name
    }
}
