import java.util.List;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
//EVERY SINGLE ANIMATION RELATED CODE FROM https://www.youtube.com/playlist?list=PLBD531C86EDDB7711
public class Animator {

private  ArrayList <BufferedImage> frames;
public BufferedImage sprite;
private volatile boolean running = false;
private long beforeTime,previousTime,speed;
private int timeAtPause,currentFrame;

    public Animator(ArrayList<BufferedImage> frames) {
    	this.frames = frames;
    	
    }
    
    public void update(long time)
    {
    	if(running)
    	{
    	 if (time - previousTime >= speed)
    	 {
    	 	//update animation
    	 	currentFrame++;
    	 	try{
    	 		sprite = frames.get(currentFrame);
    	 		
    	 	}catch(IndexOutOfBoundsException e)
    	 	{
    	 		currentFrame =0;
    	 		sprite = frames.get(currentFrame);
    	 	}
    	 	previousTime = time;
    	 	//System.out.print(currentFrame+"   ");
    	 	if (currentFrame >= 30)
    	 	{
    	 		stop();
    	 	}
    	 	
    	 }
    		
    		
    	}
    	
    }
    public void start()
    {
    	running = true;
    	previousTime =0;
    	timeAtPause =0;
    	currentFrame=0;
    }
    public void stop()
    {
    	running =false;
    	previousTime =0;
    	timeAtPause =0;
    	currentFrame=0;
    }
    public void setSpeed(long speed)
    {
    	this.speed = speed;
    }
    public void pause()
    {
    	timeAtPause = currentFrame;
    	running = false;
    }
    public void resume()
    {
    	//currentFrame = timeAtPause;
    	running = true;
    }
    public  int getFrameLength()
    {
    	int len = frames.size();
    	return len;
    	
    }
    public void setFrame(int currentFrame)
    {
    	this.currentFrame = currentFrame;
    }
    public  int getCurrentFrame()
    {
    	return currentFrame;
    }
}