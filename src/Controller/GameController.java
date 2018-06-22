package Controller;

import Model.Game;
import View.MainFrame;

public class GameController {

    MainFrame mainFrame;
    Game game;

    public GameController() {
        mainFrame = new MainFrame(this);
        game = new Game();
    }

    public Game getGame() {
        return game;
    }

    public MainFrame getMainFrame() {
        return mainFrame;
    }
    
    public void setCurrentScore(int score) {
    	game.setCurrentScore(score);
    }
    
    public void setTopScore(int score) {
    	game.setTopScore(score);
    }
    
    public int getCurrentScore() {
    	return game.getCurrentScore();
    }
    
    public int getTopScore() {
    	return game.getTopScore();
    }
}
