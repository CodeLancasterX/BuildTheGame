package Model;

import java.util.ArrayList;

public class Game implements Runnable{

    private Grid gameGrid;
    private ArrayList<PuzzleBlock> dock;
    private int currentScore;
    private int topScore;

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
}
