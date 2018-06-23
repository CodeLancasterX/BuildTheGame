package View;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {

	private JPanel scorePanel;
	private JLabel currentScoreLabel;
	private JLabel topScoreLabel;
	private Font fontScore = new Font("Courier New", Font.PLAIN, 50);
	private Color lightBlue = new Color(0, 255, 245);
	private Color lightGreen = new Color(167, 255, 0);

    public InfoPanel(){
        this.setPreferredSize(new Dimension(400,100));
        this.setBackground(Color.black);
        
        scorePanel = new JPanel();
		scorePanel.setBackground(Color.black);
		
		currentScoreLabel = new JLabel(/*gameController.getCurrentScore()*/1+" - ");
		topScoreLabel = new JLabel(/*gameController.getTopScore()*/2+"");
		
		currentScoreLabel.setFont(fontScore);
		topScoreLabel.setFont(fontScore);
		
		currentScoreLabel.setForeground(lightGreen);
		topScoreLabel.setForeground(lightBlue);
		
		scorePanel.add(currentScoreLabel);
		scorePanel.add(topScoreLabel);
		
		this.add(scorePanel);
    }

}
