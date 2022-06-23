package outscreen;

import java.awt.Graphics;
import ui.MyButton;

public class MainMenu{
    private MyButton bGoldMiner, bTowerDefense, bQuit;
    private MainInterface mainInterface;

    public MainMenu (MainInterface mainInterface) {
        this.mainInterface = mainInterface;
        initButtons();
    }

    private void initButtons() {
        int w = 150;
        int h = w / 3;
        int x = 640 / 2 - w / 2;
        int y = 150;
        int yOffset = 100;

        bGoldMiner = new MyButton("捞书人", x, y, w, h);
        bTowerDefense = new MyButton("塔防", x, y + yOffset, w, h);
        bQuit = new MyButton("退出", x, y + yOffset * 2, w, h);

    }

    public void render(Graphics g) { drawButtons(g); }

    private void drawButtons(Graphics g) {
        bGoldMiner.draw(g);
        bTowerDefense.draw(g);
        bQuit.draw(g);
    }

    public void mouseClicked(int x, int y) {
        if (bGoldMiner.getBounds().contains(x, y)) this.mainInterface.runGoldMiner();
        else if (bTowerDefense.getBounds().contains(x, y)) this.mainInterface.runTowerDefense();
        else if (bQuit.getBounds().contains(x, y)) System.exit(0);
    }

    public void mouseMoved(int x, int y) {
        bGoldMiner.setMouseOver(false);
        bTowerDefense.setMouseOver(false);
        bQuit.setMouseOver(false);

        if (bGoldMiner.getBounds().contains(x, y)) bGoldMiner.setMouseOver(true);
        else if (bTowerDefense.getBounds().contains(x, y)) bTowerDefense.setMouseOver(true);
        else if (bQuit.getBounds().contains(x, y)) bQuit.setMouseOver(true);

    }

    public void mousePressed(int x, int y) {
        if (bGoldMiner.getBounds().contains(x, y)) bGoldMiner.setMousePressed(true);
        else if (bTowerDefense.getBounds().contains(x, y)) bTowerDefense.setMousePressed(true);
        else if (bQuit.getBounds().contains(x, y)) bQuit.setMousePressed(true);
    }

    public void mouseReleased(int x, int y) { resetButtons(); }

    private void resetButtons() {
        bGoldMiner.resetBooleans();
        bTowerDefense.resetBooleans();
        bQuit.resetBooleans();
    }
}
