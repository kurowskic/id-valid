public class Main {
    public static void main(String[] args) {

        model.idvalid myPesel = new model.idvalid();

        myPesel.setPesel(args[0]);

        if (myPesel.veryfi()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}

