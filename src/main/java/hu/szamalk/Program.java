package hu.szamalk;

import hu.szamalk.modell.*;

import java.sql.Array;
import java.util.ArrayList;

public class Program {
    private ArrayList<AbstractIdom> idomok;
    public Program(){
        idomok = new ArrayList<>();
        idomok.add(new MertaniHenger(1,1)) ;
        idomok.add(new TomorHenger(1,1,1)) ;
        idomok.add(new LyukasHenger(1,1,1,1)) ;
        idomok.add(new Hasab(1,1,2)) ;
        idomok.add( new Gomb(1));
    }

    private void kiiras(){
        for(int i = 0; i<idomok.size(); i++){
            System.out.println(idomok.get(i).toString());
        }
    }
    private String terfogatok(){
        String s = "Térfogatok:\n";
        for (AbstractIdom idom : idomok) {
            s += idom;
            s+= "\n V: " + idom.terfogat();
            s+= "\n";
        }
        return s;
    }
    public void run(){
        System.out.println(terfogatok());
    }
}
