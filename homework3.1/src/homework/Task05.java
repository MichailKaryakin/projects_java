package homework;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день, месяц и год своего рождения, по очереди");
        int dayOfBirth = scanner.nextInt();
        int monthOfBirth = scanner.nextInt();
        int yearOfBirth = scanner.nextInt();
        scanner.close();
        identifySignYear(dayOfBirth, monthOfBirth, yearOfBirth);
    }

    public static void identifySignYear(int day, int month, int year) {
        String forSign = identifySign(day, month);
        String forYear = identifyYear(year);
        System.out.printf("Sign: %s\n", forSign);
        System.out.printf("Year: %s", forYear);
    }

    public static String identifyYear(int year) {
        int difference = year - 1900;
        int yearId = difference % 12;
        String container = null;
        switch (yearId) {
            case 0 -> container = "Rat";
            case 1 -> container = "Ox";
            case 2 -> container = "Tiger";
            case 3 -> container = "Rabbit";
            case 4 -> container = "Dragon";
            case 5 -> container = "Snake";
            case 6 -> container = "Horse";
            case 7 -> container = "Goat";
            case 8 -> container = "Monkey";
            case 9 -> container = "Rooster";
            case 10 -> container = "Dog";
            case 11 -> container = "Pig";
        }
        return container;
    }

    public static String identifySign(int day, int month) {
        String container = null;
        if (month == 1) {
            if (day <= 19) {
                container = "Capricorn";
            } else {
                container = "Aquarius";
            }
        } else if (month == 2) {
            if (day <= 18) {
                container = "Aquarius";
            } else {
                container = "Pisces";
            }
        } else if (month == 3) {
            if (day <= 20) {
                container = "Pisces";
            } else {
                container = "Aries";
            }
        } else if (month == 4) {
            if (day <= 19) {
                container = "Pisces";
            } else {
                container = "Taurus";
            }
        } else if (month == 5) {
            if (day <= 20) {
                container = "Taurus";
            } else {
                container = "Gemini";
            }
        } else if (month == 6) {
            if (day <= 20) {
                container = "Gemini";
            } else {
                container = "Cancer";
            }
        } else if (month == 7) {
            if (day <= 22) {
                container = "Cancer";
            } else {
                container = "Leo";
            }
        } else if (month == 8) {
            if (day <= 22) {
                container = "Leo";
            } else {
                container = "Virgo";
            }
        } else if (month == 9) {
            if (day <= 22) {
                container = "Virgo";
            } else {
                container = "Libra";
            }
        } else if (month == 10) {
            if (day <= 22) {
                container = "Libra";
            } else {
                container = "Scorpio";
            }
        } else if (month == 11) {
            if (day <= 21) {
                container = "Scorpio";
            } else {
                container = "Sagittarius";
            }
        } else if (month == 12) {
            if (day <= 21) {
                container = "Sagittarius";
            } else {
                container = "Capricorn";
            }
        }
        return container;
    }
}
