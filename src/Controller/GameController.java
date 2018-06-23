package Controller;

import java.util.List;

import Model.Filereader;
import Model.Game;
import View.MainFrame;

public class GameController {

    MainFrame mainFrame;
    Game game;
    Filereader filereader;
    List<String> puzzleShapes;

    public GameController() {
        mainFrame = new MainFrame(this);
        game = new Game();
        filereader = new Filereader();

        //add list of puzzleshapes
        puzzleShapes =  filereader.readFile("C:\\Users\\mredw\\Workpace Neon\\Convinzed\\TentamenProg4\\Config\\config.txt");
        System.out.println(puzzleShapes.get(0));
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
