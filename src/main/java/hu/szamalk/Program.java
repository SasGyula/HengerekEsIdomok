package hu.szamalk;

import hu.szamalk.modell.*;

public class Program {
    MertaniHenger h1 = new MertaniHenger(1,1);
    MertaniHenger h2 = new TomorHenger(1,1,1);
    MertaniHenger h3 = new LyukasHenger(1,1,1,1);
    Idom i1 = new Hasab(1,1,2);
    Idom i2 = new Gomb(1);
    private void kiir(){
        System.out.println("A mértani henger terfogata: " + h1.terfogat());
        System.out.println("A tömör henger terfogata: " + h2.terfogat());
        System.out.println("A lyukas henger terfogata: " + h3.terfogat());
        System.out.println("A hasáb idom terfogata: " + i1.terfogat());
        System.out.println("A gömb idom terfogata: " + i2.terfogat());
    }
    public void run(){
        kiir();
    }
}
