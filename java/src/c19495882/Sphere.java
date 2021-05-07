package c19495882;

import processing.core.*;

//class for Sphere
public class Sphere 
{

    float angle = 0;
    AaronsVisual av; 

    public Sphere(AaronsVisual av)
    {
      this.av=av;
    }

    float smoothedBoxSize = 0; 

    public void render()
    {
        av.calculateAverageAmplitude();
        av.background(0);
        av.noFill();
        av.lights();
        av.stroke(PApplet.map(av.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        av.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        av.translate(0, 0, -250);
            
        
        {
            av.pushMatrix();
            av.translate(-150, 0, 0);
            av.rotateX(angle);
            av.rotateY(angle);
            av.box(300 * av.getSmoothedAmplitude() * 2); // make box size 300, responds to music x2
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 2, 0, 1, 0, 255), 255, 255); // colours x2
            av.box(250 * av.getSmoothedAmplitude() * 2); 
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 3, 0, 1, 0, 255), 255, 255); // colours x3
            av.box(200 * av.getSmoothedAmplitude() * 2);  
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 4, 0, 1, 0, 255), 255, 255); // colours x4
            av.box(150 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 5, 0, 1, 0, 255), 255, 255); // colours x5
            av.box(100* av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 6, 0, 1, 0, 255), 255, 255); // colours x6
            av.box(50 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 7, 0, 1, 0, 255), 255, 255); // colours x7
            av.box(25 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 8, 0, 1, 0, 255), 255, 255); // colours x8
            av.box(10 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 9, 0, 1, 0, 255), 255, 255); // colours x9
            angle += 0.01f;
            av.strokeWeight(3);
            av.popMatrix();

            av.pushMatrix();
            av.translate(150, 0, 0);
            av.rotateY(angle);
            av.rotateX(angle); 
            av.box(300 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 2, 0, 1, 0, 255), 255, 255);
            av.box(250 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 3, 0, 1, 0, 255), 255, 255);
            av.box(200 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 4, 0, 1, 0, 255), 255, 255);
            av.box(150 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 5, 0, 1, 0, 255), 255, 255);
            av.box(100 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 6, 0, 1, 0, 255), 255, 255);
            av.box(50 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 7, 0, 1, 0, 255), 255, 255);
            av.box(25 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 8, 0, 1, 0, 255), 255, 255);
            av.box(10 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 9, 0, 1, 0, 255), 255, 255);
            angle += 0.01f;
            av.strokeWeight(3); 
            av.popMatrix();
        
            // center sphere
            av.pushMatrix();
            av.rotateX(angle);
            av.rotateY(angle);
            av.strokeWeight(1);
            av.sphere(50 * av.getAmplitude() * 5); 
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 2, 0, 1, 0, 255), 255, 255);
            av.popMatrix();

            //center box 
            av.rotateZ(angle);
            av.strokeWeight(1);
            av.box(100 * av.getSmoothedAmplitude() * 4);
        
            //16 rotating spheres, each different colour by * 1-16x
            av.pushMatrix();
            av.translate(20, 0, 0);
            av.sphere(30 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 1, 0, 1, 0, 255), 255, 255);
            av.popMatrix();
  
            av.pushMatrix();
            av.translate(40, 0, 0);
            av.sphere(30 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 5, 0, 1, 0, 255), 255, 255);
            av.popMatrix();

            av.pushMatrix();
            av.translate(60, 0, 0);
            av.sphere(30 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 9, 0, 1, 0, 255), 255, 255);
            av.popMatrix();

            av.pushMatrix();
            av.translate(80, 0, 0);
            av.sphere(30 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 13, 0, 1, 0, 255), 255, 255);
            av.popMatrix();

            av.pushMatrix();
            av.translate(0, 20, 0);
            av.sphere(30 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 2, 0, 1, 0, 255), 255, 255);
            av.popMatrix();
  
            av.pushMatrix();
            av.translate(0, 40, 0);
            av.sphere(30 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 6, 0, 1, 0, 255), 255, 255);
            av.popMatrix();

            av.pushMatrix();
            av.translate(0, 60, 0);
            av.sphere(30 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 10, 0, 1, 0, 255), 255, 255);
            av.popMatrix();

            av.pushMatrix();
            av.translate(0, 80, 0);
            av.sphere(30 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 14, 0, 1, 0, 255), 255, 255);
            av.popMatrix();

            av.pushMatrix();
            av.translate(-20, 0, 0);
            av.sphere(30 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 3, 0, 1, 0, 255), 255, 255);
            av.popMatrix();

            av.pushMatrix();
            av.translate(-40, 0, 0);
            av.sphere(30 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 7, 0, 1, 0, 255), 255, 255);
            av.popMatrix();

            av.pushMatrix();
            av.translate(-60, 0, 0);
            av.sphere(30 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 11, 0, 1, 0, 255), 255, 255);
            av.popMatrix();

            av.pushMatrix();
            av.translate(-80, 0, 0);
            av.sphere(30 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 15, 0, 1, 0, 255), 255, 255);
            av.popMatrix();

            av.pushMatrix();
            av.translate(0, -20, 0);
            av.sphere(30 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 4, 0, 1, 0, 255), 255, 255);
            av.popMatrix();

            av.pushMatrix();
            av.translate(0, -40, 0);
            av.sphere(30 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 8, 0, 1, 0, 255), 255, 255);
            av.popMatrix();

            av.pushMatrix();
            av.translate(0, -60, 0);
            av.sphere(30 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 12, 0, 1, 0, 255), 255, 255);
            av.popMatrix();

            av.pushMatrix();
            av.translate(0, -80, 0);
            av.sphere(30 * av.getSmoothedAmplitude() * 2);
            av.stroke(PApplet.map(av.getSmoothedAmplitude()* 16, 0, 1, 0, 255), 255, 255);
            av.popMatrix();


        }
    }
}



