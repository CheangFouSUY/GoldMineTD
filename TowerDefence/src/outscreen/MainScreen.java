package outscreen;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import inputs.MainMouseListener;

public class MainScreen extends JPanel {
    private MainInterface mainInterface;
    private Dimension size;

    private MainMouseListener myMouseListener;

    public MainScreen(MainInterface mainInterface) {
        this.mainInterface = mainInterface;
        setPanelSize();
    }

    public void initInputs() {
        myMouseListener = new MainMouseListener(mainInterface);
        addMouseListener(myMouseListener);
        addMouseMotionListener(myMouseListener);
    }

    private void setPanelSize() {
        size = new Dimension(640, 500);
        this.mainInterface.setLocationRelativeTo(null);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        mainInterface.getMainMenu().render(g);
    }
}
