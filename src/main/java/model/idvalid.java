package model;

import static java.lang.String.valueOf;
import static java.time.Year.isLeap;

public class idvalid {

    String pesel;

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public boolean veryfi() {

        return (isLenghtCorrect()
                && isOnlyDigits()
                && isMonthCorrect()
                && isDayOfMonthCorrect()
                && PESEL_Check());
    }

    private boolean PESEL_Check() {
        String hash = "13791379131";
        int sum = 0;
        for (int i = 0; i < this.getPesel().length(); i++) {

            sum = sum +
                    (Integer.parseInt(valueOf(this.getPesel().charAt(i))))
                            *
                            Integer.parseInt(valueOf(hash.charAt(i)));
        }

        return (sum % 10 == 0);

    }

    private boolean isLenghtCorrect() {

        return this.getPesel().length() == 11;
    }

    private boolean isOnlyDigits() {
        for (int i = 0; i < this.getPesel().length(); i++) {
            if (!Character.isDigit(this.getPesel().charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isMonthCorrect() {
        boolean isMonthCorrect = true;

        int month = Integer.parseInt(this.getPesel().substring(2, 4));
        int[] BadMonth = {13, 14, 15, 16, 17, 18, 19, 20,
                33, 34, 35, 36, 37, 38, 39, 40,
                53, 54, 55, 56, 57, 58, 59, 60,
                73, 74, 75, 76, 77, 78, 79, 80,
                93, 94, 95, 96, 97, 98, 99, 00};

        for (int badMonth : BadMonth
        ) {
            if (this.getPesel().length() > 3 && month == badMonth) {
                isMonthCorrect = false;
                break;
            }
        }

        return isMonthCorrect;
    }

    private boolean isDayOfMonthCorrect() {
        boolean isDayOfMonthCorrect = false;

        boolean isLeapYear = false;

        int[] febs = {82, 02, 22, 42, 62};
        int[] days30 =
                {84, 86, 89, 91,
                        4, 6, 9, 11,
                        24, 26, 29, 31,
                        44, 46, 49, 51,
                        64, 66, 69, 71};
        int[] days31 =
                {81, 83, 85, 87, 88, 90, 92,
                        1, 3, 5, 7, 8, 10, 12,
                        21, 23, 25, 27, 28, 30, 32,
                        41, 43, 45, 47, 48, 50, 52,
                        61, 63, 65, 67, 68, 70, 71};


        String year = this.getPesel().substring(0, 2);
        int month = Integer.parseInt(this.getPesel().substring(2, 4));
        int dayOfMonrh = Integer.parseInt(this.getPesel().substring(4, 6));

        switch (month) {
            case 82:
                isLeapYear = isLeap(Integer.parseInt("18" + year));
                break;

            case 02:
                isLeapYear = isLeap(Integer.parseInt("19" + year));
                break;

            case 22:
                isLeapYear = isLeap(Integer.parseInt("20" + year));
                break;

            case 42:
                isLeapYear = isLeap(Integer.parseInt("21" + year));
                break;

            case 62:
                isLeapYear = isLeap(Integer.parseInt("22" + year));
                break;
        }

        if (!isLeapYear) {
            for (int feb : febs
            ) {
                if (month == feb && ((dayOfMonrh >= 1) && (dayOfMonrh <= 28))) {
                    isDayOfMonthCorrect = true;
                    break;
                }
            }
        }

        if (isLeapYear) {
            for (int feb : febs
            ) {
                if (month == feb && ((dayOfMonrh >= 1) && (dayOfMonrh <= 29))) {
                    isDayOfMonthCorrect = true;
                    break;
                }
            }
        }


        for (int day30 : days30
        ) {
            if (month == day30 && ((dayOfMonrh >= 1) && (dayOfMonrh <= 30))) {
                isDayOfMonthCorrect = true;
                break;
            }
        }

        for (int day31 : days31
        ) {
            if (month == day31 && ((dayOfMonrh >= 1) && (dayOfMonrh <= 31))) {
                isDayOfMonthCorrect = true;
                break;
            }
        }
        return isDayOfMonthCorrect;
    }

}