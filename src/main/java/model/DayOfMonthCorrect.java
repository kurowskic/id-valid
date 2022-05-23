package model;

import static java.time.Year.isLeap;

public class DayOfMonthCorrect {
    public static boolean isDayOfMonthCorrect(String str) {
        boolean isDayOfMonthCorrect = false;

        boolean isLeap = false;

        int compare = Integer.parseInt(str.substring(2, 4));
        int compare46 = Integer.parseInt(str.substring(4, 6));

        switch (compare) {
            case 82:

                isLeap = isLeap(Integer.parseInt("18" + str.substring(0, 2)));

                break;

            case 0:
                isLeap = isLeap(Integer.parseInt("19" + str.substring(0, 2)));
                break;

            case 22:
                isLeap = isLeap(Integer.parseInt("20" + str.substring(0, 2)));
                break;

            case 42:
                isLeap = isLeap(Integer.parseInt("21" + str.substring(0, 2)));
                break;

            case 62:
                isLeap = isLeap(Integer.parseInt("22" + str.substring(0, 2)));
                break;
        }


        if (
                !isLeap && (
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

        if (isLeap && (
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
