import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.GraphicsEnvironment;
import java.awt.Container;
//Add image and create next class
 

public class IntroScreen extends JFrame implements ActionListener {
private JLabel spImage;
private JButton spStart;
private int windowHeight;
private int windowWidth;
    public IntroScreen() {
    	// get icon image off of laptop
    	
    	setTitle("Welcome!");
    	setSize(800,400);
    	setLayout(null);
    	ImageIcon splash = new ImageIcon("placeHolder.gif");
    	spImage = new JLabel(splash);
    	
    	//add(spImage);
    	spStart = new JButton("S T A R T !");
    	spStart.setLocation(27,20);
    	
    	GraphicsEnvironment graph = GraphicsEnvironment.getLocalGraphicsEnvironment();
    	// manulally placing components from http://stackoverflow.com/questions/3695673/why-doesnt-setlocation-move-my-label
    	windowHeight = graph.getMaximumWindowBounds().height/3;
    	windowWidth = graph.getMaximumWindowBounds().width/3;
    	spStart.setBounds(new Rectangle(new Point(windowWidth -260, 250)));
    	spStart.setSize(120,100);
    	Font myFont = new Font("Start",Font.ITALIC,22);
    	spStart.setFont(myFont);
    	spStart.setForeground(Color.GREEN);
    	//code for icon button http://stackoverflow.com/questions/3025320/draw-a-jbutton-to-look-like-a-jlabel-or-at-least-without-the-button-edge
    	spStart.setFocusPainted(false);
        spStart.setMargin(new Insets(0, 0, 0, 0));
        spStart.setContentAreaFilled(false);
        spStart.setBorderPainted(false);
        spStart.setOpaque(false);
        spStart.addActionListener(this);
        add(spStart);
    	// mouse code from
        //http://stackoverflow.com/questions/2668718/java-mouselistener && https://docs.oracle.com/javase/tutorial/uiswing/events/mouselistener.html
         spStart.addMouseListener(new MouseAdapter() { 
          public void mouseEntered(MouseEvent e) { 
          
          	spStart.setForeground(Color.RED);
          	
            
          	
          }
          public void mouseExited(MouseEvent m)
          {
          	spStart.setForeground(Color.GREEN);
          	
          }
           
        }); 
    	
    	

    	setResizable(false);
    	//code for graphics enviorment http://www.programcreek.com/java-api-examples/index.php?api=java.awt.GraphicsEnvironment
    	
    
    	setLocation(graph.getMaximumWindowBounds().width/3,graph.getMaximumWindowBounds().height/3);
    	
    	
    	JMenuBar spMenuBar = new JMenuBar();
    	setJMenuBar(spMenuBar);
    	JMenu spFile = new JMenu("File");
    	spMenuBar.add(spFile);
    	JMenuItem spQuit = new JMenuItem("Quit");
    	spQuit.addActionListener(this);
    	spFile.add(spQuit);
    	// get image off laptop
    	
    	
    	
    	
    	
    
    	
    	
    }
    
    public static void main(String[]args)
    {
    	IntroScreen is = new IntroScreen();
    	is.setVisible(true);
    	
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	String selection;
    	selection = e.getActionCommand();
    	if(selection.equals("S T A R T !"))
    	{
    		setVisible(false);
    		CreateTeam ct = new CreateTeam();
    		//ct.setVisible(true);
    		
    		
    	}
    	if (selection.equals("Quit"))
    	{
    		JOptionPane.showMessageDialog(null,"Exiting","Goodbye",JOptionPane.INFORMATION_MESSAGE);
    		System.exit(0);
    	}
    	
    	
    }
    
    

	


	
	
}