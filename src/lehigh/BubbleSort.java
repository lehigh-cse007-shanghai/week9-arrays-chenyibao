package lehigh;

import processing.core.PApplet;

public class BubbleSort extends PApplet {
    int[] arr={3,9,1,5,12,6,4,21,7,23};
    int[]a = sort(arr);
    int R=0;
    int G=0;
    int B=0;
    int alpha=255;
    int i= 0;
    int max= arr.length -1;

    public void settings() {
        size(500, 500);

    }
    public void swap(int i,int j){
    int abc=arr[i];
    arr[i]=arr[j];
    arr[j]=abc;
    }

    public void draw() {
    delay(400);
        background(255);
        if (i>= max){
            i=0;
            max--;
        }
        if (arr[i] > arr[i+1]){
            swap(i,i+1);
        }
        for(int j=0;j<arr.length-1;j++){
            if(j==i){
                fill(R,255,B,alpha);
                rect(50*(j),(float) (500-arr[j]*10),30,arr[j]*10);
                fill(R,255,B,alpha);
                rect(50*(j+1),(float) (500-arr[j+1]*10),30,arr[j+1]*10);}
            else{
                fill(R,G,B,0);
                rect(50*(j+1),(float) (500-arr[j+1]*10),30,arr[j+1]*10);
                fill(R,G,B,0);
                rect(0,(float)(500-arr[0]*10),30,arr[0]*10);
            }
        }
        for(int i1=arr.length-1;i1>=0;i1--){
            if(arr[i1]==a[i1]){
                fill(R,G,255);
                rect(50*(i1),(float) (500-arr[i1]*10),30,arr[i1]*10);
            }
        }
        i++;

    }

    public static void main(String[] args) {
        String[] processingArgs = {"BubbleSort"};
        BubbleSort movingBalls = new BubbleSort();
        PApplet.runSketch(processingArgs, movingBalls);
    }
}