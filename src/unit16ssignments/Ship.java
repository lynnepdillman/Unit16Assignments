package StarFighter;

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

//use starfighter and outerspace to test
public class Ship extends MovingThing {

    private int speed;
    private Image image;

    public Ship() {
        this(10, 10, 10, 10, 10);
    }

    public Ship(int x, int y) {
        super(x, y);
    }

    public Ship(int x, int y, int s) {
        //add code here
        super(x, y);
        speed = s;

    }

    public Ship(int x, int y, int w, int h, int s) {
        super(x, y, w, h);
        speed = s;
        try {
            URL url = getClass().getResource("/images/ship.jpg");
            image = ImageIO.read(url);
        } catch (Exception e) {
            //feel free to do something here
        }
    }

    public void setSpeed(int s) {
        //add more code
        speed = s;
    }

    public int getSpeed() {
        return speed;
    }

    public void move(String direction) {
        if (direction.equals("DOWN")) {
            super.setY(super.getY() + getSpeed());
        }
        if (direction.equals("UP")) {
            super.setY(super.getY() - getSpeed());
        }
        if (direction.equals("LEFT")) {
            super.setX(super.getX() - getSpeed());
        }
        if (direction.equals("RIGHT")) {
            super.setX(super.getX() + getSpeed());
        }
    }

    public void draw(Graphics window) {
        window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
    }

    public String toString() {
        return super.toString() + getSpeed();
    }
}
