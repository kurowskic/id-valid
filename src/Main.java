import dao.idvalidDAO;
import model.*;

public class Main {
    public static void main(String[] args) {
        String str = args[0];

        if (idvalidDAO.veryfi(str))

        {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}

