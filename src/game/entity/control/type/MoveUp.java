package game.entity.control.type;

import game.entity.element.Paddle;

public class MoveUp implements MovementStrategy {

    @Override
    public void move(Paddle paddle) {
        paddle.getPosition().setY(paddle.getPosition().getY() - 1);
    }
}
