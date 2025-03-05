package structure;

import game.entity.base.Time;
import game.entity.control.KeyListenerImpl;
import game.entity.control.PlayerControl;
import game.entity.element.Paddle;
import game.entity.element.PaddleFactory;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements Runnable {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    Graphics2D graphics2D;

    Paddle playerOne;
    Paddle playerTwo;
    Paddle ball;

    final KeyListenerImpl keyListener = KeyListenerImpl.getInstance();

    PlayerControl control;

    public MainFrame() {
        setSize(WIDTH, HEIGHT);
        setTitle("Pong");
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addKeyListener(keyListener);
        setVisible(true);

        graphics2D = (Graphics2D)this.getGraphics();

        playerOne = PaddleFactory.createPlayerPaddle();
        playerTwo = PaddleFactory.createAIPaddle();
        ball = PaddleFactory.createBall();
        control = new PlayerControl(playerOne, keyListener);
    }

    public void update(double dt) {
        redrawElements();
        control.update();
    }

    private void redrawElements() {
        playerOne.draw(graphics2D);
        playerTwo.draw(graphics2D);
        ball.draw(graphics2D);
    }

    @Override
    public void run() {
        var lastTime = 0.0;

        while (true) {
            var time = Time.getTime();
            var deltaTime = time - lastTime;
            lastTime = time;

            update(deltaTime);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
