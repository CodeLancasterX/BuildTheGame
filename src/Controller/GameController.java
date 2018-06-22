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
}
