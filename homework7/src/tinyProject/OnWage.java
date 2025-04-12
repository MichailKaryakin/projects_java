package tinyProject;

public class OnWage extends Employee {
    private int wageDay;
    private int daysPerMonth;

    public OnWage(int wageDay, int daysPerMonth, String nameAndInitials) {
        this.wageDay = wageDay;
        this.daysPerMonth = daysPerMonth;
        this.setPaymentType("ставка");
        this.setPaymentSum(this.wageDay * this.daysPerMonth);
        this.setNameAndInitials(nameAndInitials);
    }

    public int getWageDay() {
        return wageDay;
    }

    public void setWageDay(int wageDay) {
        this.wageDay = wageDay;
    }

    public int getDaysPerMonth() {
        return daysPerMonth;
    }

    public void setDaysPerMonth(int daysPerMonth) {
        this.daysPerMonth = daysPerMonth;
    }
}
