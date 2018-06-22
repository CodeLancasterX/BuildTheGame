package View;

import Controller.GameController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MainFrame extends JFrame {

    JFileChooser myFileChooser;

    public MainFrame(GameController gameController){
        setUpGame(gameController);
//        myFileChooser = new JFileChooser();
//        myFileChooser.setCurrentDirectory(new File(System.getProperty("user.home") + System.getProperty("file.separator") + "/Desktop/Avans/programmeren/Prog 4/Week 2/pictures"));
    }



    public void setUpGame(GameController gameController){
        ContentPanel contentPanel = new ContentPanel(gameController);
        this.setTitle("Curwen Lancaster 1010");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(contentPanel);
        this.addMenu();
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void addMenu(){
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem open = new JMenuItem("open");
        this.setJMenuBar(menuBar);
        menuBar.add(menu);
        menu.add(open);

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //add method for reading files.

            }
        });
    }

}
