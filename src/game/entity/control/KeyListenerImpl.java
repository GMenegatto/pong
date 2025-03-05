package game.entity.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerImpl implements KeyListener {
    private boolean keyPressed[] = new boolean[128];

    private static final KeyListenerImpl INSTANCE = new KeyListenerImpl();

    private KeyListenerImpl() {}

    public static KeyListenerImpl getInstance() {
        return INSTANCE;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyPressed[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyPressed[e.getKeyCode()] = false;
    }

    public boolean isKeyPressed(int keyCode) {
        return keyPressed[keyCode];
    }
}
