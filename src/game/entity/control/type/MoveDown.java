package game.entity.control.type;

import game.entity.element.Paddle;

public class MoveDown implements MovementStrategy {

    @Override
    public void move(Paddle paddle) {
        paddle.getPosition().setY(paddle.getPosition().getY() + 1);
    }
}
