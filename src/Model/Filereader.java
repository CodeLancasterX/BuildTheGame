package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Filereader {

    String textFile;

    public Filereader(String textFile) {
        this.textFile = textFile;
    }

    private List<String> readFile(String textFile) {
        List<String> records = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(textFile));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                records.add(line);
            }
            reader.close();
            return records;
        } catch (Exception e) {
            System.err.format("Exception occurred trying to read '%s'.", textFile);
            e.printStackTrace();
            return null;
        }
    }

}
