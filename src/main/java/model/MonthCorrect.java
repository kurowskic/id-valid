package model;


public class MonthCorrect {
    public static boolean isMonthCorrect(String str) {
        boolean isMonthCorrect = true;

        int compare = Integer.parseInt(str.substring(2, 4));
        int compare46 = Integer.parseInt(str.substring(4, 6));

        if (str.length() > 3) {
            if (
                    (compare == 13)
                            ||
                            (compare == 14)
                            ||
                            (compare == 15)
                            ||
                            (compare == 16)
                            ||
                            (compare == 17)
                            ||
                            (compare == 18)
                            ||
                            (compare == 19)
                            ||
                            (compare == 20)
                            ||
                            (compare == 33)
                            ||
                            (compare == 34)
                            ||
                            (compare == 35)
                            ||
                            (compare == 36)
                            ||
                            (compare == 37)
                            ||
                            (compare == 38)
                            ||
                            (compare == 39)
                            ||
                            (compare == 40)
                            ||
                            (compare == 53)
                            ||
                            (compare == 54)
                            ||
                            (compare == 55)
                            ||
                            (compare == 56)
                            ||
                            (compare == 57)
                            ||
                            (compare == 58)
                            ||
                            (compare == 59)
                            ||
                            (compare == 60)
                            ||
                            (compare == 73)
                            ||
                            (compare == 74)
                            ||
                            (compare == 75)
                            ||
                            (compare == 76)
                            ||
                            (compare == 77)
                            ||
                            (compare == 78)
                            ||
                            (compare == 79)
                            ||
                            (compare == 80)
                            ||
                            (compare == 93)
                            ||
                            (compare == 94)
                            ||
                            (compare == 95)
                            ||
                            (compare == 96)
                            ||
                            (compare == 97)
                            ||
                            (compare == 98)
                            ||
                            (compare == 99)
                            ||
                            (compare == 0)
            ) {
                isMonthCorrect = false;
            }
        }
        return isMonthCorrect;
    }
}
