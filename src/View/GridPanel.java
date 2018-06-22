package View;

import javax.swing.*;
import java.awt.*;

public class GridPanel extends JPanel {

    public GridPanel(){
        this.setLayout(new GridLayout(10,10));
        this.setPreferredSize(new Dimension(400,400));
        this.setBackground(Color.yellow);
    }

}
