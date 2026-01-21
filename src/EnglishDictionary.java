import java.io.*;
import java.util.HashSet;
import java.util.Scanner;


public class EnglishDictionary{

    private final HashSet<String> dict = new HashSet<>();

    public EnglishDictionary(String filename) {
        try {
            Scanner input = new Scanner(new File(filename));
            while (input.hasNext()) {
                dict.add(input.nextLine().toUpperCase().replace("\n", ""));
            }
        }
        catch (FileNotFoundException n) {
            System.out.println("File not found");
        }
    }

    public boolean checkDict(String entry) {
        return dict.contains(entry);
    }
}
