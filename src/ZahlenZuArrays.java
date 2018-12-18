import java.util.ArrayList;

public class ZahlenZuArrays {

    public static ArrayList<Integer> ausZahlenWerdenArrays(int eini){
        ArrayList<Integer> ergebnis = new ArrayList<Integer>();
        do{
            ergebnis.add(eini % 10);
            eini /= 10;
        } while  (eini > 0);
        return ergebnis;
    }
    
}
