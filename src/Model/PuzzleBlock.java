package Model;

public class PuzzleBlock {

    boolean[][] placedBlocks;
    private final int wdith = 40;
    private final int height = 40;

    public PuzzleBlock(){
        placedBlocks = new boolean[5][5];
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
}
