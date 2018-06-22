package Model;

import java.util.ArrayList;

public class Game implements Runnable{

    private Grid gameGrid;
    private ArrayList<PuzzleBlock> dock;
    private final int maxGridSize = 3;

    public Game(){
        gameGrid = new Grid();
        dock = new ArrayList<PuzzleBlock>();
    }

    @Override
    public void run() {

    }

    public ArrayList<PuzzleBlock> getDock() {
        return dock;
    }

    public void addPuzzleBlocks(){
        //add 3 random puzzlepieces.
        for (int i = 0; i < maxGridSize; i++){

        }
//        dock.add();
    }

    public Grid getGameGrid() {
        return gameGrid;
    }
}
