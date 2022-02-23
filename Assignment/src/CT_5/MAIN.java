package CT_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MAIN {

    public static void main(String[] args) throws Exception {
        ArrayList<Double> Arraycgpa = new ArrayList<>();
        BufferedReader BR = new BufferedReader(new FileReader("files/input.txt"));
        String s;
        while ((s= BR.readLine())!=null){
            Arraycgpa.add(Double.parseDouble(s));
            
        }
        BR.close();
        Collections.sort(Arraycgpa, new Comparator<Double>() {
            @Override
            public int compare(Double O1, Double O2) {
                if (O1>O2){
                    return -1;
                }
                else 
                    return 1;
            }
        });

        for (int i = 0; i < 3; i++) {
            System.out.println(Arraycgpa.get(i));
            
        }
    }
}