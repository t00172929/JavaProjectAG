import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.awt.Image;
import java.util.ArrayList;




public class Animations {
    BufferedImage sprite;
    private static ArrayList <BufferedImage> sprites = new ArrayList<BufferedImage>();
    //private static ArrayList <BufferedImage> Aisprites = new ArrayList<BufferedImage>();
    private static Animator plyAnim;
    private static Animator cpuAnim;
    
   
    public Animations() {
    	
    	sprites =null;
    	//Aisprites =null;
    }
    public static Animator getPlyAnim()
    {
    	return plyAnim;
    }
    public static Animator getCpuAnim()
    {
    	return cpuAnim;
    }
    
    public static  Animator setPlayAnim(String name)
    {
    	switch(name)
    	{
    		case"Swordsman":
    		plyAnim = swordAnim(false);
    		break;
    		
    		case "Mercenary":
    			plyAnim =mercAnim(false);
    		   break;
    		case"Soldier":
    			plyAnim = solAnim(false);
    			break;
    		case"Fighter":
    			plyAnim = figAnim(false);
    			break;
    		case"Armour":
    			plyAnim = armAnim(false);
    			break;
    		case"Cavalier":
    			plyAnim = cavAnim(false);
    			break;
    		case"Light Mage":
    			plyAnim = ligAnim(false);
    			break;
    		case"Fire Mage":
    			plyAnim = firAnim(false);
    			break;
    		case"Dark Mage":
    			plyAnim = darAnim(false);
    			break;
    		
    	}
    	
    	return plyAnim;
    	
    }
     public static  Animator setCpuAnim(String name)
    {
    	switch(name)
    	{
    		case"Swordsman":
    		cpuAnim = swordAnim(true);
    		break;
    		
    		case "Mercenary":
    			cpuAnim =mercAnim(true);
    		   break;
    		case"Soldier":
    			cpuAnim = solAnim(true);
    			break;
    		case"Fighter":
    			cpuAnim = figAnim(true);
    			break;
    		case"Armour":
    			cpuAnim = armAnim(true);
    			break;
    		case"Cavalier":
    			cpuAnim = cavAnim(true);
    			break;
    		case"Light Mage":
    			cpuAnim = ligAnim(true);
    			break;
    		case"Fire Mage":
    			cpuAnim = firAnim(true);
    			break;
    		case"Dark Mage":
    			cpuAnim = darAnim(true);
    			break;
    		
    	}
    	
    	
    	 return  cpuAnim;
    	
    }
    
