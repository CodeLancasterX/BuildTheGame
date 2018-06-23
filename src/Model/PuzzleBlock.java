package Model;

import java.util.Random;

public class PuzzleBlock {

    boolean[][] placedBlocks;
    private final int wdith = 40;
    private final int height = 40;

    public PuzzleBlock(String representation){
        //rows of booleans, if true, block is placed, if false spot is empty.
        placedBlocks = new boolean[5][5];
        char[] tokens = representation.toCharArray();
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                placedBlocks[y][x] = tokens[y*x] == 'x';
            }
        }
        System.out.println(placedBlocks);
    }

    public boolean[][] getPlacedBlocks() {
        return placedBlocks;
    }

    public int getWdith() {
        return wdith;
    }

    public int getHeight() {
        return height;
    }

    public void generateRandomBlock(){
        Random random = new Random();
        random.nextInt(25);
    }
}
