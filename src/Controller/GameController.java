package Controller;

import Model.Filereader;
import Model.Game;
import View.MainFrame;

public class GameController {

    MainFrame mainFrame;
    Game game;

    public GameController() {
        mainFrame = new MainFrame(this);
        game = new Game();
        Filereader filereader = new Filereader();
    }

    public Game getGame() {
        return game;
    }

    public MainFrame getMainFrame() {
        return mainFrame;
    }
}
