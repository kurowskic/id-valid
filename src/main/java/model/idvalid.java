package model;

public class idvalid {

    String pesel;

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "idvalid{" +
                "pesel='" + pesel + '\'' +
                '}';
    }
}
