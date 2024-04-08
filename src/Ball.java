import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle {
    Random random;
    int xVelocity=5;
    int yVelocity=5;

    Ball(int x, int y, int width, int height){
        super(x,y,width,height);
    }
    public void setXDirection(int randomXDirection){
        xVelocity=randomXDirection;
    }
    public void setYDirection(int randomYDirection){
        yVelocity=randomYDirection;
    }
    public void move(){
        x+=xVelocity;
        y+=yVelocity;
    }

    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval(x,y,GamePanel.BALL_DIAMETER, GamePanel.BALL_DIAMETER);

    }
}
