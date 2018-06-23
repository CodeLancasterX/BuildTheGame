package Model;

import java.util.ArrayList;

public class Game implements Runnable{

    private Grid gameGrid;
    private ArrayList<PuzzleBlock> dock;
    private int currentScore;
    private int topScore;
    private final int maxGridSize = 3;

    public Game(){
        gameGrid = new Grid();
        dock = new ArrayList<PuzzleBlock>();
        checkTopScore();
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
