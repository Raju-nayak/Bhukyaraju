import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class uniquewords {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\10148\\Desktop\\qwerty.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            Set<String> uniqueWords = new HashSet<>();
            while ((readLine = b.readLine()) != null) {
                uniqueWords.addAll(Arrays.asList(readLine.split("[\\W]+")));
            }
            System.out.println("unique words in given file are : " + uniqueWords.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}