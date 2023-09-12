package Bonus;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


/**
 * 2048 class game
 */
public class bonusB extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP :
                test.moove(0, -1, test.tab);
                test.displayTab(test.tab);
                break;
            case KeyEvent.VK_DOWN:
                test.moove(0, 1, test.tab);
                test.displayTab(test.tab);
                break;
            case KeyEvent.VK_LEFT :
                test.moove(-1, 0, test.tab);
                test.displayTab(test.tab);
                break;
            case KeyEvent.VK_RIGHT :
                test.moove(1, 0, test.tab);
                test.displayTab(test.tab);
                break;
        }
    }
}
