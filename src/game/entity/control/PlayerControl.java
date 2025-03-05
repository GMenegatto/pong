package game.entity.control;

import game.entity.control.type.MoveDown;
import game.entity.control.type.MoveUp;
import game.entity.element.Paddle;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerControl {

    private final Paddle control;
    private final KeyListenerImpl keyListener;

    public PlayerControl(Paddle control, KeyListenerImpl keyListener) {
        this.control = control;
        this.keyListener = keyListener;
    }

    public void update() {
        if (keyListener.isKeyPressed(KeyEvent.VK_UP)) {
            control.setStrategy(new MoveUp());
            control.move();
        }
        if (keyListener.isKeyPressed(KeyEvent.VK_DOWN)) {
            control.setStrategy(new MoveDown());
            control.move();
            System.out.println("Down");
        }
    }


}
