package tools;

import model.idvalid;

public class Main {
    public static void main(String[] args) {
//        TestTFTF();
        TestFFTF();
//        TestFTTF();
    }

    private static void TestTFTF() {
        int counter = 0;
        for (int i = 0; i < 99; i++) {
            for (int j = 1; j <= 12; j++) {
                for (int k = 0; k <= 99; k++) {
                    for (int l = 0; l <= 9999; l++) {
                        for (int m = 0; m <= 9; m++) {

                            String formattedI = String.format("%02d", i);
                            String formattedJ = String.format("%02d", j);
                            String formattedK = String.format("%02d", k);
                            String formattedL = String.format("%04d", l);
                            String formattedM = String.format("%01d", m);

                            idvalid myTestPesel = new idvalid();
                            myTestPesel.setPesel(formattedI + formattedJ + formattedK + formattedL + formattedM);
                            if (myTestPesel.isMonthCorrect() && !myTestPesel.isDayOfMonthCorrect()
                                    && myTestPesel.PESEL_Check() && !myTestPesel.veryfi()
                            ) {
                                System.out.println(formattedI + formattedJ + formattedK + formattedL + formattedM);
                                counter++;
                            }
                            System.out.print(formattedI);
                            System.out.print(" ");
                            System.out.println(formattedM);
                        }
                    }
                }
            }
            System.out.println(i);
        }
        System.out.println("=====");
        System.out.print("TFTF: ");
        System.out.println(counter);
    }

    private static void TestFFTF() {
        int counter = 0;
        for (int i = 0; i < 99; i++) {
            for (int j = 1; j <= 12; j++) {
                for (int k = 0; k <= 99; k++) {
                    for (int l = 0; l <= 9999; l++) {
                        for (int m = 0; m <= 9; m++) {

                            String formattedI = String.format("%02d", i);
                            String formattedJ = String.format("%02d", j);
                            String formattedK = String.format("%02d", k);
                            String formattedL = String.format("%04d", l);
                            String formattedM = String.format("%01d", m);

                            idvalid myTestPesel = new idvalid();
                            myTestPesel.setPesel(formattedI + formattedJ + formattedK + formattedL + formattedM);
                            if (!myTestPesel.isMonthCorrect() && !myTestPesel.isDayOfMonthCorrect()
                                    && myTestPesel.PESEL_Check() && !myTestPesel.veryfi()
                            ) {
                                System.out.println(formattedI + formattedJ + formattedK + formattedL + formattedM);
                                counter++;
                            }
                            System.out.print(formattedI);
                            System.out.print(" ");
                            System.out.println(formattedM);
                        }
                    }
                }
            }
            System.out.println(i);

        }
        System.out.println("=====");
        System.out.print("FFTF: ");
        System.out.println(counter);

    }
    private static void TestFTTF() {
        int counter = 0;
        for (int i = 0; i < 99; i++) {
            for (int j = 1; j <= 12; j++) {
                for (int k = 0; k <= 99; k++) {
                    for (int l = 0; l <= 9999; l++) {
                        for (int m = 0; m <= 9; m++) {

                            String formattedI = String.format("%02d", i);
                            String formattedJ = String.format("%02d", j);
                            String formattedK = String.format("%02d", k);
                            String formattedL = String.format("%04d", l);
                            String formattedM = String.format("%01d", m);

                            idvalid myTestPesel = new idvalid();
                            myTestPesel.setPesel(formattedI + formattedJ + formattedK + formattedL + formattedM);
                            if (!myTestPesel.isMonthCorrect() && myTestPesel.isDayOfMonthCorrect()
                                    && myTestPesel.PESEL_Check() && !myTestPesel.veryfi()
                            ) {
                                System.out.println(formattedI + formattedJ + formattedK + formattedL + formattedM);
                                counter++;
                            }
                            System.out.print(formattedI);
                            System.out.print(" ");
                            System.out.println(formattedM);
                        }
                    }
                }
            }
            System.out.println(i);
        }
        System.out.println("=====");
        System.out.print("FTTF: ");
        System.out.println(counter);
    }

}