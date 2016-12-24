/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Winter;

import properties.diet;

/**
 *
 * @author Souvik
 */
public class eveningSnack {
public diet option1[]=new diet[5];
public diet option2[]=new diet[2];
    public eveningSnack(String diet) {
         for(int i=0;i<5;i++)
        {
            option1[i]=new diet();
        }
         for(int i=0;i<2;i++)
        {
            option2[i]=new diet();
        }
        option1[0].setFood("bread");
        option1[0].setQuantity(2.0);
        option1[0].setTypeOfQuantity("slices");
        
        option1[1].setFood("jam/jelly");
        option1[1].setQuantity(1.0);
        option1[1].setTypeOfQuantity("tbsp");
        
        option1[2].setFood("bannana");
        option1[2].setQuantity(0.0);
        option1[2].setTypeOfQuantity("nos.");
        
        option1[3].setFood("boiled egg");
        option1[3].setQuantity(0.0);
        option1[3].setTypeOfQuantity("nos.");
        
        option1[4].setFood("guava");
        option1[4].setQuantity(1.0);
        option1[4].setTypeOfQuantity("nos.");
        
        ///////////////////////////////////////
        
        option2[0].setFood("samosa");
        option2[0].setQuantity(1.0);
        option2[0].setTypeOfQuantity("nos.");
        
        option2[1].setFood("guava");
        option2[1].setQuantity(1.0);
        option2[1].setTypeOfQuantity("nos.");
       
    }
    
    public eveningSnack(double bread,double jam,double bannana,double egg,double guava,double samosa,String diet) {
         for(int i=0;i<5;i++)
        {
            option1[i]=new diet();
        }
         for(int i=0;i<2;i++)
        {
            option2[i]=new diet();
        }
        option1[0].setFood("bread");
        option1[0].setQuantity(bread);
        option1[0].setTypeOfQuantity("slices");
        
        option1[1].setFood("jam/jelly");
        option1[1].setQuantity(jam);
        option1[1].setTypeOfQuantity("tbsp");
        
        option1[2].setFood("bannana");
        option1[2].setQuantity(bannana);
        option1[2].setTypeOfQuantity("nos.");
        
        option1[3].setFood("boiled egg");
        option1[3].setQuantity(egg);
        option1[3].setTypeOfQuantity("nos.");
        
        option1[4].setFood("guava");
        option1[4].setQuantity(guava);
        option1[4].setTypeOfQuantity("nos.");
        
        ///////////////////////////////////////
        
        option2[0].setFood("samosa");
        option2[0].setQuantity(samosa);
        option2[0].setTypeOfQuantity("nos.");
        
        option2[1].setFood("guava");
        option2[1].setQuantity(guava);
        option2[1].setTypeOfQuantity("nos.");
        
        if(diet.equals("veg"))
        {
        option1[3].setFood("skimmed milk");
        option1[3].setQuantity(egg);
        option1[3].setTypeOfQuantity("cup");
        }
    }
    
    public String getEveningSnack()
    {
        String res="";
        res="EVENING SNACK\n_______________________________________________\n";
        res=res+"1.";
        for(int i=0;i<3;i++)
        {
            if(option1[i].getQuantity()>0.0)
            res=res+ "\t"+(char)(97+i)+"."+option1[i].getDiet()+"\n  ";

        }
               
        
        res=res+"\n\t\tOR\n\n";
        res=res+"2.";
        for(int i=0;i<2;i++)
        {
            if(option2[i].getQuantity()>0.0)
            res=res+ "\t"+(char)(97+i)+"."+option2[i].getDiet()+"\n  ";

        }

        return res;
    }
}
