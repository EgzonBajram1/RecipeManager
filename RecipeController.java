import javax.swing.JOptionPane;
public class RecipeController {
   CreateRecipe mod = new CreateRecipe();
   private int size ;
   private boolean ok = true;
	
   public void process()
   {   String s = JOptionPane.showInputDialog("Cakto numrin e recetave qe do te permbaje vargu.");
      if(mod.isNumeric(s))
      {   size = new Integer(s).intValue();
         if(size>0)
         {   RecetaView[] receta = new RecetaView[size];
            while(ok) 
            {
               if(!mod.check(receta)) { createARecipe(receta); }
               else { manageRecipe(receta);}
            }
         }
         else 
         { JOptionPane.showMessageDialog(null, "Gabim! Numri duhet te jete me i madh se 0");
            this.process();
         }
      }
   }
	
	//Metoda private qe perdoren nga kjo klase
	
   private void manageRecipe(RecetaView[] receta)
   {  
      if(mod.checkIfIsFull(receta))
      { String s = JOptionPane.showInputDialog(" Nese deshiron te shikosh nje recete shtyp 2" + 
            "\n Nese deshiron te fshish nje recete shtyp 3"
            + "\n Nese deshiron te ndalosh programin shtyp 4");
         switch(s)
         { 
            case "2": displayARecipe(receta) ;
               break;
            case "3": deleteARecipe(receta);
               break;
            case "4": ok=false;
               break;
            default:
               System.out.println("Gabim ne komande");
         }
      
      }
      
      else {
      
         String s = JOptionPane.showInputDialog(" Nese deshiron te krijosh nje recete shtyp 1 "
            + "\n Nese deshiron te shikosh nje recete shtyp 2" + "\n Nese deshiron te fshish nje recete shtyp 3" +
            "\n Nese deshiron te ndalosh programin shtyp 4");
         switch(s)
         { 
            case "1": createARecipe(receta);
               break;
            case "2": displayARecipe(receta) ;
               break;
            case "3": deleteARecipe(receta);
               break;
            case "4" : ok = false;
               break;
            default:
               System.out.println("Gabim ne komande");
         }
      }
   
   
   }
	
	
   private void createARecipe(RecetaView[] vargu)
   {     String s = JOptionPane.showInputDialog("Cakto numrin e recetes.");
      if(mod.isNumeric(s))
      {
         int i = new Integer(s).intValue();
         if(i<size && i>=0)
         { 
            if(!mod.check(vargu, i))
            {
               
                  vargu[i] = new RecetaView(mod.perberesit());
               
            }
            else { JOptionPane.showMessageDialog(null, "Nuk mund ta krijosh receten me numrin " + i + " sepse ekziston"); }
         }
         else { JOptionPane.showMessageDialog(null, "GABIM! Nuk mund te zgjedhesh numrin me te madh se " + (size-1));}
      }  
   }
	
	
   private void deleteARecipe(RecetaView[] vargu)
   {
      int i = new Integer(JOptionPane.showInputDialog("Cilen recete deshiron ta fshish.\n Shtyp numrin e recetes.")).intValue();
      if(i<size && mod.check(vargu, i))
      {
         mod.delete(vargu, i);
      }
      else JOptionPane.showMessageDialog(null, "GABIM, receta nuk ekziston");
   }
	
   private void displayARecipe(RecetaView[] vargu)
   { 
      int i = new Integer(JOptionPane.showInputDialog("Cilen recete deshiron ta shikosh")).intValue();
    
      if(i<size && mod.check(vargu, i))
      {
         vargu[i].display();
      }
      else JOptionPane.showMessageDialog(null, "GABIM, receta nuk ekziston");
   	
   }

}
