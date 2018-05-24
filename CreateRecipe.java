import javax.swing.*;
public class CreateRecipe
{

   public String[] perberesit()
   {
      String[] b = new String[33];
      b[0] = JOptionPane.showInputDialog("Shkruani emrin e recetes.");
      int s = new Integer(JOptionPane.showInputDialog("Shkruani numrin e perbereseve")).intValue();
      if(1<=s) {
      b[1] = JOptionPane.showInputDialog("Shkruani perberesin e pare dhe sasine e tij.");
      b[2] = JOptionPane.showInputDialog("Shkruani menyren e pergaditjes se perberesit te pare.");
      }
      else{ b[1] = "";
      b[2] =""; }
       if(2<=s) {
      b[3] = JOptionPane.showInputDialog("Shkruani perberesin e 2 dhe sasine e tij.");
      b[4] = JOptionPane.showInputDialog("Shkruani menyren e pergaditjes se perberesit te dyte.");
      }
      else{ b[3] = ""; 
      b[4] = "";}
        if(3<=s) {
      b[5] = JOptionPane.showInputDialog("Shkruani perberesin e 3 dhe sasine e tij.");
      b[6] = JOptionPane.showInputDialog("Shkruani menyren e pergaditjes se perberesit te 3.");
      }
      else{ b[5] = ""; 
      b[6] = "";}
          if(4<=s) {
      b[7] = JOptionPane.showInputDialog("Shkruani perberesin e 4 dhe sasine e tij.");
      b[8] = JOptionPane.showInputDialog("Shkruani menyren e pergaditjes se perberesit te 4.");
      }
      else{ b[7] = ""; 
      b[8] = "";}
             if(5<=s) {
      b[9] = JOptionPane.showInputDialog("Shkruani perberesin e 5 dhe sasine e tij.");
      b[10] = JOptionPane.showInputDialog("Shkruani menyren e pergaditjes se perberesit te 5.");
      }
      else{ b[9] = ""; 
      b[10] = "";}
             if(6<=s) {
      b[11] = JOptionPane.showInputDialog("Shkruani perberesin e 6 dhe sasine e tij.");
      b[12] = JOptionPane.showInputDialog("Shkruani menyren e pergaditjes se perberesit te 6.");
      }
      else{ b[11] = ""; 
      b[12] = "";}
             if(7<=s) {
      b[13] = JOptionPane.showInputDialog("Shkruani perberesin e 7 dhe sasine e tij.");
      b[14] = JOptionPane.showInputDialog("Shkruani menyren e pergaditjes se perberesit te 7.");
      }
      else{ b[13] = ""; 
      b[14] = "";}
             if(8<=s) {
      b[15] = JOptionPane.showInputDialog("Shkruani perberesin e 8 dhe sasine e tij.");
      b[16] = JOptionPane.showInputDialog("Shkruani menyren e pergaditjes se perberesit te 8.");
      }
      else{ b[15] = ""; 
      b[16] = "";}
             if(9<=s) {
      b[17] = JOptionPane.showInputDialog("Shkruani perberesin e 9 dhe sasine e tij.");
      b[18] = JOptionPane.showInputDialog("Shkruani menyren e pergaditjes se perberesit te 9.");
      }
      else{ b[17] = ""; 
      b[18] = "";}
             if(10<=s) {
      b[19] = JOptionPane.showInputDialog("Shkruani perberesin e 10 dhe sasine e tij.");
      b[20] = JOptionPane.showInputDialog("Shkruani menyren e pergaditjes se perberesit te 10.");
      }
      else{ b[19] = ""; 
      b[20] = "";}
             if(11<=s) {
      b[21] = JOptionPane.showInputDialog("Shkruani perberesin e 11 dhe sasine e tij.");
      b[22] = JOptionPane.showInputDialog("Shkruani menyren e pergaditjes se perberesit te 11.");
      }
      else{ b[21] = ""; 
      b[22] = "";}
             if(12<=s) {
      b[23] = JOptionPane.showInputDialog("Shkruani perberesin e 12 dhe sasine e tij.");
      b[24] = JOptionPane.showInputDialog("Shkruani menyren e pergaditjes se perberesit te 12.");
      }
      else{ b[23] = ""; 
      b[24] = "";}
             if(13<=s) {
      b[25] = JOptionPane.showInputDialog("Shkruani perberesin e 13 dhe sasine e tij.");
      b[26] = JOptionPane.showInputDialog("Shkruani menyren e pergaditjes se perberesit te 13.");
      }
      else{ b[25] = ""; 
      b[26] = "";}
             if(14<=s) {
      b[27] = JOptionPane.showInputDialog("Shkruani perberesin e 14 dhe sasine e tij.");
      b[28] = JOptionPane.showInputDialog("Shkruani menyren e pergaditjes se perberesit te 14.");
      }
      else{ b[27] = ""; 
      b[28] = "";}
             if(15<=s) {
      b[29] = JOptionPane.showInputDialog("Shkruani perberesin e 15 dhe sasine e tij.");
      b[30] = JOptionPane.showInputDialog("Shkruani menyren e pergaditjes se perberesit te 15");
      }
      else{ b[29] = ""; 
      b[30] = "";}
      b[31] = JOptionPane.showInputDialog("Shkruani informacione ekstra per pergaditjen e recetes.");
      b[32] = JOptionPane.showInputDialog("Shkruani veglat e nevojshme per pergaditjen e recetes.");
      
      
   
   return b;

}
public boolean check(RecetaView[] vargu)
	{  boolean ok = false;
		for(int i = 0; i<vargu.length; i++)
	  { if(vargu[i]!=null)ok=true;
		
	  }
		return ok;
	}
	
	
	public boolean check(RecetaView[] vargu, int n)
	{ boolean ok = false;
		if(vargu[n] != null) ok = true;
		return ok;
	}
	
	
	public boolean checkIfIsFull(RecetaView[] vargu)
	{ boolean ok = true;
	  for(int i = 0; i<vargu.length; i++)
	  {
		  if(vargu[i]==null) ok = false;
	  }
	  return ok;
		
	}
	
	
	public void delete(RecetaView[] vargu, int i)
	{  
	   if(check(vargu) && vargu[i]!=null)
	   {
		  vargu[i]=null;
		  JOptionPane.showMessageDialog(null, "Receta me numer " + i +" eshte fshire me sukses");
		  
	   }
	   
	   else  { JOptionPane.showMessageDialog(null, "Receta me numer " + i +" nuk ekziston"); }
	  
	}
   	public  boolean isNumeric(String str)  
	{  boolean rez = true;
	  if(str==null)
	  {  rez= false;
	    nullProblem();
		  
	  }
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    rez= false;
	    JOptionPane.showMessageDialog(null, "GABIM! Ke shkruajtur tekst ne vend te numrit");
	    System.exit(0);
	  }  
	  return rez;  
	}
	
	private void nullProblem()
	{
		JOptionPane.showMessageDialog(null, "Nuk lejohet butoni cancel ne kete fushe");
		System.exit(0);
	}
}