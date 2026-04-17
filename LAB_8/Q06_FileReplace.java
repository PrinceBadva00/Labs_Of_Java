import java.io.*;

public class Q06_FileReplace {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("sdj.txt"));
            String line;
            String content = "";

            while ((line = br.readLine()) != null) {
                content += line + "\n";
            }

            br.close();

            content = content.replace("his", "her");

            BufferedWriter bw = new BufferedWriter(new FileWriter("sdj.txt"));
            bw.write(content);
            bw.close();

            System.out.println("Replacement done");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}