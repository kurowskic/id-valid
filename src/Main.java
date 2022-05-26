import model.*;

public class Main {
    public static void main(String[] args) {
//        String str = args[0];

        idvalid myPesel = new idvalid();

        myPesel.setPesel(args[0]);

        if (myPesel.veryfi())

        {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}

