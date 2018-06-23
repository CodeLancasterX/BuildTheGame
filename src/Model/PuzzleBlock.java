package Model;

import java.util.Random;

public class PuzzleBlock {

    boolean[][] blockShape;
    private final int wdith = 40;
    private final int height = 40;


    //representation in the constructor is the string out of config text.
    public PuzzleBlock(String representation){
        //rows of booleans, if true, block is placed, if false spot is empty.
        blockShape = new boolean[5][5];
        char[] tokens = representation.toCharArray();
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                blockShape[y][x] = tokens[y*x] == 'x';
                System.out.println(tokens[x]);
            }
        }
    }

    public boolean[][] getBlockShape() {
        return blockShape;
    }

    public int getWdith() {
        return wdith;
    }

    public int getHeight() {
        return height;
    }


}
