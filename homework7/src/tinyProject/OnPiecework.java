package tinyProject;

import java.util.ArrayList;
import java.util.List;

public class OnPiecework extends Employee {
    private List<Integer> payments;

    public OnPiecework(List<Integer> payments, String nameAndInitials) {
        payments = new ArrayList<>();
        this.payments = payments;
        this.setPaymentType("сдельная");
        this.setPaymentSum(payments.stream().reduce(0, Integer::sum));
        this.setNameAndInitials(nameAndInitials);
    }

    public List<Integer> getPayments() {
        return payments;
    }

    public void setPayments(List<Integer> payments) {
        this.payments = payments;
    }
}
