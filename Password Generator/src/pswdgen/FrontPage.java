package pswdgen;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;



class EFrame extends JFrame {
	
	
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EFrame()
	{
		
		super("PASSWORD GENERATOR");
		
		ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icon/icon.jpg"));
		img.setDescription("iconn");
		
		setIconImage(img.getImage());
		
	
		
		setVisible(true);
		setSize(650,500);
		setLocation(300,100);
		setLayout(null);
		getContentPane().setBackground(Color.cyan);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
		JLabel firstname=new JLabel("Enter the first name:");
		firstname.setSize(150, 50);
		firstname.setLocation(150,120);
           add(firstname);	
           
           JLabel lastname=new JLabel("Enter the last name:");
   		lastname.setSize(150, 60);
   		lastname.setLocation(150,140);
              add(lastname);
              
              JLabel jlength=new JLabel("Enter the Length : ");
              jlength.setSize(150,60);
              jlength.setLocation(150,175);
              add(jlength);
              
              JTextField ln=new JTextField();
              ln.setSize(150,20);
              ln.setLocation(270,195);
              add(ln);
     
              JTextField fnm=new JTextField();
              fnm.setSize(150,20);
              fnm.setLocation(270,135);
              add(fnm);
              
              JTextField lnm=new JTextField();
              lnm.setSize(150,20);
              lnm.setLocation(270,165);
              add(lnm);
              
              JLabel ps=new JLabel("Generated password");
              ps.setLocation(280,220);
              ps.setSize(150,20);
              add(ps);
              
              JTextField genps=new JTextField();
              genps.setSize(150,30);
              genps.setLocation(265,250);
              genps.setEditable(false);
              add(genps);
              
              JButton submit=new JButton("generate");
              submit.setLocation( 280,300 );  
              submit.setSize(100,20);
              add(submit);
              
              JButton erase=new JButton("Erase");
            		erase.setLocation(280,340);
            		erase.setSize(100,20);
            		add(erase);
            		
           erase.addActionListener(new ActionListener()
        		   {
        	            public void actionPerformed(ActionEvent e)
        	            {
        	            	ln.setText(null);
        	            	fnm.setText(null);
        	            	lnm.setText(null);
        	            	genps.setText(null);

        	            }

						
        		   }); 		
              
              
              String lenfield=ln.getText();
              
              
  
              submit.addActionListener(new ActionListener()
            		  {
            	           
							@Override
							public void actionPerformed(ActionEvent e) {
								
								boolean flag=true;
                           
							      for(int i=0;i<lenfield.length();i++)
							      {
							    	  if(!Character.isDigit(lenfield.charAt(i)))
							    	  {
							    		  flag=false;
							    		  JOptionPane.showMessageDialog(null,lenfield.charAt(i));
							    		  break;
							    	  }
							      }
							
							
								if(flag)
								{
									
								
		                        String fname="",lname="";
								
								fname=fnm.getText();
								lname=lnm.getText();
								
							String passwordset=fname+lname+"!@#$%0123456789WEBEYE";
							
							
							int leng=Integer.parseInt(ln.getText());
							
							
							
						
							if(leng<=passwordset.length())
							{
								
								
							char pswd[]=new char[leng];
							
					for(int i=0;i<leng;i++)
					{
						int rand=(int)(Math.random()*passwordset.length());
						pswd[i]=passwordset.charAt(rand);
						
				
					}
					
			            String gnpswd=new String (pswd);		
							
							
							genps.setText(gnpswd);
							
							}
							else {
						  
								JOptionPane.showMessageDialog(null,"length must be under "+passwordset.length(),"ERROR",JOptionPane.ERROR_MESSAGE);
								
								
							   }
							
							}
								else {
									JOptionPane.showMessageDialog(null,"length must be integer","ERROR",JOptionPane.ERROR_MESSAGE);
								}
							}
							
							
            		  });
                  
		
	}


}


public class FrontPage {

	
	public static void main(String[] args)
	{
	    new EFrame();
	   
	  
	}
	
	
}
