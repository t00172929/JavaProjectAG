import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.awt.Image;
import javax.swing.*;
import java.util.ArrayList;


public class AnimationTest2 extends JPanel {

BufferedImage sprite;
private Animator sword;
private MyCharacter player;
private MyCharacter Ai;

    public AnimationTest2() {
    	
    	setSize(800,200);
    
    	
//    	setResizable(false);
//    	setDefaultCloseOperation(EXIT_ON_CLOSE);
//    	setLocationRelativeTo(null);
    //	setVisible(true);
    	player = CreateTeam.myChar;
    	Ai = new MyCharacter("Ai");
        //player = CreateTeam.myChar;
    	
    	Animations.setPlayAnim(player.getName());
    	Animations.setCpuAnim(Ai.getName());
    	System.out.println(player.getName());
    	//init();
    	
    	Stats fighting = new Stats(player,Ai);
    	//fighting.setVisible(true);
    	//fighting.fight(player,Ai);
    	
    	
    }

    public void init()
    {
    	BufferedImageLoader loader = new BufferedImageLoader();
    	BufferedImage spriteSheet = null;
    	
    	try{
    	
    	spriteSheet = loader.loadImage("ArmourFlip.png");
    	}
    	catch (IOException ex)
    	{
    		Logger.getLogger(AnimationTest2.class.getName()).log(Level.SEVERE,null, ex);
    	}
    	SpriteSheet ss = new SpriteSheet(spriteSheet);
    	ArrayList <BufferedImage> sprites = new ArrayList<BufferedImage>();
    	//width spacing is 190
    
    	
    	sprites.add(ss.getSprite(825,80,110,110));//5
    	sprites.add(ss.getSprite(635,80,110,110));//4
    	sprites.add(ss.getSprite(445,80,110,110));//3
    	sprites.add(ss.getSprite(255,80,110,110));//2
    	sprites.add(ss.getSprite(65,80,110,110));//1
    	
    	sprites.add(ss.getSprite(825,270,110,110));//10
    	sprites.add(ss.getSprite(635,270,110,110));//9
    	sprites.add(ss.getSprite(445,270,110,110));//8
    	sprites.add(ss.getSprite(255,270,110,110));//7
    	sprites.add(ss.getSprite(65,270,110,110));//6
    	
    	sprites.add(ss.getSprite(825,460,110,110));//15
    	sprites.add(ss.getSprite(635,460,110,110));//14
    	sprites.add(ss.getSprite(445,460,110,110));//13
    	sprites.add(ss.getSprite(255,460,110,110));//12
    	sprites.add(ss.getSprite(65,460,110,110));//11
    	
    	
    	
    	
    	
    	
    	
    	//vert spacing is 190//270 is row two
   	    
    	
    	
    	
    	
    	//460 is row three
     	
    	
    	
    	
    	sprites.add(ss.getSprite(825,80,110,110));
    	sprites.add(ss.getSprite(825,80,110,110));
    	sprites.add(ss.getSprite(825,80,110,110));
    	sprites.add(ss.getSprite(825,80,110,110));
    	sprites.add(ss.getSprite(825,80,110,110));
    	
    	sprites.add(ss.getSprite(825,80,110,110));
    	sprites.add(ss.getSprite(825,80,110,110));
    	sprites.add(ss.getSprite(825,80,110,110));
    	sprites.add(ss.getSprite(825,80,110,110));
    	sprites.add(ss.getSprite(825,80,110,110));
    	
    	sprites.add(ss.getSprite(825,80,110,110));
    	sprites.add(ss.getSprite(825,80,110,110));
    	sprites.add(ss.getSprite(825,80,110,110));
    	sprites.add(ss.getSprite(825,80,110,110));
    	sprites.add(ss.getSprite(825,80,110,110));
    	sprites.add(ss.getSprite(825,80,110,110));
    	
	sword = new Animator(sprites);
	sword.setSpeed(80);
	Animations.setPlayAnim("Mercenary");
	sword = Animations.getPlyAnim();
	 
	if(sword.getCurrentFrame() < sword.getFrameLength())
	{
	
	sword.start();
	}

    }
   /*Image dbImage;
    Graphics dbg;
    
    public void paint(Graphics g)
    {
    	dbImage = createImage(getWidth(),getHeight());
    	dbg = dbImage.getGraphics();
    	paintComponent(dbg);
    	g.drawImage(dbImage,0,0,null);
    	//g.drawImage(sprite,100,100,null);
    	
    	repaint();
    	
    }
    public void paintComponent(Graphics g)
    {
    		
    	if(sword != null)
    	{
    		sword.update(System.currentTimeMillis());
    		g.drawImage(sword.sprite,100,100,null);
    		repaint();
    	}
    	
    }
    */
    public static void main(String[] args) {
        AnimationTest2 a2 = new AnimationTest2();
       
    }
}
