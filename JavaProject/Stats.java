import javax.swing.*;
import java.util.*;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.awt.Image;
import java.util.ArrayList;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;

public class Stats extends JFrame {
    // TRY PAINTING THE JLABEL
    //myCharacter enemy;
    private static  int damage;
    private static  int hitRate =100;
    private static  String dummy="";
    private static  boolean twice;
    private JLabel plyHp;
    private JLabel cpuHp;
    private JLabel history;
    private String status;
    private BufferedImage background;
    private int wins=0;
    private String title="";
   
    BufferedImage sprite;
    Animator anim;
    
    public Stats(MyCharacter player,MyCharacter enemy)
    {
    	setTitle(title);
    	setSize(600,250);
    	setLocationRelativeTo(null);
    	setLayout(null);
    	setResizable(false);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	//fight(player,enemy);
    	try 
    	{
    	loadWins();
    	}
    	catch(Exception e)
    	{
    		
    	}
    	
      
    	setVisible(true);
    	status = "";
    	fight(player,enemy);
    	
    	
        
//        status = new JLabel("THIS IS A TEST LABEL");
  //      status.setSize(180,180);
    //    status.setLocation(100,100);
      
      //  add(status);
        
    	
    	
    //	plyHp = new JLabel("test1");
    //	cpuHp = new JLabel("test2");
    	
    	
      
      
      
    
    	
    	
    }
    
    
    public void  fight(MyCharacter player,MyCharacter enemy)
    {
    	System.out.println("repaint was calle");
    	//init();
    
    	updateTitle(player.getHp(),enemy.getHp());
    	//BATTLE PROCESSING
    	//Scanner hold = new Scanner(System.in);
    	System.out.println(player.getHp());
    	while(player.getHp() >0||enemy.getHp() >0)
    	{
    	
    	
    	System.out.println(player.getName()+" Attacks");
    	hitChance(player.getSkl(),enemy.getSkl());
    	if(!missed())
    	{
    		
    
    	
    	
    	if (!player.getIsMagic())
    	{
    		
    	damage = player.getStr() - enemy.getDef();
    	if (chkCrit(player.getSkl(),player.getLck(),enemy.getSkl(),enemy.getLck()))
    	{
    		damage *=3;
    		System.out.println("CRITICAL HIT!!");
    		
    		
    		
    	}
         
    	
    	
    	
    	Animations.getCpuAnim().stop();
    	Animations.getPlyAnim().start();
    	try{
    	
    	Thread.sleep(3000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	enemy.takeDamage(damage);
        updateTitle(player.getHp(),enemy.getHp());
    	System.out.println("enemy "+enemy.getName()+ "took "+damage+ " amount of damage"+"\n enemy"+enemy.getName()+ " has "+enemy.getHp()+" remaing hp"+"\n\nHit enter to continue");
    	//dummy = hold.nextLine();
    
    	}
    	else
    	{
    		damage = player.getMag() - enemy.getRes();
    		if (chkCrit(player.getSkl(),player.getLck(),enemy.getSkl(),enemy.getLck()))
    	{
    		damage *=3;
    		
    		System.out.println("CRITICAL HIT!!");
    		
    	}
    	   
    	    Animations.getCpuAnim().stop();
    	    Animations.getPlyAnim().start();
    	    try{
    	
    		Thread.sleep(3000);
    	    }
    	catch(Exception e)
    	{
    		
    	}
    	enemy.takeDamage(damage);
        updateTitle(player.getHp(),enemy.getHp());
    	    System.out.println("enemy "+enemy.getName()+ " took "+damage+ "amount of damage"+"\n enemy "+enemy.getName()+ " has "+enemy.getHp()+" remaing hp"+"\n\nHit enter to continue");
    	   // dummy = hold.nextLine();
    	}
    	chkWL(player.getHp(),enemy.getHp());
    	}
    	 
    	
    	
    	
    	System.out.println(enemy.getName()+" Attacks");
    	hitChance(enemy.getSkl(),player.getSkl());
    	if(!missed())
    	{
    		
    		
    	
    	
    	if (!enemy.getIsMagic())
    	{
    		
    	damage = enemy.getStr() - player.getDef();
    	if (chkCrit(enemy.getSkl(),enemy.getLck(),player.getSkl(),player.getLck()))
    	{
    		damage *=3;
    		
    		System.out.println("CRITICAL HIT!!");
    		
    	}
    		
    	
        	
    	
    	Animations.getCpuAnim().start();
    	Animations.getPlyAnim().stop();
    	try{
    	
    		Thread.sleep(3000);
    	}
    	catch(Exception e)
    	{
    		
    	}
        player.takeDamage(damage);
        updateTitle(player.getHp(),enemy.getHp());
    	System.out.println(player.getName()+" took "+damage+  "amount of damage"+"\n"+player.getName()+"has "+player.getHp()+" remaing hp"+"\n\nHit enter to continue");
    	//dummy = hold.nextLine();
    	}
    	else
    	{
    		damage = enemy.getMag() - player.getRes();
    		if (chkCrit(enemy.getSkl(),enemy.getLck(),player.getSkl(),player.getLck()))
    	{
    		damage *=3;
    		
    		System.out.println("CRITICAL HIT!!");
    		
    	}
    	
    	    
    	    Animations.getCpuAnim().start();
    	    Animations.getPlyAnim().stop();
    	    try{
    	
    		Thread.sleep(3000);
    	    }
    	    catch(Exception e)
    	    {
    		
    	    }
    	    player.takeDamage(damage);
            updateTitle(player.getHp(),enemy.getHp());
    	    System.out.println(player.getName()+" took "+damage+ " amount of damage"+"\n"+player.getName()+" has "+player.getHp()+" remaing hp"+"\n\nHit enter to continue");
    	    //dummy = hold.nextLine();
    	}
    	chkWL(player.getHp(),enemy.getHp());
    	
    	
    	
    	}
    	
    	}
    	chkWL(player.getHp(),enemy.getHp());
    	
    }
    
    private  void  chkWL(int pHealth,int eHealth)
    {
    	if (pHealth <=0)
    	{
    		JOptionPane.showMessageDialog(null,"You Lose","Defeat",JOptionPane.INFORMATION_MESSAGE);
    		System.out.println("you lost");
    		System.exit(0);
    		
    	}
    	if (eHealth <=0)
    	{
    		System.out.println("you won Congratulations!!");
    		JOptionPane.showMessageDialog(null,"You win Congratulations !!","Victory",JOptionPane.INFORMATION_MESSAGE);
    		wins++;
    		saveWins(wins);
    		System.exit(0);
    		
    	}
    	
    	
    }
    private  Boolean missed()
    {
    	Random ran = new Random();
    	int ra = ran.nextInt((100-1)+1)+1;
    	
    	if (hitRate >= ra )
    	{
    		
    		return false;
    		
    	}
    	else
    	{
    		System.out.println("The attack Missed!");
    		status = "MISSED";
    		 try{
    	
    		Thread.sleep(500);
    	    }
    	    catch(Exception e)
    	    {
    		
    	    }
    	    status = "";
    		return true;
    		
    	}
    	
    }
    
    private static  void  hitChance (int aSkl,int dSkl)
    {
    	int ht= (dSkl - aSkl);
    	if (ht <= 0)
    	{
    		hitRate=100;
    	}
    	else
    	{
    		ht *=10;
    		hitRate = hitRate - ht;
    		
    		
    	}
    		
    	
    	
    	
    }
    
    private  boolean chkCrit(int pSkl,int pLck,int eSkl,int eLck)
    {
    	int critChance = (pSkl +pLck)-(eSkl+eLck);
    	Random ran = new Random();
    	int ra = ran.nextInt((100-1)+1)+1;
    	
    	if (critChance >= ra)
    	{
    		status = "CRITICAL !!";
    		 try{
    	
    		Thread.sleep(500);
    	    }
    	    catch(Exception e)
    	    {
    		
    	    }
    	    status = "";
    		
    		return true;
    		
    	}
    	else
    	{
    		
    		return false;
    	}
    	
    	
    }
    private void updateTitle(int plyHP,int cpuHP)
    {
    	title = "Battle  Player HP: "+plyHP+" Enemy HP: "+cpuHP+" Total WIns: "+wins;
    	setTitle(title);
   
    	
    }
    
    private void saveWins(int wins)
    {
    	try{
    	
    	File winStats = new File("wins.data");
    	FileOutputStream  outFileStream	= new FileOutputStream(winStats);
		ObjectOutputStream os= new ObjectOutputStream(outFileStream);
	
        os.writeObject(wins);
        
		os.close();
    	}
    	catch(IOException ex)
    	{
    		
    	}
    	
    }
    private void loadWins()throws Exception
    {
      
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("wins.data"));
	   wins  = (Integer) in.readObject( );
	  
		in.close();
    	
    }
    //FROM HERE ON DOWN ANIMATION RELEATED STUFF
    Image dbImage;
    Graphics dbg;
    
    public void paint(Graphics g)
    {
    	
    	
    	dbImage = createImage(getWidth(),getHeight());
    	dbg = dbImage.getGraphics();
    	paintComponent(dbg);
    	g.drawImage(dbImage,0,0,null);
    	//g.drawImage(sprite,100,100,null);
    //	System.out.println("repaint was calle");
    	repaint();
    	
    	
    }
    public void paintComponent(Graphics g)
    {
    	
        
    	if(Animations.getPlyAnim() != null)
    	{
    		Animations.getPlyAnim().update(System.currentTimeMillis());
    		g.drawImage(Animations.getPlyAnim().sprite,200,50,null);
    		g.drawString(status,100,100);
    		repaint();
    	}
    	if(Animations.getCpuAnim() !=null)// Animations.getPlyAnim().getCurrentFrame() ==0)
    	{
    		
    		
    		//Animations.getCpuAnim().resume();
    		Animations.getCpuAnim().update(System.currentTimeMillis());
    		g.drawImage(Animations.getCpuAnim().sprite,260,50,null);
    		repaint();
    	}
    	
    	//else if(Animations.getPlyAnim().getCurrentFrame() >2)
    	//{
    	//	Animations.getCpuAnim().update(System.currentTimeMillis());
    		//Animations.getCpuAnim().setFrame(0);
    		//Animations.getCpuAnim().pause();
    	//	g.drawImage(Animations.getCpuAnim().sprite,480,100,null);
    	//	repaint();
    		
    	//}
    
    }
    
    
}