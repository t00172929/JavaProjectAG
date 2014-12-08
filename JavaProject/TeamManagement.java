import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.io.*;
public class TeamManagement extends JFrame implements ActionListener {
   

   private JLabel member1;
   private JLabel member2;
   private JLabel member3;
   private JLabel member4;
   private JLabel member5;
   private JButton creTeam;
   private JButton loaTeam;
   private JButton play;
   public List <MyCharacter> team = null; 
   
    public TeamManagement() {
    	
    	setTitle("Manage Team");
    	setSize(1100,800);
    	setLocation(478,159);
    	setLayout(null);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	createMenuBar();
    	displayCharacters();
    	addButtons();
    	
    	
    	
    	
    	
    	//using this to find various screen positions
    	addMouseListener(new MouseAdapter() { 
          public void mousePressed(MouseEvent me) { 
            System.out.println(me); 
          } 
        }); 

    	
    }
    
    public static void main(String[] args) {
    	
    	TeamManagement tm = new TeamManagement();
    	tm.setVisible(true);
        
    }
     private void displayCharacters()
     {
     	ImageIcon charPH = new ImageIcon("200x200.png");
    	member1 = new JLabel(charPH);
    	member1.setLocation(25,195);
    	member1.setSize(200,200);
    	add(member1);
    	member2 = new JLabel(charPH);
    	member2.setLocation(235,195);
    	member2.setSize(200,200);
    	add(member2);
    	member3 = new JLabel(charPH);
    	member3.setLocation(445,195);
    	member3.setSize(200,200);
    	add(member3);
    	member4 = new JLabel(charPH);
    	member4.setLocation(655,195);
    	member4.setSize(200,200);
    	add(member4);
    	member5 = new JLabel(charPH);
    	member5.setLocation(865,195);
    	member5.setSize(200,200);
    	add(member5);
    	
     	
     }
     private void createMenuBar()
     {
     	JMenuBar tmMenuBar = new JMenuBar();
     	setJMenuBar(tmMenuBar);
     	
     	//File
    	JMenu tmFile = new JMenu("File");
    	tmMenuBar.add(tmFile);
    	JMenuItem tmQuit = new JMenuItem("Quit");
    	tmQuit.addActionListener(this);
    	tmFile.add(tmQuit);
    	//edit
    	JMenu tmEdit = new JMenu("Edit");
    	tmMenuBar.add(tmEdit);
    	JMenuItem loadTeamMenu = new JMenuItem("Load Team");
    	loadTeamMenu.addActionListener(this);
    	tmEdit.add(loadTeamMenu);
    	JMenuItem createTeamMenu = new JMenuItem("Create a Team");
    	createTeamMenu.addActionListener(this);
    	tmEdit.add(createTeamMenu);
    	//Help
    	JMenu helpMenu = new JMenu("Help");
    	tmMenuBar.add(helpMenu);
    	JMenuItem help = new JMenuItem("What to do");
    	help.addActionListener(this);
    	helpMenu.add(help);
    	
     }
     public void actionPerformed(ActionEvent e)
     {
     	String selection;
     	
     	selection = e.getActionCommand();
     	
     	if(e.getSource().equals("Load Team"))
     	{
     		try{
     				
     	            File inFile = new File("Team");
                    FileInputStream inStream = new FileInputStream(inFile);
                    ObjectInputStream inDataStream = new ObjectInputStream(inStream);
                    team = (List <MyCharacter>) inDataStream.readObject();
                    inDataStream.close();
                    assignLabels();
                    
     			}
     			catch(Exception f)
     			{
     				JOptionPane.showMessageDialog(null,"No team found","ERROR",JOptionPane.ERROR_MESSAGE);
     				
     				
     			}
     			finally
     			{
     				
     			}
     		
     	}
     	if (e.getSource().equals("Create Team"))
     	{
     		// check to see if a team has already been loaded
     		System.out.println("go to create team window");
     	}
     	if (e.getSource().equals("Play"))
     	{
     		// check to see if current team is valid
     		
     		System.out.println("go to play");
     	}
     	
     	switch (selection)
     	{
     		case "Quit":
     			System.exit(0);
     			break;
     		case "Load Team":
     			try{
     				
     	            File inFile = new File("Team");
                    FileInputStream inStream = new FileInputStream(inFile);
                    ObjectInputStream inDataStream = new ObjectInputStream(inStream);
                    team = (List <MyCharacter>) inDataStream.readObject();
                    inDataStream.close();
                    assignLabels();
                    
     			}
     			catch(Exception f)
     			{
     				JOptionPane.showMessageDialog(null,"No team found","ERROR",JOptionPane.ERROR_MESSAGE);
     				
     				
     			}
     			finally
     			{
     				
     			}
     		case"Create a Team":
     			System.out.println("create team window");
     			break;
     		case"What to do":
     			//change this to Jtext area at some point
     			JOptionPane.showMessageDialog(null,"Select load team from by clicking the load team button\n"+"or by selecting load team fom the Edit menu\n"
     				+"Create a new team by clicking the create a new team button\n"+"or selecting create new team from thje Edit menu");
     				break;	
     	}
     		
     		
     		
     		
     	
     	
     }
     private void addButtons()
     {
     	loaTeam = new JButton("Load Team");
     	loaTeam.setLocation(500,500);
    	loaTeam.setSize(100,20);
    	add(loaTeam);
    	creTeam = new JButton("Create Team");
    	creTeam.setLocation(500,540);
    	creTeam.setSize(120,20);
    	add(creTeam);
    	play = new JButton("Play");
    	play.setLocation(500,580);
    	play.setSize(100,20);
    	add(play);
     	
     	
     }
     private void assignLabels()
     {
     	
     }
}
