package Model;

import java.util.ArrayList;

public class Game implements Runnable{

    private Grid gameGrid;
    private ArrayList<PuzzleBlock> dock;

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
    }

    public Grid getGameGrid() {
        return gameGrid;
    }
}
