package model;

public class PESEL_Check {
    public static boolean PESEL_Check(String str) {
        boolean truefalse = false;
        String hash = "13791379131";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {

            sum = sum +
                    (Integer.parseInt(String.valueOf(str.charAt(i))))
                            *
                            Integer.parseInt(String.valueOf(hash.charAt(i)));
        }

        if (sum % 10 == 0) {
            truefalse = true;
        }

        return truefalse;

    }

}
