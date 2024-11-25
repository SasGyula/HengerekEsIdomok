package hu.szamalk.modell;

public abstract class Idom {
    private static double fajsuly;

    public Idom() {
        this.fajsuly = 0.8;
    }
    public double terfogat(){
        return 0;
    }
    public double suly(){
        return terfogat() * Idom.fajsuly;
    }

    @Override
    public String toString() {
        return "FaIdom{" +
                "fajsuly=" + fajsuly +
                '}';
    }
}
