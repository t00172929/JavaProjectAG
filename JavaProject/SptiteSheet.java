
import java.awt.image.BufferedImage;

public class SptiteSheet {

    public BufferedImage spriteSheet;

    public SptiteSheet(BufferedImage ss) {
    	
    	this.spriteSheet = ss;
    }
    
    public BufferedImage getSprite(int x,int y,int width,int height)
    {
    	BufferedImage sprite = spriteSheet.getSubimage(x,y,width,height);
    	return sprite;
    	
    }
    
    
}