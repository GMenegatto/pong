package game.entity.element;

import game.entity.base.Position;

import java.awt.*;

public class PaddleFactory {

    public static Paddle createPlayerPaddle() {
        return new Paddle(20, 200, new Position(30, 70), Color.white);
    }

    public static Paddle createAIPaddle() {
        return new Paddle(20, 200, new Position(750, 70), Color.red);
    }

    public static Paddle createBall() {
        return new Paddle(20, 20, new Position(400, 300), Color.white);
    }

}
