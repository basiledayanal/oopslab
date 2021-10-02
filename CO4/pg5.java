import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class pg5 {
   public static void main(String[] args) throws IOException {
      File file = new File("/Users/basilalias/JAVA/basil.text");
      FileInputStream inputStream = new FileInputStream(file);
      Scanner sc = new Scanner(inputStream);
      StringBuffer buffer = new StringBuffer();
      while(sc.hasNext()) {
         buffer.append(" "+sc.nextLine());
      }
      File dest = new File("/Users/basilalias/JAVA/basilopt.text");
      FileWriter writer = new FileWriter(dest);
      writer.write(buffer.toString());
      writer.flush();
      System.out.println("File copied successfully.......");
   }
}