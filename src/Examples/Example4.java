package Examples;

import java.io.*;

public class Example4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("D:\\Файлы 1\\exSixTwo\\MyFile1.txt"),"UTF-8"));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("D:\\Файлы 1\\exSixTwo\\MyFile2.txt"),"UTF-8"));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        }
        finally{
            br.close();
            bw.flush();
            bw.close();
        }
    }
}

