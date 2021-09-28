package Examples;

import java.io.*;

public class Example5 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("D:\\Файлы 1\\exSixTwo\\MyFile1.txt"),"UTF-8"));

            out = new PrintWriter("D:\\Файлы 1\\exSixTwo\\MyFile2.txt","UTF-8");
            int lineCount = 0;
            String s;

            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!"); }
        finally{
            br.close();
            out.flush();
            out.close();
        }
    }
}

