package View;

import Controller.GameController;

import javax.swing.*;
import java.awt.*;

public class ContentPanel extends JPanel {

    public ContentPanel(GameController gameController){
        this.setLayout(new BorderLayout());
        InfoPanel infoPanel = new InfoPanel();
        GridPanel gridPanel = new GridPanel(gameController);
        DockPanel dockPanel = new DockPanel();

        this.add(infoPanel, BorderLayout.PAGE_START);
        this.add(gridPanel, BorderLayout.CENTER);
        this.add(dockPanel, BorderLayout.PAGE_END);

    }

}
