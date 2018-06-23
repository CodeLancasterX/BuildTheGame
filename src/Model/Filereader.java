package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Filereader {

    public Filereader() {

    }

    public List<String> readFile(String textFile) {
        List<String> puzzleShapes = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(textFile));
            String line;
            while ((line = reader.readLine()) != null) {
                puzzleShapes.add(line);
            }
            reader.close();
            return puzzleShapes;
        } catch (Exception e) {
//            System.err.format("Exception occurred trying to read '%s'.", textFile);
            e.printStackTrace();
            return null;
        }
    }

}
