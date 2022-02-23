package Final_191;

//Problem : 191_2
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MaxNumber {
  public static void main(String[] args) {
      try{
          FileReader f = new FileReader("files/numbers.txt");
          BufferedReader reader = new BufferedReader(f);
          String line;
          int max;
          while((line=reader.readLine()) != null)
          {
              String[] parts = line.split(",");
              max = Integer.parseInt(parts[0]);
              for (int i = 0; i <parts.length ; i++)
              {
                  if(Integer.parseInt(parts[i])>max)
                  {
                      max = Integer.parseInt(parts[i]);
                  }
              }
              System.out.println(max);

          }

          reader.close();
      }catch(IOException e){
          e.printStackTrace();
      }
  }
}