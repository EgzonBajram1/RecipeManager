import javax.swing.*;
import java.awt.*;
public class RecetaView extends JPanel
{  private String RecetaNr,Perb1,Perb2,Perb3,Perb4,Perb5, Perb6, Perb7, Perb8, Perb9, Perb10, Perb11, Perb12, Perb13, Perb14, Perb15, MPerg1, MPerg2, MPerg3, MPerg4, MPerg5, MPerg6, MPerg7, MPerg8, MPerg9, MPerg10, MPerg11, MPerg12, MPerg13, MPerg14, MPerg15, MenyraF, Veglat;
   

	public RecetaView(String[] vargu)
	{
		 RecetaNr = vargu[0];
       Perb1 = vargu[1];
       Perb2 = vargu[3];
       Perb3 = vargu[5];
       Perb4 = vargu[7];
       Perb5 = vargu[9];
       Perb6 = vargu[11];
       Perb7 = vargu[13];
       Perb8 = vargu[15];
       Perb9 = vargu[17];
       Perb10 = vargu[19];
       Perb11 = vargu[21];
       Perb12 = vargu[23];
       Perb13 = vargu[25];
       Perb14 = vargu[27];
       Perb15 = vargu[29];
       MPerg1 = vargu[2]; 
       MPerg2 = vargu[4];
       MPerg3 = vargu[6];
       MPerg4 = vargu[8];
       MPerg5 = vargu[10];
       MPerg6 = vargu[12];
       MPerg7 = vargu[14];
       MPerg8 = vargu[16];
       MPerg9 = vargu[18];
       MPerg10 = vargu[20];
       MPerg11 = vargu[22];
       MPerg12 = vargu[24];
       MPerg13 = vargu[26];
       MPerg14 = vargu[28];
       MPerg15 = vargu[30];
       MenyraF = vargu[31];
       Veglat = vargu[32];
		  

	}
	
	
	public void display()
	{ JFrame frame = new JFrame();
	   frame.setSize(800,800);
	   frame.setVisible(true);
	   frame.getContentPane().add(this);
		
	}
	
	public void paintComponent(Graphics g)
	{   g.setColor(Color.white);
	    g.fillRect(0, 0, 800, 800);
	    
		g.setColor(Color.lightGray);
		g.fillRect(300, 50, 180, 30);
		g.setColor(Color.BLACK);
		g.drawRect(300, 50, 180, 30);
	
		g.drawString("EMRI I RECETES", 300, 70);
		g.drawString(RecetaNr, 300, 95);
      g.drawRect(300, 50, 180, 90);
		g.setColor(Color.lightGray);
		g.fillRect(20, 120, 750, 30);
		g.setColor(Color.black);
		g.drawRect(20, 120, 750, 30);
      g.drawRect(20, 120, 280, 280);
		g.drawString("PERBERESIT",40,140);
      g.drawRect(300, 120, 470, 280);
      g.drawString("PERGADITJA E PERBERESEVE",340,140);
      g.drawString(Perb1, 25, 160);
      g.drawString(Perb2, 25, 175);
      g.drawString(Perb3, 25, 190);
      g.drawString(Perb4, 25, 305);
      g.drawString(Perb5, 25, 220);
      g.drawString(Perb6, 25, 235);
      g.drawString(Perb7, 25, 250);
      g.drawString(Perb8, 25, 265);
      g.drawString(Perb9, 25, 280);
      g.drawString(Perb10, 25, 295);
      g.drawString(Perb11, 25, 310);
      g.drawString(Perb12, 25, 325);
      g.drawString(Perb13, 25, 340);
      g.drawString(Perb14, 25, 355);
      g.drawString(Perb15, 25, 370);
      g.drawString(MPerg1, 320, 160);
      g.drawString(MPerg2, 320, 175);
      g.drawString(MPerg3, 320, 190);
      g.drawString(MPerg4, 320, 205);
      g.drawString(MPerg5, 320, 220);
      g.drawString(MPerg6, 320, 235);
      g.drawString(MPerg7, 320, 250);
      g.drawString(MPerg8, 320, 265);
      g.drawString(MPerg9, 320, 280);
      g.drawString(MPerg10, 320, 295);
      g.drawString(MPerg11, 320, 310);
      g.drawString(MPerg12, 320, 325);
      g.drawString(MPerg13, 320, 340);
      g.drawString(MPerg14, 320, 355);
      g.drawString(MPerg15, 320, 370);
      
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(20, 400, 750, 20 );
		g.setColor(Color.BLACK);
		g.drawRect(20, 400, 750, 270);
      g.drawString("PERGADITJA FINALE", 40, 415);
      g.drawRect(20, 440, 750, 20);
      g.drawString(MenyraF, 25, 430);
      g.drawRect(20, 460, 750, 20);
      g.setColor(Color.LIGHT_GRAY);
      g.fillRect(20, 460, 750, 20);
      g.setColor(Color.BLACK);
      g.drawString("VEGLAT OSE PAJISJET E NEVOJSHME", 40, 475);
      g.drawString(Veglat, 25, 490);

 
     
        


	}
	
	
	

}


