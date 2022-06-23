package inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import outscreen.MainInterface;

public class MainMouseListener implements MouseListener, MouseMotionListener {

    private MainInterface mainInterface;

    public MainMouseListener(MainInterface mainInterface) { this.mainInterface = mainInterface; }

    @Override
    public void mouseMoved(MouseEvent e) {
        mainInterface.getMainMenu().mouseMoved(e.getX(), e.getY());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mainInterface.getMainMenu().mouseClicked(e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mainInterface.getMainMenu().mousePressed(e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mainInterface.getMainMenu().mouseReleased(e.getX(), e.getY());
    }

    @Override
    public void mouseDragged(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

}
