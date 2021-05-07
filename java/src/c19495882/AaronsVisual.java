package c19495882;

import ie.tudublin.Visual;
import java.util.*;

public class AaronsVisual extends Visual
{
    boolean sphere = false;
    boolean triangle = false;
    Sphere av;
    Triangle tr;


    public void settings()
    {
        size(800, 800, P3D);
        //fullScreen(P3D, SPAN);
       
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            
        }
        if (key == '1')
        {
            getAudioPlayer().pause();

        }
        if (key == '2')
        {
            getAudioPlayer().play();

        }
        if (key == '3')
        {
            sphere = ! sphere;
            triangle = false;
          
            
        }
        if (key == '4')
        {
            triangle = ! triangle;
            sphere = false;
          
        }
    }


    public void setup()
    {
        colorMode(HSB, 100);
        
        setFrameSize(256);

        startMinim();
        loadAudio("TouchMe.mp3");
        //getAp().play();
        //startListening(); 
        av = new Sphere(this);
        tr = new Triangle(this);
        
    }


    public void draw()
    {
        background(0);
        calculateAverageAmplitude();
        calculateFrequencyBands();
    if (sphere)
    {
        av.render();
    } 
    if (triangle)
    {
        tr.render();
    }
}
}