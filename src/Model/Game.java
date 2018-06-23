package Model;

import Controller.GameController;

import java.util.ArrayList;
import java.util.Random;

public class Game implements Runnable{

    private Grid gameGrid;
    private ArrayList<PuzzleBlock> dock;
    private int currentScore;
    private int topScore;
    private final int maxDockSize = 3;

    public Game(GameController gameController){
        gameGrid = new Grid(gameController);
        dock = new ArrayList<PuzzleBlock>();
        checkTopScore();
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
                System.out.print(puzzleBlock.getBlockShape()[y][x]+ " ");
                System.out.print(y + " " + x);
                System.out.println(" ");

            } else {
                System.out.print(puzzleBlock.getBlockShape()[y][x]+ " ");
                System.out.print(y + " " + x);
                System.out.print(" ");
            }


            }
        }

    }

    public void generateRandomBlock(){
        Random random = new Random();
        for (int i = 0; i < maxDockSize; i++){
            random.nextInt(19);

        }

    }

    public Grid getGameGrid() {
        return gameGrid;
    }

	public int getCurrentScore() {
		return currentScore;
	}

	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}

	public int getTopScore() {
		return topScore;
	}

	public void setTopScore(int topScore) {
		this.topScore = topScore;
	}

	public void checkTopScore() {
		if(currentScore > topScore) {
			topScore = currentScore;
		}
	}

}
