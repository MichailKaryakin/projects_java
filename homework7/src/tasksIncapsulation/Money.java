package tasksIncapsulation;

/**
 * Создать класс Money (Деньги) для работы с денежными
 * суммами. Число должно быть представлено двумя полями:
 * - типа long – для рублей;
 * - типа byte – для копеек.
 * Реализовать вывод значения на экран, при этом дробная
 * часть должна быть отделена от целой части запятой.
 * Реализовать сложение, вычитание, деление сумм, деление суммы
 * на дробное число, умножение на дробное число и операции
 * сравнения.
 */
public class Money {
    private long rubles;
    private final byte pennies;

    public Money(long rubles, short pennies) {
        this.rubles = rubles;
        while (pennies > 99) {
            this.rubles++;
            pennies -= 100;
        }
        this.pennies = (byte) pennies;
    }

    public void sumOutput() {
        System.out.printf("%d,%d%n", rubles, pennies);
    }

    public Money addition(Money amount) {
        return new Money((this.rubles + amount.rubles), (short) (this.pennies + amount.pennies));
    }

    public Money subtraction(Money amount) {
        long rublesResult = this.rubles - amount.rubles;
        short penniesResult = (short) (this.pennies - amount.pennies);
        if (penniesResult < 0) {
            rublesResult++;
            penniesResult += 100;
        }
        return new Money(rublesResult, penniesResult);
    }

    public Money division(Money amount) {
        double numerator = (double) this.rubles + ((double) this.pennies / 100);
        double denominator = (double) amount.rubles + ((double) amount.pennies / 100);
        double result = numerator / denominator;
        return new Money((long) result, (short) ((result % 1) * 100));
    }

    public Money divisionByFloat(Double coefficient) {
        double numerator = (double) this.rubles + ((double) this.pennies / 100);
        double result = numerator / coefficient;
        return new Money((long) result, (short) ((result % 1) * 100));
    }

    public Money multiplicationByFloat(Double coefficient) {
        double numerator = (double) this.rubles + ((double) this.pennies / 100);
        double result = numerator * coefficient;
        return new Money((long) result, (short) ((result % 1) * 100));
    }

    public boolean greaterThan(Money amount) {
        if (this.rubles > amount.rubles) {
            return true;
        } else if (this.rubles == amount.rubles) {
            return this.pennies > amount.pennies;
        } else {
            return false;
        }
    }

    public boolean lesserThan(Money amount) {
        if (this.rubles < amount.rubles) {
            return true;
        } else if (this.rubles == amount.rubles) {
            return this.pennies < amount.pennies;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Money sum) {
            return this.rubles == sum.rubles && this.pennies == sum.pennies;
        } else {
            return false;
        }
    }

}
