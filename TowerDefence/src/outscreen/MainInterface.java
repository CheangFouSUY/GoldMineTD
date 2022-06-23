package outscreen;

import javax.swing.*;
import main.Game;
import goldminer.GameWin;


public class MainInterface extends JFrame {

    private MainScreen mainScreen;
    private MainMenu mainMenu;
   

    public void runGoldMiner() {
        GameWin gmGame = new GameWin();
        gmGame.launch();
    }
    
    public void runTowerDefense() {
        Game tdGame = new Game();
        tdGame.getGameScreen().initInputs();
        tdGame.start();
    }

    

    public MainInterface() {
        this.mainScreen = new MainScreen(this);
        this.mainMenu = new MainMenu(this);
        this.mainScreen.initInputs();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(640, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setTitle("捞书人与塔防游戏");
        add(mainScreen);
        pack();
        this.setVisible(true);
    }

    public MainMenu getMainMenu() { return this.mainMenu; }

     public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
           public void run() {
                MainInterface game = new MainInterface();
           }
        });
     }
}