    //SEETING ANIMATIONS
    private static Animator swordAnim(boolean isFlip)
    {
    	Animator myAnim;
    	BufferedImageLoader loader = new BufferedImageLoader();
    	BufferedImage spriteSheet = null;
    try{
    	if (isFlip)
    	{
    	spriteSheet = loader.loadImage("SwordFlip.png");
    	}
    	else if(!isFlip)
    	{
    	
    	spriteSheet = loader.loadImage("Sword.png");
    	}
    	}
    	catch (IOException ex)
    	{
    		Logger.getLogger(Animations.class.getName()).log(Level.SEVERE,null, ex);
    	}
    	SpriteSheet ss = new SpriteSheet(spriteSheet);
    	ArrayList <BufferedImage> sprites = new ArrayList<BufferedImage>();
    	if(isFlip)
    	{
    		//width spacing is 190
        	 sprites.add(ss.getSprite(805,30,110,110));//
    	 sprites.add(ss.getSprite(615,30,110,110));
    	 sprites.add(ss.getSprite(425,30,110,110));
    	 sprites.add(ss.getSprite(235,30,110,110));
	 sprites.add(ss.getSprite(45,30,110,110));

    	//vert spacing is 190//270 is row two
    	sprites.add(ss.getSprite(805,220,110,110));//10
    	sprites.add(ss.getSprite(615,220,110,110));//9
    	sprites.add(ss.getSprite(425,220,110,110));//8
    	sprites.add(ss.getSprite(235,220,110,110));//7
    	sprites.add(ss.getSprite(45,220,110,110));//6
    	
    	
        
    	
    	//460 is row three
    	sprites.add(ss.getSprite(805,410,110,110));//15
    	sprites.add(ss.getSprite(615,410,110,110));//14
    	sprites.add(ss.getSprite(425,410,110,110));//13
    	sprites.add(ss.getSprite(235,410,110,110));//12
    	sprites.add(ss.getSprite(45,410,110,110));//11
    	
    	
    	
    	
    	//row 4 is 650
    	sprites.add(ss.getSprite(805,600,110,110));//20
    	sprites.add(ss.getSprite(615,600,110,110));//19
    	sprites.add(ss.getSprite(425,600,110,110));//18
    	sprites.add(ss.getSprite(235,600,110,110));//17
    	sprites.add(ss.getSprite(45,600,110,110));//16
    	
    	//row 5 is 840
    	sprites.add(ss.getSprite(805,790,110,110));//25
    	sprites.add(ss.getSprite(615,790,110,110));//24
    	sprites.add(ss.getSprite(425,790,110,110));//23
    	sprites.add(ss.getSprite(235,790,110,110));//22
    	sprites.add(ss.getSprite(45,790,110,110));//21
    	
    	//row 6 is 1030
    	
    	sprites.add(ss.getSprite(805,980,110,110));//30
    	sprites.add(ss.getSprite(615,980,110,110));//29
    	sprites.add(ss.getSprite(425,980,110,110));//28
    	sprites.add(ss.getSprite(235,980,110,110));//27
    	sprites.add(ss.getSprite(45,980,110,110));//26
    	sprites.add(ss.getSprite(45,980,110,110));//31
    		
    	}
    	//END OF FLIP
    	else if(!isFlip)
    	{
    	
    	//width spacing is 190
    	sprites.add(ss.getSprite(45,30,110,110));//1
    	sprites.add(ss.getSprite(235,30,110,110));//2
    	sprites.add(ss.getSprite(425,30,110,110));//3
    	sprites.add(ss.getSprite(615,30,110,110));//4
    	sprites.add(ss.getSprite(805,30,110,110));//5
    	//vert spacing is 190//270 is row two
   	    sprites.add(ss.getSprite(45,220,110,110));//6
    	sprites.add(ss.getSprite(235,220,110,110));//7
    	sprites.add(ss.getSprite(425,220,110,110));//8
    	sprites.add(ss.getSprite(615,220,110,110));//9
    	sprites.add(ss.getSprite(805,220,110,110));//10
    	//460 is row three
     	sprites.add(ss.getSprite(45,410,110,110));//11
    	sprites.add(ss.getSprite(235,410,110,110));//12
    	sprites.add(ss.getSprite(425,410,110,110));//13
    	sprites.add(ss.getSprite(615,410,110,110));//14
    	sprites.add(ss.getSprite(805,410,110,110));//15
    	//row 4 is 650
    	sprites.add(ss.getSprite(45,600,110,110));//16
    	sprites.add(ss.getSprite(235,600,110,110));//17
    	sprites.add(ss.getSprite(425,600,110,110));//18
    	sprites.add(ss.getSprite(615,600,110,110));//19
    	sprites.add(ss.getSprite(805,600,110,110));//20
    	
    	//row 5 is 840
    	sprites.add(ss.getSprite(45,790,110,110));//21
    	sprites.add(ss.getSprite(235,790,110,110));//22
    	sprites.add(ss.getSprite(425,790,110,110));//23
    	sprites.add(ss.getSprite(615,790,110,110));//24
    	sprites.add(ss.getSprite(805,790,110,110));//25
    	//row 6 is 1030
    	sprites.add(ss.getSprite(45,980,110,110));//26
    	sprites.add(ss.getSprite(235,980,110,110));//27
    	sprites.add(ss.getSprite(425,980,110,110));//28
    	sprites.add(ss.getSprite(615,980,110,110));//29
    	sprites.add(ss.getSprite(805,980,110,110));//30
    	sprites.add(ss.getSprite(45,980,110,110));//31
    	}
	myAnim = new Animator(sprites);
	myAnim.setSpeed(80);
	myAnim.start();
	return myAnim;	
    
    }
    private static Animator mercAnim(boolean isFlip)
    {
    	Animator myAnim;
    	BufferedImageLoader loader = new BufferedImageLoader();
    	BufferedImage spriteSheet = null;
    try{
    	if(isFlip)
    	{
    	
    	spriteSheet = loader.loadImage("MercFlip.png");
    	}
    	else if(!isFlip){
    	
    	 spriteSheet =loader.loadImage("Merc.png");
    	}
    	}
    	catch (IOException ex)
    	{
    		Logger.getLogger(Animations.class.getName()).log(Level.SEVERE,null, ex);
    	}
    	SpriteSheet ss = new SpriteSheet(spriteSheet);
    	ArrayList <BufferedImage> sprites = new ArrayList<BufferedImage>();
    	if(isFlip)
    	{
    		//width spacing is 190
        	 sprites.add(ss.getSprite(805,30,110,110));//
    	 sprites.add(ss.getSprite(615,30,110,110));
    	 sprites.add(ss.getSprite(425,30,110,110));
    	 sprites.add(ss.getSprite(235,30,110,110));
	 sprites.add(ss.getSprite(45,30,110,110));

    	//vert spacing is 190//270 is row two
    	sprites.add(ss.getSprite(805,220,110,110));//10
    	sprites.add(ss.getSprite(615,220,110,110));//9
    	sprites.add(ss.getSprite(425,220,110,110));//8
    	sprites.add(ss.getSprite(235,220,110,110));//7
    	sprites.add(ss.getSprite(45,220,110,110));//6
    	
    	
        
    	
    	//460 is row three
    	sprites.add(ss.getSprite(805,410,110,110));//15
    	sprites.add(ss.getSprite(615,410,110,110));//14
    	sprites.add(ss.getSprite(425,410,110,110));//13
    	sprites.add(ss.getSprite(235,410,110,110));//12
    	sprites.add(ss.getSprite(45,410,110,110));//11
    	
    	
    	
    	
    	//row 4 is 650
    	sprites.add(ss.getSprite(805,600,110,110));//20
    	sprites.add(ss.getSprite(615,600,110,110));//19
    	sprites.add(ss.getSprite(425,600,110,110));//18
    	sprites.add(ss.getSprite(235,600,110,110));//17
    	sprites.add(ss.getSprite(45,600,110,110));//16
    	
    	//row 5 is 840
    	sprites.add(ss.getSprite(805,790,110,110));//25
    	sprites.add(ss.getSprite(615,790,110,110));//24
    	sprites.add(ss.getSprite(425,790,110,110));//23
    	sprites.add(ss.getSprite(235,790,110,110));//22
    	sprites.add(ss.getSprite(45,790,110,110));//21
    	
    	//row 6 is 1030
    	
    	sprites.add(ss.getSprite(805,980,110,110));//30
    	sprites.add(ss.getSprite(615,980,110,110));//29
    	sprites.add(ss.getSprite(425,980,110,110));//28
    	sprites.add(ss.getSprite(235,980,110,110));//27
    	sprites.add(ss.getSprite(45,980,110,110));//26
    	sprites.add(ss.getSprite(45,980,110,110));//31
    		
    	}
    	//END OF FLIP
    	else if(!isFlip)
    	{
    	
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(235,30,110,110));
    	sprites.add(ss.getSprite(425,30,110,110));
    	sprites.add(ss.getSprite(615,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	//vert spacing is 190//270 is row two
   	    sprites.add(ss.getSprite(45,220,110,110));//wa 270
    	sprites.add(ss.getSprite(235,220,110,110));
    	sprites.add(ss.getSprite(425,220,110,110));
    	sprites.add(ss.getSprite(615,220,110,110));
    	sprites.add(ss.getSprite(805,220,110,110));
    	//460 is row three
     	sprites.add(ss.getSprite(45,410,110,110));
    	sprites.add(ss.getSprite(235,410,110,110));
    	sprites.add(ss.getSprite(425,410,110,110));
    	sprites.add(ss.getSprite(615,410,110,110));
    	sprites.add(ss.getSprite(805,410,110,110));
    	//row 4 is 650
    	sprites.add(ss.getSprite(45,600,110,110));
    	sprites.add(ss.getSprite(235,600,110,110));
    	sprites.add(ss.getSprite(425,600,110,110));
    	sprites.add(ss.getSprite(615,600,110,110));
    	sprites.add(ss.getSprite(805,600,110,110));
    	
    	//row 5 is 840
    	sprites.add(ss.getSprite(45,790,110,110));
    	sprites.add(ss.getSprite(235,790,110,110));
    	sprites.add(ss.getSprite(425,790,110,110));
    	sprites.add(ss.getSprite(615,790,110,110));
    	sprites.add(ss.getSprite(805,790,110,110));
    	//row 6 is 1030
    	sprites.add(ss.getSprite(45,980,110,110));
    	sprites.add(ss.getSprite(235,980,110,110));
    	sprites.add(ss.getSprite(425,980,110,110));
    	sprites.add(ss.getSprite(615,980,110,110));
    	sprites.add(ss.getSprite(805,980,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	}
	myAnim = new Animator(sprites);
	myAnim.setSpeed(80);
	myAnim.start();	
    return myAnim;    
    }
     private static Animator solAnim(boolean isFlip)
    {
    	Animator myAnim;
    	BufferedImageLoader loader = new BufferedImageLoader();
    	BufferedImage spriteSheet = null;
    try{
    	if (isFlip)
    	{
    	
    	spriteSheet = loader.loadImage("SoldierFlip.png");
    	}
    	else if(!isFlip)
    	{
    	
    	spriteSheet = loader.loadImage("Soldier.png");
    	}
    	}
    	
    	catch (IOException ex)
    	{
    		Logger.getLogger(Animations.class.getName()).log(Level.SEVERE,null, ex);
    	}
    	SpriteSheet ss = new SpriteSheet(spriteSheet);
    	// last 13 are dummy
    	ArrayList <BufferedImage> sprites = new ArrayList<BufferedImage>();
    	if(isFlip)
    	{
    		//width spacing is 190
        	 sprites.add(ss.getSprite(805,30,110,110));//
    	 sprites.add(ss.getSprite(615,30,110,110));
    	 sprites.add(ss.getSprite(425,30,110,110));
    	 sprites.add(ss.getSprite(235,30,110,110));
	 sprites.add(ss.getSprite(45,30,110,110));

    	//vert spacing is 190//270 is row two
    	sprites.add(ss.getSprite(805,220,110,110));//10
    	sprites.add(ss.getSprite(615,220,110,110));//9
    	sprites.add(ss.getSprite(425,220,110,110));//8
    	sprites.add(ss.getSprite(235,220,110,110));//7
    	sprites.add(ss.getSprite(45,220,110,110));//6
    	
    	
        
    	
    	//460 is row three
    	sprites.add(ss.getSprite(805,410,110,110));//15
    	sprites.add(ss.getSprite(615,410,110,110));//14
    	sprites.add(ss.getSprite(425,410,110,110));//13
    	sprites.add(ss.getSprite(235,410,110,110));//12
    	sprites.add(ss.getSprite(45,410,110,110));//11
    	
    	
    	
    	
    	//row 4 is 650
    	sprites.add(ss.getSprite(805,600,110,110));//20
    	sprites.add(ss.getSprite(615,600,110,110));//19
    	sprites.add(ss.getSprite(425,600,110,110));//18
    	
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    		
    	}
    	//END OF FLIP
    	else if(!isFlip){
    	
    		//width spacing is 190
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(235,30,110,110));
    	sprites.add(ss.getSprite(425,30,110,110));
    	sprites.add(ss.getSprite(615,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	//vert spacing is 190//270 is row two
   	    sprites.add(ss.getSprite(45,220,110,110));//wa 270
    	sprites.add(ss.getSprite(235,220,110,110));
    	sprites.add(ss.getSprite(425,220,110,110));
    	sprites.add(ss.getSprite(615,220,110,110));
    	sprites.add(ss.getSprite(805,220,110,110));
    	//460 is row three
     	sprites.add(ss.getSprite(45,410,110,110));
    	sprites.add(ss.getSprite(235,410,110,110));
    	sprites.add(ss.getSprite(425,410,110,110));
    	sprites.add(ss.getSprite(615,410,110,110));
    	sprites.add(ss.getSprite(805,410,110,110));
    	//row 4 is 650
    	sprites.add(ss.getSprite(45,600,110,110));
    	sprites.add(ss.getSprite(235,600,110,110));
    	sprites.add(ss.getSprite(425,600,110,110));
    	sprites.add(ss.getSprite(615,600,110,110));
    	//soldier dummy frames
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	//soldier dummy end
    	}
	myAnim = new Animator(sprites);
	myAnim.setSpeed(80);
	myAnim.start();	
    return myAnim;    
    }
      private static Animator figAnim(boolean isFlip)
    {
    	Animator myAnim;
    	BufferedImageLoader loader = new BufferedImageLoader();
    	BufferedImage spriteSheet = null;
    try{
    	if(isFlip)
    	{
    		spriteSheet = loader.loadImage("FighterFlip.png");
    	}
    	else if(!isFlip)
    	{
    	
    	spriteSheet = loader.loadImage("Fighter.png");
    	}
    	}
    	catch (IOException ex)
    	{
    		Logger.getLogger(Animations.class.getName()).log(Level.SEVERE,null, ex);
    	}
    	SpriteSheet ss = new SpriteSheet(spriteSheet);
    	// last 6 are dummy
    	ArrayList <BufferedImage> sprites = new ArrayList<BufferedImage>();
    	if(isFlip)
    	{
    		//width spacing is 190
        	 sprites.add(ss.getSprite(805,30,110,110));//
    	 sprites.add(ss.getSprite(615,30,110,110));
    	 sprites.add(ss.getSprite(425,30,110,110));
    	 sprites.add(ss.getSprite(235,30,110,110));
	 sprites.add(ss.getSprite(45,30,110,110));

    	//vert spacing is 190//270 is row two
    	sprites.add(ss.getSprite(805,220,110,110));//10
    	sprites.add(ss.getSprite(615,220,110,110));//9
    	sprites.add(ss.getSprite(425,220,110,110));//8
    	sprites.add(ss.getSprite(235,220,110,110));//7
    	sprites.add(ss.getSprite(45,220,110,110));//6
    	
    	
        
    	
    	//460 is row three
    	sprites.add(ss.getSprite(805,410,110,110));//15
    	sprites.add(ss.getSprite(615,410,110,110));//14
    	sprites.add(ss.getSprite(425,410,110,110));//13
    	sprites.add(ss.getSprite(235,410,110,110));//12
    	sprites.add(ss.getSprite(45,410,110,110));//11
    	
    	
    	
    	
    	//row 4 is 650
    	sprites.add(ss.getSprite(805,600,110,110));//20
    	sprites.add(ss.getSprite(615,600,110,110));//19
    	sprites.add(ss.getSprite(425,600,110,110));//18
    	sprites.add(ss.getSprite(235,600,110,110));//17
    	sprites.add(ss.getSprite(45,600,110,110));//16
    	
    	//row 5 is 840
    	sprites.add(ss.getSprite(805,790,110,110));//25
    	sprites.add(ss.getSprite(615,790,110,110));//24
    	sprites.add(ss.getSprite(425,790,110,110));//23
    	sprites.add(ss.getSprite(235,790,110,110));//22
    	sprites.add(ss.getSprite(45,790,110,110));//21
    	
    	//row 6 is 1030
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    		
    	}
    	//END OF FLIP
    	else if(!isFlip)
    	{
    	
    		//width spacing is 190
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(235,30,110,110));
    	sprites.add(ss.getSprite(425,30,110,110));
    	sprites.add(ss.getSprite(615,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	//vert spacing is 190//270 is row two
   	    sprites.add(ss.getSprite(45,220,110,110));//wa 270
    	sprites.add(ss.getSprite(235,220,110,110));
    	sprites.add(ss.getSprite(425,220,110,110));
    	sprites.add(ss.getSprite(615,220,110,110));
    	sprites.add(ss.getSprite(805,220,110,110));
    	//460 is row three
     	sprites.add(ss.getSprite(45,410,110,110));
    	sprites.add(ss.getSprite(235,410,110,110));
    	sprites.add(ss.getSprite(425,410,110,110));
    	sprites.add(ss.getSprite(615,410,110,110));
    	sprites.add(ss.getSprite(805,410,110,110));
    	//row 4 is 650
    	sprites.add(ss.getSprite(45,600,110,110));
    	sprites.add(ss.getSprite(235,600,110,110));
    	sprites.add(ss.getSprite(425,600,110,110));
    	sprites.add(ss.getSprite(615,600,110,110));
    	sprites.add(ss.getSprite(805,600,110,110));
    	
    	//row 5 is 840
    	sprites.add(ss.getSprite(45,790,110,110));
    	sprites.add(ss.getSprite(235,790,110,110));
    	sprites.add(ss.getSprite(425,790,110,110));
    	sprites.add(ss.getSprite(615,790,110,110));
    	sprites.add(ss.getSprite(805,790,110,110));
    	//row 6 is 1030
    	sprites.add(ss.getSprite(45,980,110,110));
    	//sprites.add(ss.getSprite(235,980,110,110));
    	//sprites.add(ss.getSprite(425,980,110,110));
    	//sprites.add(ss.getSprite(615,980,110,110));
    	//sprites.add(ss.getSprite(805,980,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	}
	myAnim = new Animator(sprites);
	myAnim.setSpeed(80);
	myAnim.start();	
    return myAnim;    
    }
    private static Animator armAnim(boolean isFlip)
    {
    	Animator myAnim;
    	BufferedImageLoader loader = new BufferedImageLoader();
    	BufferedImage spriteSheet = null;
    try{
    	if(isFlip)
    	{
    	spriteSheet = loader.loadImage("ArmourFlip.png");	
    	}
        else if(!isFlip)
        {
        
    	spriteSheet = loader.loadImage("Armour.png");
        }
    	}
    	catch (IOException ex)
    	{
    		Logger.getLogger(Animations.class.getName()).log(Level.SEVERE,null, ex);
    	}
    	SpriteSheet ss = new SpriteSheet(spriteSheet);
    	// last 16 are dummy
    	ArrayList <BufferedImage> sprites = new ArrayList<BufferedImage>();
    	if(isFlip)
    	{
    		//width spacing is 190
        	 sprites.add(ss.getSprite(805,30,110,110));//
    	 sprites.add(ss.getSprite(615,30,110,110));
    	 sprites.add(ss.getSprite(425,30,110,110));
    	 sprites.add(ss.getSprite(235,30,110,110));
	 sprites.add(ss.getSprite(45,30,110,110));

    	//vert spacing is 190//270 is row two
    	sprites.add(ss.getSprite(805,220,110,110));//10
    	sprites.add(ss.getSprite(615,220,110,110));//9
    	sprites.add(ss.getSprite(425,220,110,110));//8
    	sprites.add(ss.getSprite(235,220,110,110));//7
    	sprites.add(ss.getSprite(45,220,110,110));//6
    	
    	
        
    	
    	//460 is row three
    	sprites.add(ss.getSprite(805,410,110,110));//15
    	sprites.add(ss.getSprite(615,410,110,110));//14
    	sprites.add(ss.getSprite(425,410,110,110));//13
    	sprites.add(ss.getSprite(235,410,110,110));//12
    	sprites.add(ss.getSprite(45,410,110,110));//11
    	
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	
    	
    	//row 4 is 650
    	
    		
    	}
    	//END OF FLIP
    	else if(!isFlip)
    	{
    	
    	//width spacing is 190
    	sprites.add(ss.getSprite(65,30,110,110));
    	sprites.add(ss.getSprite(255,30,110,110));
    	sprites.add(ss.getSprite(445,30,110,110));
    	sprites.add(ss.getSprite(635,30,110,110));
    	sprites.add(ss.getSprite(825,30,110,110));
    	//vert spacing is 190//270 is row two
   	    sprites.add(ss.getSprite(65,220,110,110));
    	sprites.add(ss.getSprite(255,220,110,110));
    	sprites.add(ss.getSprite(445,220,110,110));
    	sprites.add(ss.getSprite(635,220,110,110));
    	sprites.add(ss.getSprite(825,220,110,110));
    	//460 is row three
     	sprites.add(ss.getSprite(65,410,110,110));
    	sprites.add(ss.getSprite(255,410,110,110));
    	sprites.add(ss.getSprite(445,410,110,110));
    	sprites.add(ss.getSprite(635,410,110,110));
    	sprites.add(ss.getSprite(825,410,110,110));
    	//row 4 is 650
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	//row 6 is 1030
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	}
	myAnim = new Animator(sprites);
	myAnim.setSpeed(80);
	myAnim.start();	
    return myAnim;    
    }
        private static Animator cavAnim(boolean isFlip)
    {
    	Animator myAnim;
    	BufferedImageLoader loader = new BufferedImageLoader();
    	BufferedImage spriteSheet = null;
    try{
    	if(isFlip)
    	{
    		spriteSheet = loader.loadImage("CavalierFlip.png");
    	}
    	else if(!isFlip){
    	
    	spriteSheet = loader.loadImage("Cavalier.png");
    	}
    	}
    	catch (IOException ex)
    	{
    		Logger.getLogger(Animations.class.getName()).log(Level.SEVERE,null, ex);
    	}
    	SpriteSheet ss = new SpriteSheet(spriteSheet);
    	//last 6 are dummy
    	
    	ArrayList <BufferedImage> sprites = new ArrayList<BufferedImage>();
    	if(isFlip)
    	{
    		//width spacing is 190
        	 sprites.add(ss.getSprite(805,30,110,110));//
    	 sprites.add(ss.getSprite(615,30,110,110));
    	 sprites.add(ss.getSprite(425,30,110,110));
    	 sprites.add(ss.getSprite(235,30,110,110));
	 sprites.add(ss.getSprite(45,30,110,110));

    	//vert spacing is 190//270 is row two
    	sprites.add(ss.getSprite(805,220,110,110));//10
    	sprites.add(ss.getSprite(615,220,110,110));//9
    	sprites.add(ss.getSprite(425,220,110,110));//8
    	sprites.add(ss.getSprite(235,220,110,110));//7
    	sprites.add(ss.getSprite(45,220,110,110));//6
    	
    	
        
    	
    	//460 is row three
    	sprites.add(ss.getSprite(805,410,110,110));//15
    	sprites.add(ss.getSprite(615,410,110,110));//14
    	sprites.add(ss.getSprite(425,410,110,110));//13
    	sprites.add(ss.getSprite(235,410,110,110));//12
    	sprites.add(ss.getSprite(45,410,110,110));//11
    	
    	
    	
    	
    	//row 4 is 650
    	sprites.add(ss.getSprite(805,600,110,110));//20
    	sprites.add(ss.getSprite(615,600,110,110));//19
    	sprites.add(ss.getSprite(425,600,110,110));//18
    	sprites.add(ss.getSprite(235,600,110,110));//17
    	sprites.add(ss.getSprite(45,600,110,110));//16
    	
    	//row 5 is 840
    	sprites.add(ss.getSprite(805,790,110,110));//25
    	sprites.add(ss.getSprite(615,790,110,110));//24
    	sprites.add(ss.getSprite(425,790,110,110));//23
    	sprites.add(ss.getSprite(235,790,110,110));//22
    	sprites.add(ss.getSprite(45,790,110,110));//21
    	
    	//row 6 is 1030
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    		
    	}
    	//END OF FLIP
    	else if(!isFlip)
    	{
    	
    //width spacing is 190
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(235,30,110,110));
    	sprites.add(ss.getSprite(425,30,110,110));
    	sprites.add(ss.getSprite(615,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	//vert spacing is 190//270 is row two
   	    sprites.add(ss.getSprite(45,220,110,110));//wa 270
    	sprites.add(ss.getSprite(235,220,110,110));
    	sprites.add(ss.getSprite(425,220,110,110));
    	sprites.add(ss.getSprite(615,220,110,110));
    	sprites.add(ss.getSprite(805,220,110,110));
    	//460 is row three
     	sprites.add(ss.getSprite(45,410,110,110));
    	sprites.add(ss.getSprite(235,410,110,110));
    	sprites.add(ss.getSprite(425,410,110,110));
    	sprites.add(ss.getSprite(615,410,110,110));
    	sprites.add(ss.getSprite(805,410,110,110));
    	//row 4 is 650
    	sprites.add(ss.getSprite(45,600,110,110));
    	sprites.add(ss.getSprite(235,600,110,110));
    	sprites.add(ss.getSprite(425,600,110,110));
    	sprites.add(ss.getSprite(615,600,110,110));
    	sprites.add(ss.getSprite(805,600,110,110));
    	
    	//row 5 is 840
    	sprites.add(ss.getSprite(45,790,110,110));
    	sprites.add(ss.getSprite(235,790,110,110));
    	sprites.add(ss.getSprite(425,790,110,110));
    	sprites.add(ss.getSprite(615,790,110,110));
    	sprites.add(ss.getSprite(805,790,110,110));
    	//row 6 is 1030
    	sprites.add(ss.getSprite(45,980,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	}
	myAnim = new Animator(sprites);
	myAnim.setSpeed(80);
	myAnim.start();	
    return myAnim;    
    }
    private static Animator ligAnim(boolean  isFlip)
    {
    	Animator myAnim;
    	BufferedImageLoader loader = new BufferedImageLoader();
    	BufferedImage spriteSheet = null;
    try{
    	if(isFlip)
    	{
    		spriteSheet = loader.loadImage("LightMageFlip.png");
    	}
    	else if(!isFlip)
    	{
    	
    	spriteSheet = loader.loadImage("LightMage.png");
    	}
    	}
    	catch (IOException ex)
    	{
    		Logger.getLogger(Animations.class.getName()).log(Level.SEVERE,null, ex);
    	}
    	SpriteSheet ss = new SpriteSheet(spriteSheet);
    	ArrayList <BufferedImage> sprites = new ArrayList<BufferedImage>();
    	if(isFlip)
    	{
    		//width spacing is 190
        	 sprites.add(ss.getSprite(805,30,110,110));//
    	 sprites.add(ss.getSprite(615,30,110,110));
    	 sprites.add(ss.getSprite(425,30,110,110));
    	 sprites.add(ss.getSprite(235,30,110,110));
	 sprites.add(ss.getSprite(45,30,110,110));

    	//vert spacing is 190//270 is row two
    	sprites.add(ss.getSprite(805,220,110,110));//10
    	sprites.add(ss.getSprite(615,220,110,110));//9
    	sprites.add(ss.getSprite(425,220,110,110));//8
    	sprites.add(ss.getSprite(235,220,110,110));//7
    	sprites.add(ss.getSprite(45,220,110,110));//6
    	
    	
        
    	
    	//460 is row three
    	sprites.add(ss.getSprite(805,410,110,110));//15
    	sprites.add(ss.getSprite(615,410,110,110));//14
    	sprites.add(ss.getSprite(425,410,110,110));//13
    	sprites.add(ss.getSprite(235,410,110,110));//12
    	sprites.add(ss.getSprite(45,410,110,110));//11
    	
    	
    	
    	
    	//row 4 is 650
    	sprites.add(ss.getSprite(805,600,110,110));//20
    	sprites.add(ss.getSprite(615,600,110,110));//19
    	sprites.add(ss.getSprite(425,600,110,110));//18
    	sprites.add(ss.getSprite(235,600,110,110));//17
    	sprites.add(ss.getSprite(45,600,110,110));//16
    	
    	//row 5 is 840
    	sprites.add(ss.getSprite(805,790,110,110));//25
    	sprites.add(ss.getSprite(615,790,110,110));//24
    	sprites.add(ss.getSprite(425,790,110,110));//23
    	sprites.add(ss.getSprite(235,790,110,110));//22
    	sprites.add(ss.getSprite(45,790,110,110));//21
    	
    	//row 6 is 1030
    	sprites.add(ss.getSprite(45,980,110,110));//31
    	sprites.add(ss.getSprite(805,980,110,110));//30
    	sprites.add(ss.getSprite(615,980,110,110));//29
    	sprites.add(ss.getSprite(425,980,110,110));//28
    	sprites.add(ss.getSprite(235,980,110,110));//27
    	sprites.add(ss.getSprite(45,980,110,110));//26
    		
    	}
    	//END FLIP
    	else if(!isFlip)
    	{
    	
    	//width spacing is 190
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(235,30,110,110));
    	sprites.add(ss.getSprite(425,30,110,110));
    	sprites.add(ss.getSprite(615,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	//vert spacing is 190//270 is row two
   	    sprites.add(ss.getSprite(45,220,110,110));
    	sprites.add(ss.getSprite(235,220,110,110));
    	sprites.add(ss.getSprite(425,220,110,110));
    	sprites.add(ss.getSprite(615,220,110,110));
    	sprites.add(ss.getSprite(805,220,110,110));
    	//460 is row three
     	sprites.add(ss.getSprite(45,410,110,110));
    	sprites.add(ss.getSprite(235,410,110,110));
    	sprites.add(ss.getSprite(425,410,110,110));
    	sprites.add(ss.getSprite(615,410,110,110));
    	sprites.add(ss.getSprite(805,410,110,110));
    	//row 4 is 650
    	sprites.add(ss.getSprite(45,600,110,110));
    	sprites.add(ss.getSprite(235,600,110,110));
    	sprites.add(ss.getSprite(425,600,110,110));
    	sprites.add(ss.getSprite(615,600,110,110));
    	sprites.add(ss.getSprite(805,600,110,110));
    	
    	//row 5 is 840
    	sprites.add(ss.getSprite(45,790,110,110));
    	sprites.add(ss.getSprite(235,790,110,110));
    	sprites.add(ss.getSprite(425,790,110,110));
    	sprites.add(ss.getSprite(615,790,110,110));
    	sprites.add(ss.getSprite(805,790,110,110));
    	//row 6 is 1030
    	sprites.add(ss.getSprite(45,980,110,110));
    	sprites.add(ss.getSprite(235,980,110,110));
    	sprites.add(ss.getSprite(425,980,110,110));
    	sprites.add(ss.getSprite(615,980,110,110));
    	sprites.add(ss.getSprite(805,980,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	}
	myAnim = new Animator(sprites);
	myAnim.setSpeed(80);
	myAnim.start();	
    return myAnim;    
    }
       private static Animator firAnim(boolean isFlip)
    {
    	Animator myAnim;
    	BufferedImageLoader loader = new BufferedImageLoader();
    	BufferedImage spriteSheet = null;
    try{
    	if(isFlip)
    	{
    		spriteSheet =loader.loadImage("FireMageFlip.png");
    	}
    	else if(!isFlip){
    	
    	spriteSheet = loader.loadImage("FireMage.png");
    	}
    	}
    	catch (IOException ex)
    	{
    		Logger.getLogger(Animations.class.getName()).log(Level.SEVERE,null, ex);
    	}
    	SpriteSheet ss = new SpriteSheet(spriteSheet);
    	ArrayList <BufferedImage> sprites = new ArrayList<BufferedImage>();
    	if(isFlip)
    	{
    		//width spacing is 190
        	 sprites.add(ss.getSprite(805,30,110,110));//
    	 sprites.add(ss.getSprite(615,30,110,110));
    	 sprites.add(ss.getSprite(425,30,110,110));
    	 sprites.add(ss.getSprite(235,30,110,110));
	 sprites.add(ss.getSprite(45,30,110,110));

    	//vert spacing is 190//270 is row two
    	sprites.add(ss.getSprite(805,220,110,110));//10
    	sprites.add(ss.getSprite(615,220,110,110));//9
    	sprites.add(ss.getSprite(425,220,110,110));//8
    	sprites.add(ss.getSprite(235,220,110,110));//7
    	sprites.add(ss.getSprite(45,220,110,110));//6
    	
    	
        
    	
    	//460 is row three
    	sprites.add(ss.getSprite(805,410,110,110));//15
    	sprites.add(ss.getSprite(615,410,110,110));//14
    	sprites.add(ss.getSprite(425,410,110,110));//13
    	sprites.add(ss.getSprite(235,410,110,110));//12
    	sprites.add(ss.getSprite(45,410,110,110));//11
    	
    	
    	
    	
    	//row 4 is 650
    	sprites.add(ss.getSprite(805,600,110,110));//20
    	sprites.add(ss.getSprite(615,600,110,110));//19
    	sprites.add(ss.getSprite(425,600,110,110));//18
    	sprites.add(ss.getSprite(235,600,110,110));//17
    	sprites.add(ss.getSprite(45,600,110,110));//16
    	
    	//row 5 is 840
    	sprites.add(ss.getSprite(805,790,110,110));//25
    	sprites.add(ss.getSprite(615,790,110,110));//24
    	sprites.add(ss.getSprite(425,790,110,110));//23
    	sprites.add(ss.getSprite(235,790,110,110));//22
    	sprites.add(ss.getSprite(45,790,110,110));//21
    	
    	//row 6 is 1030
    	sprites.add(ss.getSprite(45,980,110,110));//31
    	sprites.add(ss.getSprite(805,980,110,110));//30
    	sprites.add(ss.getSprite(615,980,110,110));//29
    	sprites.add(ss.getSprite(425,980,110,110));//28
    	sprites.add(ss.getSprite(235,980,110,110));//27
    	sprites.add(ss.getSprite(45,980,110,110));//26
    		
    	}
    	//END OF FLIP
    	else if(!isFlip)
    	{
    	
    	//width spacing is 190
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(235,30,110,110));
    	sprites.add(ss.getSprite(425,30,110,110));
    	sprites.add(ss.getSprite(615,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	//vert spacing is 190//270 is row two
   	    sprites.add(ss.getSprite(45,220,110,110));
    	sprites.add(ss.getSprite(235,220,110,110));
    	sprites.add(ss.getSprite(425,220,110,110));
    	sprites.add(ss.getSprite(615,220,110,110));
    	sprites.add(ss.getSprite(805,220,110,110));
    	//460 is row three
     	sprites.add(ss.getSprite(45,410,110,110));
    	sprites.add(ss.getSprite(235,410,110,110));
    	sprites.add(ss.getSprite(425,410,110,110));
    	sprites.add(ss.getSprite(615,410,110,110));
    	sprites.add(ss.getSprite(805,410,110,110));
    	//row 4 is 650
    	sprites.add(ss.getSprite(45,600,110,110));
    	sprites.add(ss.getSprite(235,600,110,110));
    	sprites.add(ss.getSprite(425,600,110,110));
    	sprites.add(ss.getSprite(615,600,110,110));
    	sprites.add(ss.getSprite(805,600,110,110));
    	
    	//row 5 is 840
    	sprites.add(ss.getSprite(45,790,110,110));
    	sprites.add(ss.getSprite(235,790,110,110));
    	sprites.add(ss.getSprite(425,790,110,110));
    	sprites.add(ss.getSprite(615,790,110,110));
    	sprites.add(ss.getSprite(805,790,110,110));
    	//row 6 is 1030
    	sprites.add(ss.getSprite(45,980,110,110));
    	sprites.add(ss.getSprite(235,980,110,110));
    	sprites.add(ss.getSprite(425,980,110,110));
    	sprites.add(ss.getSprite(615,980,110,110));
    	sprites.add(ss.getSprite(805,980,110,110));
    	sprites.add(ss.getSprite(45,30,110,110));
    	}
	myAnim = new Animator(sprites);
	myAnim.setSpeed(80);
	myAnim.start();	
    return myAnim;    
    }
    private static Animator darAnim(boolean isFlip)
    {
    	Animator myAnim;
    	BufferedImageLoader loader = new BufferedImageLoader();
    	BufferedImage spriteSheet = null;
    try{
    	if(isFlip)
    	{
    		spriteSheet = loader.loadImage("DarkMageFlip.png");
    	}
    	else if(!isFlip)
    	{
    	
    	spriteSheet = loader.loadImage("DarkMage.png");
    	}
    	}
    	catch (IOException ex)
    	{
    		
    		Logger.getLogger(Animations.class.getName()).log(Level.SEVERE,null, ex);
    	}
    	SpriteSheet ss = new SpriteSheet(spriteSheet);
    	ArrayList <BufferedImage> sprites = new ArrayList<BufferedImage>();
    	if(isFlip)
    	{
    		//width spacing is 190
        	 sprites.add(ss.getSprite(805,30,110,110));//
    	 sprites.add(ss.getSprite(615,30,110,110));
    	 sprites.add(ss.getSprite(425,30,110,110));
    	 sprites.add(ss.getSprite(235,30,110,110));
	 sprites.add(ss.getSprite(45,30,110,110));

    	//vert spacing is 190//270 is row two
    	sprites.add(ss.getSprite(805,220,110,110));//10
    	sprites.add(ss.getSprite(615,220,110,110));//9
    	sprites.add(ss.getSprite(425,220,110,110));//8
    	sprites.add(ss.getSprite(235,220,110,110));//7
    	sprites.add(ss.getSprite(45,220,110,110));//6
    	
    	
        
    	
    	//460 is row three
    	sprites.add(ss.getSprite(805,410,110,110));//15
    	sprites.add(ss.getSprite(615,410,110,110));//14
    	sprites.add(ss.getSprite(425,410,110,110));//13
    	sprites.add(ss.getSprite(235,410,110,110));//12
    	sprites.add(ss.getSprite(45,410,110,110));//11
    	
    	
    	
    	
    	//row 4 is 650
    	sprites.add(ss.getSprite(805,600,110,110));//20
    	sprites.add(ss.getSprite(615,600,110,110));//19
    	sprites.add(ss.getSprite(425,600,110,110));//18
    	sprites.add(ss.getSprite(235,600,110,110));//17
    	sprites.add(ss.getSprite(45,600,110,110));//16
    	
    	//row 5 is 840
    	sprites.add(ss.getSprite(805,790,110,110));//25
    	sprites.add(ss.getSprite(615,790,110,110));//24
    	sprites.add(ss.getSprite(425,790,110,110));//23
    	sprites.add(ss.getSprite(235,790,110,110));//22
    	sprites.add(ss.getSprite(45,790,110,110));//21
    	
    	//row 6 is 1030
    	sprites.add(ss.getSprite(45,980,110,110));//31
    	sprites.add(ss.getSprite(805,980,110,110));//30
    	sprites.add(ss.getSprite(615,980,110,110));//29
    	sprites.add(ss.getSprite(425,980,110,110));//28
    	sprites.add(ss.getSprite(235,980,110,110));//27
    	sprites.add(ss.getSprite(45,980,110,110));//26
    		
    	}
    	//END FLIP
    	else if(!isFlip)
    	{
    	
    	//width spacing is 190
    	sprites.add(ss.getSprite(45,30,110,110));
    	sprites.add(ss.getSprite(235,30,110,110));
    	sprites.add(ss.getSprite(425,30,110,110));
    	sprites.add(ss.getSprite(615,30,110,110));
    	sprites.add(ss.getSprite(805,30,110,110));
    	//vert spacing is 190//270 is row two
   	    sprites.add(ss.getSprite(45,220,110,110));
    	sprites.add(ss.getSprite(235,220,110,110));
    	sprites.add(ss.getSprite(425,220,110,110));
    	sprites.add(ss.getSprite(615,220,110,110));
    	sprites.add(ss.getSprite(805,220,110,110));
    	//460 is row three
     	sprites.add(ss.getSprite(45,410,110,110));
    	sprites.add(ss.getSprite(235,410,110,110));
    	sprites.add(ss.getSprite(425,410,110,110));
    	sprites.add(ss.getSprite(615,410,110,110));
    	sprites.add(ss.getSprite(805,410,110,110));
    	//row 4 is 650
    	sprites.add(ss.getSprite(45,600,110,110));
    	sprites.add(ss.getSprite(235,600,110,110));
    	sprites.add(ss.getSprite(425,600,110,110));
    	sprites.add(ss.getSprite(615,600,110,110));
    	sprites.add(ss.getSprite(805,600,110,110));
    	
    	//row 5 is 840
    	sprites.add(ss.getSprite(45,790,110,110));
    	sprites.add(ss.getSprite(235,790,110,110));
    	sprites.add(ss.getSprite(425,790,110,110));
    	sprites.add(ss.getSprite(615,790,110,110));
    	sprites.add(ss.getSprite(805,790,110,110));
    	//row 6 is 1030
    	sprites.add(ss.getSprite(45,980,110,110));
    	sprites.add(ss.getSprite(235,980,110,110));
    	sprites.add(ss.getSprite(425,980,110,110));
    	sprites.add(ss.getSprite(615,980,110,110));
    	sprites.add(ss.getSprite(805,980,110,110));
    	sprites.add(ss.getSprite(45,980,110,110));
    	}
	myAnim = new Animator(sprites);
	myAnim.setSpeed(80);
	myAnim.start();	
    return myAnim;    
    }
    
}