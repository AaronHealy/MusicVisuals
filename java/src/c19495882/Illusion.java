package c19495882;

import processing.core.*;

public class Illusion {

    AaronsVisual il;
    float angle;
    float height;
    float width;
    float x = width;
    float dia = 150;
    int num = 100;

    public Illusion(AaronsVisual il)
    {
        this.il=il;
    }

    public void render()
    {
        //center sphere
        il.pushMatrix();
        il.strokeWeight(1);
        il.translate(il.width/2, il.height/2);
        il.sphere(150 * il.getAmplitude() * 7); 
        il.stroke(PApplet.map(il.getSmoothedAmplitude()* 15, 0, 1, 0, 255), 255, 255);
        il.popMatrix();

        //pattern of ellipse
        il.translate(il.width/2f, il.height/2f);
        il.stroke(PApplet.map(il.getSmoothedAmplitude()* 1, 0, 1, 0, 255), 255, 255);
        for (float a=0; a<360; a+=22.5)
        {
            il.rotate(PApplet.radians(a));
            for (int i=0; i<num; i++)
            {
                il.scale(1.05f);
                il.rotate(PApplet.radians(angle));
                il.ellipse(x, 0, dia, dia);
            }
           
            for (int i=0; i<num; i++)
            {
                il.scale(1.05f);
                il.rotate(-PApplet.radians(angle));
                il.ellipse(x, 0, dia, dia);
            }
            angle+=0.01;
            
        }
        
    }
}
