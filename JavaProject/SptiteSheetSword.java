
import java.awt.image.BufferedImage;

public class SptiteSheet {

    public BufferedImage spriteSheetSword;

    public SptiteSheetSword(BufferedImage sss) {
    	
    	this.spriteSheetSword = sss;
    }
    
    public BufferedImage getSprite(int x,int y,int width,int height)
    {
    	spriteSheetSword.getSubimage(x,y,width,height);
    	return sprite;
    	
    }
    
    
}