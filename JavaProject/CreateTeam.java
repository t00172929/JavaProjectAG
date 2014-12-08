import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//this is the main class the console information is just leftovers from early stage

public class CreateTeam  extends JFrame implements ActionListener{
	
private JLabel imag1;
private JLabel imag2;
private JLabel imag3;
private JLabel imag4;
private JLabel imag5;
private JLabel ctSel;
private JLabel curSelection;
private JButton btnSword;
private JButton btnMerc;
private JButton btnSol;
private JButton btnFig;
private JButton btnArm;
private JButton btnCav;
private JButton btnLig;

private JButton btnFir;
private JButton btnDar;
private JButton btnSave;
private JButton btnPlay;
private JButton btnQuit;
private long timer =0;

private MyCharacter player;
private MyCharacter Ai;

public static MyCharacter myChar;

    
    public CreateTeam() {
    	
    	setTitle("Character Select");
    	setSize(800,400);
    	setLocation(478,159);
    	setLayout(null);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	addButtons();
    	addMenu();
    	ctSel = new JLabel("S E L E C T   C H A R A C T E R    T E N  S E C O N D S");
    	ctSel.setLocation(230,50);
    	ctSel.setSize(400,40);
    	add(ctSel);
    	curSelection = new JLabel("Current Character:");
    	curSelection.setLocation(10,300);
    	curSelection.setSize(180,40);
    	add(curSelection);
    		//using this to find various screen positions
    	addMouseListener(new MouseAdapter() { 
          public void mousePressed(MouseEvent me) { 
            System.out.println(me); 
          } 
        }); 
        setVisible(true);
        	
       try{
       	Thread.sleep(10000);
       	if (myChar == null)
       	{
       		JOptionPane.showMessageDialog(null,"No Charcter selected","ERROR",JOptionPane.ERROR_MESSAGE);
       		setVisible(false);
       		CreateTeam ct = new CreateTeam();
       		
       	}
       	setVisible(false);
       	AnimationTest2 a2 = new AnimationTest2();
       	
       }
       catch(Exception e)
       {
       	
       }
    	
    }
    public static void main(String[] args) {
    	
    	CreateTeam ct = new CreateTeam();
    	//ct.setVisible(true);
    		
    
       
    }
    
