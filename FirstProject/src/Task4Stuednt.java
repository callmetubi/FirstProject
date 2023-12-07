import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4Stuednt {
    public static void main(String[] args) throws IOException {
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("\"C:\\Users\\hp15s\\Desktop\\2ND YEAR CE\\Java Programming\\students.txt\""));
        FileWriter fw= new FileWriter("\"C:\\Users\\hp15s\\Desktop\\2ND YEAR CE\\Java Programming\\students.txt\"")){
      String Line;

      while((Line=bufferedReader.readLine()) !=null){


          String[] words=Line.split("\\s+");
          String surname=words[0].trim();
          String name=words[1].trim();
          String score= words[2].trim();
          if (score.equals("5")){

              fw.write(surname +"\s" + name +"\s"+score +"\n");
          }
      }
      } catch (IOException e){
            System.out.println("Error IO");
        }
    }
    }

