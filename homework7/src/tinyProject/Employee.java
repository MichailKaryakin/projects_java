package tinyProject;

abstract class Employee {
    private String nameAndInitials;
    private String paymentType;
    private int paymentSum;

    public String getNameAndInitials() {
        return nameAndInitials;
    }

    public void setNameAndInitials(String nameAndInitials) {
        this.nameAndInitials = nameAndInitials;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public int getPaymentSum() {
        return paymentSum;
    }

    public void setPaymentSum(int paymentSum) {
        this.paymentSum = paymentSum;
    }
}
