package c19495882;

import processing.core.*;

public class Triangle 
{
    //variables
    AaronsVisual tr;
    float width;
    float height;
    float y = 400;
    float x = 400;
    float angle;
    float dia = 20;

    public Triangle(AaronsVisual tr)
    {
        this.tr=tr;
    }

    public void render()
    {   

        tr.translate(tr.width/2f, tr.height/2f); //make center screen
        tr.rotate(PApplet.radians(14+angle/3));
        tr.beginShape();
        for (float a = 0; a < 360; a+=10)  // for loop to rotate line in increments
        {   
            tr.pushMatrix();
            if(angle<360) //if statement for effect in first 360 degrees
            {
                tr.rotate(PApplet.radians(a)*PApplet.cos(PApplet.radians(angle)));
            }
            else
            {
                tr.rotate(PApplet.radians(a));
            }
            tr.stroke(PApplet.map(tr.getSmoothedAmplitude()*3, 0, 1, 0, 255), 255, 255); //colour x3
            tr.strokeWeight(3);
            tr.line(x*PApplet.sin(PApplet.radians(angle)), 0, 0, y-dia/2); //render ellipse shape
            tr.endShape();

            tr.noStroke();
            tr.fill(255);
            tr.ellipse(x*PApplet.sin(PApplet.radians(angle)), 0, dia/2, dia/2); //render ellipse shape
            tr.stroke(PApplet.map(tr.getSmoothedAmplitude()*3, 0, 1, 0, 255), 255, 255); //colour x3
            tr.noFill();
            tr.ellipse(0, y, dia, dia);
            tr.popMatrix();
        }
        angle++;
        
    }

}




    

