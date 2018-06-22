package Controller;

import Model.Filereader;
import Model.Game;
import View.MainFrame;

import java.util.ArrayList;
import java.util.List;

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

        for (int i = 0; i < puzzleShapes.size(); i++) {
            game.addPuzzleBlocks(puzzleShapes.get(i));
        }

    }

    public Game getGame() {
        return game;
    }

    public MainFrame getMainFrame() {
        return mainFrame;
    }

}
