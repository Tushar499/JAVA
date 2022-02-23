package Final_182_2b_OR;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class bookData implements Comparable<bookData> {
    String CourseName;
    int number;

    bookData(String a, int b){
        CourseName = a;
        number = b;
    }

    @Override
    public int compareTo(bookData o) {
        if (this.number > o.number) return -1;
        if (this.number < o.number) return 1;
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<bookData> bookData = new ArrayList<>();
        try{
            FileReader f = new FileReader("files/bookData.txt");
            BufferedReader reader = new BufferedReader(f);
            String line;

            while ((line = reader.readLine()) != null){
                String[] val = line.split("_");
                String name = val[0];
                int number= Integer.parseInt(val[1]);

                bookData b = new bookData(name, number);
                bookData.add(b);
            }
            Collections.sort(bookData);

        }
        catch (IOException e){
            e.printStackTrace();
        }
        try{
            File f = new File("files/total.txt");
            PrintWriter printWriter = new PrintWriter(f);

            for(bookData bData: bookData){
                printWriter.println(bData.number);
                break;
            }
            printWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}