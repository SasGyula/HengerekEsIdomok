package hu.szamalk.modell;

public class MertaniHenger extends AbstractIdom{
    private static int hengerDb = 0;
    private double sugar, magassag;

    public MertaniHenger(double sugar, double magassag) {
        MertaniHenger.hengerDb++;
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public static int getHengerDb() {
        return hengerDb;
    }


    protected static void csokkentHengerDb() {
        MertaniHenger.hengerDb--;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public double terfogat() {
        return Math.pow(sugar, 2) * Math.PI * magassag;
        //return Math.pow(this.sugar, 2) * Math.PI * this.magassag;
    }

    @Override
    public String toString() {
        return "MertaniHenger{" +
                "sugar=" + sugar +
                ", magassag=" + magassag +
                '}';
    }
}
