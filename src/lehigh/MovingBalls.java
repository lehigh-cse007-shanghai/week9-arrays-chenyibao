package lehigh;

import processing.core.PApplet;

public class MovingBalls extends PApplet{
    float []x=new float[100];
    float []y=new float[100];
    float speedx[]=new float[100];
    float speedy[]=new float[100];
    float color[][]=new float[100][100];

    public void settings(){
        size(500, 500);
        for (int i = 0; i <10 ; i++) {
            x[i]=(int)(random(60,440));
            y[i]=(int)(random(60,440));
            speedx[i]=(int)(random(1,5));
            speedy[i]=(int)(random(1,5));
            color[i]=new float[]{random(225),random(255),random(255)};
        }
    }

    public void draw(){
        background(255);
        for (int j=0;j<10;j++){
            ellipse(x[j], y[j], 40, 40);
            x[j]=x[j]+speedx[j];
            y[j]=y[j]+speedy[j];
            fill(color[j][0],color[j][1],color[j][2]);
        }

        for (int j=0;j<10;j++){
            if (x[j]<40||x[j]>460){
                speedx[j]*=-1;
            }
            if(y[j]<40||y[j]>460){
                speedy[j]*=-1;
            }
        }
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                float X = Math.abs(x[i] - x[j]);
                float Y = Math.abs(y[i] - y[j]);
                if(X <= 80 && Y <= 80){
                    line(x[i],y[i],x[j],y[j]);
                }
            }
        }

    }

    public static void main(String[] args) {
        String[] processingArgs = {"MovingBalls"};
        MovingBalls movingBalls = new MovingBalls();
        PApplet.runSketch(processingArgs, movingBalls);
    }
}