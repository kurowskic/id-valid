package model;

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

    protected boolean PESEL_Check() {
        String hash = "13791379131";
        int sum = 0;
        for (int i = 0; i < this.getPesel().length(); i++) {

            sum = sum +
                    (Integer.parseInt(String.valueOf(this.getPesel().charAt(i))))
                            *
                            Integer.parseInt(String.valueOf(hash.charAt(i)));
        }

        return (sum % 10 == 0);

    }

    protected boolean isLenghtCorrect() {

        return this.getPesel().length() == 11;
    }

    protected boolean isOnlyDigits() {
        for (int i = 0; i < this.getPesel().length(); i++) {
            if (!Character.isDigit(this.getPesel().charAt(i))) {
                return false;
            }
        }
        return true;
    }

    protected boolean isMonthCorrect() {
        boolean isMonthCorrect = true;

        int compare = Integer.parseInt(this.getPesel().substring(2, 4));
//        int compare46 = Integer.parseInt(this.getPesel().substring(4, 6));

        if (this.getPesel().length() > 3) {
            if (
                    ((compare >= 13)
                            &&
                            (compare <= 20))
                            ||
                            ((compare >= 33)
                                    &&
                                    (compare <= 40))
                            ||
                            ((compare >= 53)
                                    &&
                                    (compare <= 60))
                            ||
                            ((compare >= 73)
                                    &&
                                    (compare <= 80))
                            ||
                            ((compare >= 93)
                                    &&
                                    (compare <= 99))
                            ||
                            (compare == 0)
            ) {
                isMonthCorrect = false;
            }
        }
        return isMonthCorrect;
    }

    protected boolean isDayOfMonthCorrect() {
        boolean isDayOfMonthCorrect = false;

        boolean isLeapYear = false;

        int compare = Integer.parseInt(this.getPesel().substring(2, 4));
        int compare46 = Integer.parseInt(this.getPesel().substring(4, 6));

        switch (compare) {
            case 82:

                isLeapYear = isLeap(Integer.parseInt("18" + this.getPesel().substring(0, 2)));

                break;

            case 0:
                isLeapYear = isLeap(Integer.parseInt("19" + this.getPesel().substring(0, 2)));
                break;

            case 22:
                isLeapYear = isLeap(Integer.parseInt("20" + this.getPesel().substring(0, 2)));
                break;

            case 42:
                isLeapYear = isLeap(Integer.parseInt("21" + this.getPesel().substring(0, 2)));
                break;

            case 62:
                isLeapYear = isLeap(Integer.parseInt("22" + this.getPesel().substring(0, 2)));
                break;
        }


        if (
                !isLeapYear && (
                        (compare == 82)
                                ||
                                (compare == 2)
                                ||
                                (compare == 22)
                                ||
                                (compare == 42)
                                ||
                                (compare == 62)
                )
                        &&
                        (
                                (compare46 >= 1)
                                        &&
                                        (compare46 <= 28)
                        )) {

            isDayOfMonthCorrect = true;

        }

        if (isLeapYear && (
                (compare == 82)
                        ||
                        (compare == 2)
                        ||
                        (compare == 22)
                        ||
                        (compare == 42)
                        ||
                        (compare == 62)
        ))
            if (compare46 >= 1)
                if (compare46 <= 29) {

                    isDayOfMonthCorrect = true;

                }


        if (compare46 >= 1)
            if (compare46 <= 31) {
                if ((compare == 81)
                        ||
                        (compare == 83)
                        ||
                        (compare == 85)
                        ||
                        (compare == 87)
                        ||
                        (compare == 88)
                        ||
                        (compare == 90)
                        ||
                        (compare == 92)
                        ||
                        (compare == 1)
                        ||
                        (compare == 3)
                        ||
                        (compare == 5)
                        ||
                        (compare == 7)
                        ||
                        (compare == 8)
                        ||
                        (compare == 10)
                        ||
                        (compare == 12)
                        ||
                        (compare == 21)
                        ||
                        (compare == 23)
                        ||
                        (compare == 25)
                        ||
                        (compare == 27)
                        ||
                        (compare == 28)
                        ||
                        (compare == 30)
                        ||
                        (compare == 32)
                        ||
                        (compare == 41)
                        ||
                        (compare == 43)
                        ||
                        (compare == 45)
                        ||
                        (compare == 47)
                        ||
                        (compare == 48)
                        ||
                        (compare == 50)
                        ||
                        (compare == 52)
                        ||
                        (compare == 61)
                        ||
                        (compare == 63)
                        ||
                        (compare == 65)
                        ||
                        (compare == 67)
                        ||
                        (compare == 68)
                        ||
                        (compare == 70)
                        ||
                        (compare == 72)) {

                    isDayOfMonthCorrect = true;

                }
            }


        if ((compare == 84)
                ||
                (compare == 86)
                ||
                (compare == 89)
                ||
                (compare == 91)
                ||
                (compare == 4)
                ||
                (compare == 6)
                ||
                (compare == 9)
                ||
                (compare == 11)
                ||
                (compare == 24)
                ||
                (compare == 26)
                ||
                (compare == 29)
                ||
                (compare == 31)
                ||
                (compare == 44)
                ||
                (compare == 46)
                ||
                (compare == 49)
                ||
                (compare == 51)
                ||
                (compare == 64)
                ||
                (compare == 66)
                ||
                (compare == 69)
                ||
                (compare == 71))
            if (compare46 >= 1)
                if (compare46 <= 31) {

                    isDayOfMonthCorrect = true;

                }

        return isDayOfMonthCorrect;
    }


}
