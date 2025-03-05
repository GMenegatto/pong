package game.entity.control.type;

import game.entity.element.Paddle;

public interface MovementStrategy {
    void move(Paddle paddle);
}
