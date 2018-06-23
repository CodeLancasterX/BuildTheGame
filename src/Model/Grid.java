package Model;

import Controller.GameController;

public class Grid {

    private final int gridHeight = 10;
    private final int gridWidth = 10;
    private GameController gameController;
//    private HashMap<char, >

    public Grid(GameController gameController){
        this.gameController = gameController;
        System.out.println(gameController.getConfigFile().isEmpty());
        if (gameController.getConfigFile().isEmpty()){
            //TODO create default grid.
            createDefaultGrid();
        }
    }

    public void createDefaultGrid(){
        //this will be used when the text file (config) is empty.
        for (int y = 0; y < gridHeight; y++){
            for (int x = 0; x < gridWidth; x++){

            }
        }
    }

}
