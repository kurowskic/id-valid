package dao;

import model.*;

public class idvalidDAO extends model.idvalid {

    public static boolean veryfi(String pesel) {
        return (LenCorrect.isLenghtCorrect(pesel)
                && OnlyDigits.isOnlyDigits(pesel)
                && MonthCorrect.isMonthCorrect(pesel)
                && DayOfMonthCorrect.isDayOfMonthCorrect(pesel) && PESEL_Check.PESEL_Check(pesel));
    }
}

