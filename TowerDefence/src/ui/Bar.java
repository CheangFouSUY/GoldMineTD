package ui;

import java.awt.Color;
import java.awt.Graphics;

public class Bar {

    protected int x, y, width, height;

    public Bar(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    protected void drawButtonFeedback(Graphics g, MyButton btn) {
        // MouseOver
        if (btn.isMouseOver()) g.setColor(Color.white);
        else g.setColor(Color.BLACK);

        // Border
        g.drawRect(btn.x, btn.y, btn.width, btn.height);

        // MousePressed
        if (btn.isMousePressed()) {
            g.drawRect(btn.x + 1, btn.y + 1, btn.width - 2, btn.height - 2);
            g.drawRect(btn.x + 2, btn.y + 2, btn.width - 4, btn.height - 4);
        }
    }
}
