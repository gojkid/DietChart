/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Summer;

import properties.diet;

/**
 *
 * @author Souvik
 */
public class eveningSnack {
public diet option1[]=new diet[7];
public diet option2[]=new diet[2];
    public eveningSnack(String diet) {
         for(int i=0;i<7;i++)
        {
            option1[i]=new diet();
        }
         for(int i=0;i<2;i++)
        {
            option2[i]=new diet();
        }
        option1[0].setFood("roti");
        option1[0].setQuantity(2.0);
        option1[0].setTypeOfQuantity("nos");
        
        option1[1].setFood("vegetable(dry)");
        option1[1].setQuantity(0.5);
        option1[1].setTypeOfQuantity("cup");
        
        option1[2].setFood("bannana");
        option1[2].setQuantity(0.0);
        option1[2].setTypeOfQuantity("nos.");
        
        option1[3].setFood("boiled egg");
        option1[3].setQuantity(0.0);
        option1[3].setTypeOfQuantity("nos.");
        
        option1[4].setFood("papaya");
        option1[4].setQuantity(1.0);
        option1[4].setTypeOfQuantity("piece");
        
        option1[5].setFood("Cow's Milk (Skimmed)");
        option1[5].setQuantity(0.0);
        option1[5].setTypeOfQuantity("cup");
        
        option1[6].setFood("bisciuts");
        option1[6].setQuantity(0.0);
        option1[6].setTypeOfQuantity("nos.");
        
        ///////////////////////////////////////
        
        option2[0].setFood("samosa");
        option2[0].setQuantity(1.0);
        option2[0].setTypeOfQuantity("nos.");
        
        option2[1].setFood("mango");
        option2[1].setQuantity(1.0);
        option2[1].setTypeOfQuantity("nos.");
       
    }
    
    public eveningSnack(double roti,double vegetable,double bannana,double egg,double fruit,double samosa,double skimmed,double bisciuts,String diet) {
          for(int i=0;i<7;i++)
        {
            option1[i]=new diet();
        }
         for(int i=0;i<2;i++)
        {
            option2[i]=new diet();
        }
        option1[0].setFood("roti");
        option1[0].setQuantity(roti);
        option1[0].setTypeOfQuantity("nos.");
        
        option1[1].setFood("vegetable(dry)");
        option1[1].setQuantity(vegetable);
        option1[1].setTypeOfQuantity("cup");
        
        option1[2].setFood("bannana");
        option1[2].setQuantity(bannana);
        option1[2].setTypeOfQuantity("nos.");
        
        option1[3].setFood("boiled egg");
        option1[3].setQuantity(egg);
        option1[3].setTypeOfQuantity("nos.");
        
        option1[4].setFood("papaya");
        option1[4].setQuantity(fruit);
        option1[4].setTypeOfQuantity("piece");
        
        option1[5].setFood("Cow's Milk (Skimmed)");
        option1[5].setQuantity(skimmed);
        option1[5].setTypeOfQuantity("cup");
        
        option1[6].setFood("bisciuts");
        option1[6].setQuantity(bisciuts);
        option1[6].setTypeOfQuantity("nos.");
        
        ///////////////////////////////////////
        
        option2[0].setFood("samosa");
        option2[0].setQuantity(samosa);
        option2[0].setTypeOfQuantity("nos.");
        
        option2[1].setFood("mango");
        option2[1].setQuantity(fruit);
        option2[1].setTypeOfQuantity("nos.");
       
        if(diet.equals("veg"))
        {
            option1[3].setFood("boiled egg");
            option1[3].setQuantity(0);
            option1[3].setTypeOfQuantity("nos.");
            
            option1[5].setFood("Cow's Milk (Skimmed)");
            option1[5].setQuantity(skimmed+egg);
            option1[5].setTypeOfQuantity("cup");
        }
    }
    
   public String getEveningSnack()
    {
        String res="";
        res="EVENING SNACK\n_______________________________________________\n";
        res=res+"1.";
        if(option1[0].getQuantity()>0.0)
        res=res+"\ta."+option1[0].getDiet()+"\n";
        if(option1[1].getQuantity()>0.0)
        res=res+"  \tb."+option1[1].getDiet()+"\n";
        if(option1[2].getQuantity()>0.0)
        res=res+"  \tc."+option1[2].getDiet()+"\n";
        if(option1[3].getQuantity()>0.0)
        res=res+"  \td."+option1[3].getDiet()+"\n";
        if(option1[4].getQuantity()>0.0)
        res=res+"  \te."+option1[4].getDiet()+"\n";
        if(option1[5].getQuantity()>0.0)
        res=res+"\ta."+option1[5].getDiet()+"\n";
        if(option1[6].getQuantity()>0.0)
        res=res+"  \tb."+option1[6].getDiet()+"\n";
        int flag=0;
         for(int i=0;i<2;i++)
        {
            if(option2[i].getQuantity()>0.0)
                flag=1;
        }
         if(flag==0)
             return res;
        res=res+"\n\t\tOR\n\n";
        if(option2[1].getQuantity()>0.0)
        res=res+"2.\ta."+option2[1].getDiet();
        if(option2[0].getQuantity()>0.0)
        res=res+"\n  \tb."+option2[0].getDiet()+"\n";
        return res;
    }
}

