package game.entity.element;

import game.entity.base.Position;
import game.entity.control.type.MovementStrategy;

import java.awt.*;

public class Paddle {

    private int width, height;

    private Position position;

    private Color color;

    private MovementStrategy strategy;

    public Paddle(int width, int height, Position position, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.position = position;
    }

    public void draw(Graphics2D d) {
        d.setColor(color);
        d.fillRect(position.getX(), position.getY(), width, height);
    }

    public MovementStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(MovementStrategy strategy) {
        this.strategy = strategy;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void move() {
        strategy.move(this);
    }

}
