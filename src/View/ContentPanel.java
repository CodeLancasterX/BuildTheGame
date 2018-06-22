package View;

import javax.swing.*;
import java.awt.*;

public class ContentPanel extends JPanel {

    public ContentPanel(){
        this.setLayout(new BorderLayout());
        InfoPanel infoPanel = new InfoPanel();
        GridPanel gridPanel = new GridPanel();
        DockPanel dockPanel = new DockPanel();

        this.add(infoPanel, BorderLayout.PAGE_START);
        this.add(gridPanel, BorderLayout.CENTER);
        this.add(dockPanel, BorderLayout.PAGE_END);

    }

}
