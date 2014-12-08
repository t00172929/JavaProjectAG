import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Battle {
private MyCharacter player;
private MyCharacter Ai;
private Animator anim;        

    public Battle() {
    	//player = CreateTeam.myChar;
    	//Ai = new MyCharacter("Ai");
    	
    	//Animations.setPlayAnim(player.getName());
    	//Animations.setCpuAnim(Ai.getName());
    	//Stats fighting = new Stats();
    	//fighting.fight(player,Ai);
    	AnimationTest2 a2 = new AnimationTest2();
    	
    	
    	//System.out.println(player.getHp());
    }
 
    public static void main(String[] args) {
    	Battle ba = new Battle();
    	
       
    }
}
