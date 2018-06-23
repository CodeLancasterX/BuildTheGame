package Controller;

import java.io.File;
import java.util.ArrayList;
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
        filereader = new Filereader();
        //add list of puzzleshapes
        puzzleShapes =  filereader.readFile("src/Config/config.txt");
        mainFrame = new MainFrame(this);
        game = new Game(this);




        for (int i = 0; i < puzzleShapes.size(); i++) {
            game.addPuzzleBlocks(puzzleShapes.get(i));
            System.out.println(puzzleShapes.get(2));
            //connect puzzleshapes yo a key in a hashmap.
        }

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

    public List getConfigFile(){
        return puzzleShapes;
    }
}
