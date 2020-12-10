package lehigh;

import processing.core.PApplet;

import java.util.ArrayList;

public class MovingBallTwo extends PApplet {
    class Ball {
        int x;
        int y;
        int speedX;
        int speedY;
        float[] color;

        Ball() {
            x = (int) (random(60, 440));
            y = (int) (random(60, 440));
            speedX = (int) (random(1, 5));
            speedY = (int) (random(1, 5));
            color = new float[]{random(225), random(255), random(255)};
        }
    }

    ArrayList<Ball> abc = new ArrayList();

    public void settings() {
        size(500, 500);
        for (int i = 0; i < 10; i++) {
            abc.add(new Ball());
        }
    }

    public void draw() {
        background(255);

        for (int i = 0; i < abc.size(); i++) {
            ellipse(abc.get(i).x, abc.get(i).y, 40, 40);
            abc.get(i).x = abc.get(i).x + abc.get(i).speedX;
            abc.get(i).y = abc.get(i).y + abc.get(i).speedY;
        }

        for (int j = 0; j < abc.size(); j++) {
            if (abc.get(j).x < 40 || abc.get(j).x > 460) {
                abc.get(j).speedX *= -1;
            }
            if (abc.get(j).y < 40 || abc.get(j).y > 460) {
                abc.get(j).speedY *= -1;
            }
        }


    }
    public static void main(String[] args) {
        String[] processingArgs = {"MovingBalls"};
        MovingBalls movingBalls = new MovingBalls();
        PApplet.runSketch(processingArgs, movingBalls);
    }

}
