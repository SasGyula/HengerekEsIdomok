package hu.szamalk.modell;

public abstract class AbstractFaIdom extends AbstractIdom {
    private static double fajsuly;

    public AbstractFaIdom() {
        this.fajsuly = 0.8;
    }

    public double suly(){
        return terfogat() * AbstractFaIdom.fajsuly;
    }

    @Override
    public String toString() {
        return "FaIdom{" +
                "fajsuly=" + fajsuly +
                '}';
    }
}