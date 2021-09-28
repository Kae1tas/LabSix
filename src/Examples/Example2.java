package Examples;

import java.io.*;

public class Example2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            br = new BufferedReader( new FileReader("D:\\Файлы 1\\exSixOne\\MyFile1.txt" ), 1024);
            out = new BufferedWriter( new FileWriter( "D:\\Файлы 1\\exSixOne\\MyFile2.txt" ));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        }
        finally{
            br.close();
            out.flush();
            out.close();
        }
    }
}

