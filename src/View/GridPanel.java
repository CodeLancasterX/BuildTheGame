package View;

import Controller.GameController;

import javax.swing.*;
import java.awt.*;

public class GridPanel extends JPanel {

    private final int gridWidth = 400;
    private final int gridHeight = 400;

    public GridPanel(GameController gameController){
        this.setLayout(new GridLayout(10,10));
        this.setPreferredSize(new Dimension(gridWidth,gridHeight));
        this.setBackground(Color.darkGray);
    }

    public int getGridWidth() {
        return gridWidth;
    }

    public int getGridHeight() {
        return gridHeight;
    }
}
