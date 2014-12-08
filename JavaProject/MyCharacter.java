import java.util.Random;

public class MyCharacter {
private String name;
private int hp;
private int str;
private int mag;
private int skl;
private int spd;
private int lck;
private int def;
private int res;
private boolean isMagic;

    public MyCharacter(String charClass) {
    	
    	if (charClass.equals("Ai"))
    	{
    		assignAi();
    		
    	}
    	
    	
          switch(charClass)
          {
          	case"Mercenary":
          		merc();
          		break;
          	case"Swordsman":
          		sword();
          		break;
          	case"Soldier":
          		soldier();
          		break;
          	case "Fighter":
          		fighter();
          		break;
          	case"Armour":
          		armour();
          		break;
          	case"Cavalier":
          		cavalier();
          		break;
          	case"Light Mage":
          		lightMage();
          		break;
          	case"Fire Mage":
          		fireMage();
          		break;
          	case"Dark Mage":
          		darkMage();
          		break;	
          }
    	
    }
   
    
    
    private void merc()
    {
    	setName("Mercenary");
    	setHp(27);
    	setStr(13);
    	setMag(0);
    	setSkl(5);
    	setSpd(4);
    	setLck(3);
    	setDef(6);
    	setRes(3);
    	isMagic =false;
    	
    	
    }
   private void sword()
    {
    	setName("Swordsman");
    	setHp(24);
    	setStr(9);
    	setMag(0);
    	setSkl(10);
    	setSpd(8);
    	setLck(5);
    	setDef(3);
    	setRes(5);
    	isMagic =false;
    	
    	
    }
   private void soldier()
    {
    	setName("Soldier");
    	setHp(26);
    	setStr(11);
    	setMag(0);
    	setSkl(4);
    	setSpd(4);
    	setLck(2);
    	setDef(6);
    	setRes(4);
    	isMagic =false;
    	
    	
    }
   private void fighter()
    {
    	setName("Fighter");
    	setHp(30);
    	setStr(16);
    	setMag(0);
    	setSkl(1);
    	setSpd(3);
    	setLck(1);
    	setDef(8);
    	setRes(2);
    	isMagic =false;
    	
    	}
   private void armour()
    {
    	setName("Armour");
    	setHp(28);
    	setStr(14);
    	setMag(0);
    	setSkl(3);
    	setSpd(1);
    	setLck(1);
    	setDef(10);
    	setRes(0);
    	isMagic =false;
    	
    	}
       private void cavalier()
    {
    	setName("Cavalier");
    	setHp(25);
    	setStr(11);
    	setMag(0);
    	setSkl(5);
    	setSpd(5);
    	setLck(2);
    	setDef(5);
    	setRes(5);
    	isMagic =false;
    	
    	}
    private void lightMage()
    {
    	setName("Light Mage");
    	setHp(30);
    	setStr(0);
    	setMag(12);
    	setSkl(8);
    	setSpd(5);
    	setLck(4);
    	setDef(3);
    	setRes(10);
    	isMagic =true;
    	
    	}
       private void fireMage()
    {
    	setName("Fire Mage");
    	setHp(27);
    	setStr(0);
    	setMag(14);
    	setSkl(7);
    	setSpd(6);
    	setLck(2);
    	setDef(5);
    	setRes(8);
    	isMagic =true;
    	
    	}
  private void darkMage()
    {
    	setName("Dark Mage");
    	setHp(25);
    	setStr(0);
    	setMag(16);
    	setSkl(5);
    	setSpd(4);
    	setLck(1);
    	setDef(6);
    	setRes(6);
    	isMagic =true;
    	
    	}
    	
    private void assignAi()
    {
    	// random generation http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java
    	Random rand = new Random();
    	 int randomNum = rand.nextInt((9 - 1) + 1) + 1;
    	 
    	 switch(randomNum)
    	 {
    	 	case 1:
    	 		merc();
    	 		break;
    	 	case 2:
    	 		sword();
    	 		break;
    	 	case 3:
    	 		soldier();
    	 		break;
    	 	case 4:
    	 		fighter();
    	 		break;
    	 	case 5:
    	 		armour();
    	 		break;
    	 	case 6:
    	 		cavalier();
    	 		break;
    	 	case 7:
    	 		lightMage();
    	 		break;
    	 	case 8:
    	 		fireMage();
    	 		break;
    	 	case 9:
    	 		darkMage();
    	 		break;
    	 		
    	 	
    	 }

    	
    }
    
    public void takeDamage(int damage)
    {
    	hp  -= damage;
    	if (hp <0)
    	{
    		hp = 0;
    	}
    	
    }
    //mutator and accesor
    public void setName(String name)
    {
    	this.name = name;
    }
    public void setHp(int hp)
    {
    	this.hp = hp;
    	
    }
    public void setStr(int str)
    {
    	this.str = str;
    }
    public void setMag(int mag)
    {
    	this.mag =mag;
    }
    public void setSkl(int skl)
    {
    	this.skl = skl;
    }
    public void setSpd(int spd)
    {
    	this.spd = spd;
    }
    public void setLck(int lck)
    {
    	this.lck = lck;
    }
    public void setDef(int def)
    {
    	this.def = def;
    }
    public void setRes(int res)
    {
    	this.res = res;
    }
   
    public String getName()
    {
    	return name;
    }
    public int getHp()
    {
    	return hp;
    }
    public int getStr()
    {
    	return str;
    }
    public int getMag()
    {
    	return  mag;
    }
    public int getSkl()
    {
    	return skl;
    }
    public int getSpd()
    {
    	return spd;
    }
    public int getLck()
    {
    	return lck;
    }
    public int getDef()
    {
    	return def;
    }
    public int getRes()
    {
    	return res;
    }
     public boolean getIsMagic()
    {
    	return isMagic;
    }
}