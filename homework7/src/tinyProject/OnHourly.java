package tinyProject;

public class OnHourly extends Employee {
    private int paymentHour;
    private int hoursPerMonth;

    public OnHourly(int paymentHour, int hoursPerMonth, String nameAndInitials) {
        this.paymentHour = paymentHour;
        this.hoursPerMonth = hoursPerMonth;
        this.setPaymentType("почасовая");
        this.setPaymentSum(this.paymentHour * this.hoursPerMonth);
        this.setNameAndInitials(nameAndInitials);
    }

    public int getPaymentHour() {
        return paymentHour;
    }

    public void setPaymentHour(int paymentHour) {
        this.paymentHour = paymentHour;
    }

    public int getHoursPerMonth() {
        return hoursPerMonth;
    }

    public void setHoursPerMonth(int hoursPerMonth) {
        this.hoursPerMonth = hoursPerMonth;
    }
}
