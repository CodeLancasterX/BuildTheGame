package Model;

import java.util.ArrayList;
import java.util.Random;

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

    public void addPuzzleBlocks(String representation){
        //add 3 random puzzlepieces.
        PuzzleBlock puzzleBlock = new PuzzleBlock(representation);
        for (int y = 0; y < 5; y++){
            for (int x = 0; x < 5; x++){

            //TODO show the right shapes in console. first shape should be -> true false false false false.
            puzzleBlock.getBlockShape();
            if (x == 4){
                System.out.print(puzzleBlock.getBlockShape()[0][x]+ " ");
                System.out.print(y + " " + x);
                System.out.println(" ");

            } else {
                System.out.print(puzzleBlock.getBlockShape()[0][x]+ " ");
                System.out.print(y + " " + x);
                System.out.print(" ");
            }


            }
        }

    }

    public void generateRandomBlock(){
        Random random = new Random();
        random.nextInt(19);
    }

    public Grid getGameGrid() {
        return gameGrid;
    }
}
