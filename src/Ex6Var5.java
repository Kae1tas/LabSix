import java.io.*;
import java.nio.charset.StandardCharsets;


public class Ex6Var5 {
    public static boolean wordCheck(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; ++i) {
            if (str.charAt(i) == str.charAt(len - i - 1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("D:\\Файлы 1\\Задание 6\\text1.txt"), StandardCharsets.UTF_8));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("D:\\Файлы 1\\Задание 6\\text2.txt"), StandardCharsets.UTF_8));
            int lineCount = 0;
            int lineWord = 0;
            String s;

            while ((s = br.readLine()) != null) {
                lineCount++;
                for (String words : s.split(" ")) {
                    if (wordCheck(words)) {
                        lineWord++;
                        System.out.println(lineCount + ": " + words);
                        bw.write(lineCount + ": " + words);
                        bw.newLine();
                    }
                }

                if (lineWord != 0)  {
                    System.out.println("количество слов: " + lineWord + "\n");
                    bw.write("количество слов:" + lineWord + "\n\n");
                }
                lineWord = 0;
            }

        } catch (IOException e) {
            System.out.println("Ошибка!");
        }
        finally{
            assert br != null;
            br.close();
            assert bw != null;
            bw.flush();
            bw.close();
        }
    }
}