    private void addButtons()
    {
    	
    	btnSword = new JButton("Swordsman");
    	btnSword.addActionListener(this);
     	btnSword.setLocation(32,114);
    	btnSword.setSize(105,20);
    	add(btnSword);
    	btnMerc = new JButton("Mercenary");
    	btnMerc.addActionListener(this);
     	btnMerc.setLocation(142,114);
    	btnMerc.setSize(105,20);
    	add(btnMerc);
    	btnSol = new JButton("Soldier");
    	btnSol.addActionListener(this);
     	btnSol.setLocation(252,114);
    	btnSol.setSize(105,20);
    	add(btnSol);
    	btnFig = new JButton("Fighter");
    	btnFig.addActionListener(this);
     	btnFig.setLocation(362,114);
    	btnFig.setSize(105,20);
    	add(btnFig);
    	btnArm = new JButton("Armour");
    	btnArm.addActionListener(this);
     	btnArm.setLocation(472,114);
    	btnArm.setSize(105,20);
    	add(btnArm);
    	btnCav = new JButton("Cavalier");
    	btnCav.addActionListener(this);
     	btnCav.setLocation(582,114);
    	btnCav.setSize(105,20);
    	add(btnCav);
    	btnLig = new JButton("Light Mage");
    	btnLig.addActionListener(this);
     	btnLig.setLocation(32,214);
    	btnLig.setSize(105,20);
    	add(btnLig);
    	btnFir = new JButton("Fire Mage");
    	btnFir.addActionListener(this);
     	btnFir.setLocation(142,214);
    	btnFir.setSize(105,20);
    	add(btnFir);
    	btnDar = new JButton("Dark Mage");
    	btnDar.addActionListener(this);
     	btnDar.setLocation(252,214);
    	btnDar.setSize(105,20);
    	add(btnDar);
    	//btnSave = new JButton("Save");
    	//btnSave.addActionListener(this);
     	//btnSave.setLocation(142,314);
    	//btnSave.setSize(105,20);
    	//add(btnSave);
    	btnPlay = new JButton("Play");
    	btnPlay.addActionListener(this);
     	btnPlay.setLocation(262,314);
    	btnPlay.setSize(105,20);
    	//add(btnPlay);
    	btnQuit = new JButton("Quit");
    	btnQuit.addActionListener(this);
     	btnQuit.setLocation(382,314);
    	btnQuit.setSize(105,20);
    	add(btnQuit);
    }
    private void addMenu(){
    	JMenuBar ctMenuBar = new JMenuBar();
    	setJMenuBar(ctMenuBar);
    	JMenu ctFile = new JMenu("File");
    	ctMenuBar.add(ctFile);
    	JMenuItem ctQuit = new JMenuItem("Quit");
    	ctQuit.addActionListener(this);
    	ctFile.add(ctQuit);
    	JMenu ctHelp = new JMenu("Help");
    	ctMenuBar.add(ctHelp);
    	JMenuItem cthelp = new JMenuItem("Help");
    	cthelp.addActionListener(this);
    	ctHelp.add(cthelp); 
    	
    	
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	String selec;
    	selec = e.getActionCommand();
    	ImageIcon im1 = new ImageIcon("200x200.png");
    	ImageIcon im2 = new ImageIcon("200x200.png");
    	ImageIcon im3 = new ImageIcon("200x200.png");
    	ImageIcon im4 = new ImageIcon("200x200.png");
    	ImageIcon im5 = new ImageIcon("200x200.png");
    	
    	switch (selec)
    	{
    		case"Swordsman":
    			MyCharacter sword = new MyCharacter("Swordsman");
    			curSelection.setText("Current Character: "+selec);
    			myChar = sword;
    			break;
    		case"Mercenary":
    			MyCharacter merc = new MyCharacter("Mercenary");
    			curSelection.setText("Current Character: "+selec);
    			myChar = merc;
    			break;
    		case"Soldier":
    			MyCharacter sol = new MyCharacter("Soldier");
    			curSelection.setText("Current Character: "+selec);
    			myChar = sol;
    			break;
    		case"Fighter":
    			MyCharacter fig = new MyCharacter("Fighter");
    			curSelection.setText("Current Character: "+selec);
    			myChar = fig;
    			break;
    		case"Armour":
    			MyCharacter arm = new MyCharacter("Armour");
    			curSelection.setText("Current Character: "+selec);
    			myChar = arm;
    			break;
    		case"Cavalier":
    			MyCharacter cav = new MyCharacter("Cavalier");
    			curSelection.setText("Current Character: "+selec);
    			myChar = cav;
    			break;
    		case"Light Mage":
    			MyCharacter lig = new MyCharacter("Light Mage");
    			curSelection.setText("Current Character: "+selec);
    			myChar = lig;
    			break;
    		case"Fire Mage":
    			MyCharacter fir = new MyCharacter("Fire Mage");
    			curSelection.setText("Current Character: "+selec);
    			myChar = fir;
    			break;
    		case"Dark Mage":
    			MyCharacter dar = new MyCharacter("Dark Mage");
    			curSelection.setText("Current Character: "+selec);
    			myChar = dar;
    			break;
    		case"Quit":
    			 System.exit(0);
    			 break;
    		case "Play":
    			//Battle ba = new Battle();
    			//player = new MyCharacter("Ai");
    	        //Ai = new MyCharacter("Ai");
        //player = CreateTeam.myChar;
    	
    	//Animations.setPlayAnim(player.getName());
    	//Animations.setCpuAnim(Ai.getName());
    	//System.out.println(player.getName());
    	//AnimationTest2 a2 = new AnimationTest2();
    	//a2.setVisible(true);
    	
        //test();
    	
    	//Stats fighting = new Stats(player,Ai);
    	//fighting.setVisible(true);
    	
    	//fighting.fight(player,Ai);
    			
    			
    			break;
    		case"Help":
    			JOptionPane.showMessageDialog(null,"Click a button to slect a charcater then click play to begin");
    			break;
    		
    		
    		
    		
    	}
    	
    
    	
    	
    }
    
    public void test()
    {
    	AnimationTest2 a2 = new AnimationTest2();
    }
    
}
