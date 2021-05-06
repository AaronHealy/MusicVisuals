package c19495882;

import ie.tudublin.Visual;
import java.util.*;

public class AaronsVisual extends Visual
{
    boolean twocubes = false;
    boolean sphere = false;
    Sphere av;
    

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
            getAudioPlayer().play();
            
        }
        if (key == '1')
        {
            getAudioPlayer().pause();

        }
        if (key == '2')
        {
            sphere = ! sphere;
            
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
}
}