import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }
    public void setting(){
        size (400,400);
        
    }
    public void setup(){
        background (173,216,230);
        fill (200,0,0);
        stroke(255);
        strokeWeight(2);
        rect(35,15,30,15);
        fill (137,34,1);
        stroke(79,55,39);
        strokeWeight(2);
        triangle (10,50,50,75,90,50);
        strokeWeight(3);
        stroke(255,255,0);
        line(50, 32, 50, 48);
        fill(0,0,255);
        stroke(144, 213, 255);
        strokeWeight(1);
        rect(0,65,400,200);
        fill(0);
        ellipse(50,25,10,5);
    

    }
}
