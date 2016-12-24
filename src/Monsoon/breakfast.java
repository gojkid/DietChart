/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Monsoon;

import properties.diet;

/**
 *
 * @author Souvik
 */
public class breakfast {
    public diet option1[]=new diet[2];
    public diet option2[]=new diet[2];
    
    public breakfast()
    {
        for(int i=0;i<2;i++)
        {
            option1[i]=new diet();
            option2[i]=new diet();
        }
        option1[0].setFood("bisciuts");
        option1[0].setQuantity(2.0);
        option1[0].setTypeOfQuantity("nos.");
        
        option1[1].setFood("Tea (50 ml milk + 2 tbsp sugar)");
        option1[1].setQuantity(1.0);
        option1[1].setTypeOfQuantity("cup");
        
        option2[0].setFood("cow's milk (2 tbsp sugar)");
        option2[0].setQuantity(1.0);
        option2[0].setTypeOfQuantity("cup");
        
        option2[1].setFood("cow's milk (skimmed)");
        option2[1].setQuantity(0.0);
        option2[1].setTypeOfQuantity("cup");
    }
    
    public breakfast(double biscuits,double tea,double milk,double skimmed)
    {
        for(int i=0;i<2;i++)
        {
            option1[i]=new diet();
            option2[i]=new diet();
        }
        option1[0].setFood("bisciuts");
        option1[0].setQuantity(biscuits);
        option1[0].setTypeOfQuantity("nos.");
        
        option1[1].setFood("Tea (50 ml milk + 2 tbsp sugar)");
        option1[1].setQuantity(tea);
        option1[1].setTypeOfQuantity("cup");
        
        option2[0].setFood("cow's milk (2 tbsp sugar)");
        option2[0].setQuantity(milk);
        option2[0].setTypeOfQuantity("cup");
        
        option2[1].setFood("cow's milk (skimmed)");
        option2[1].setQuantity(skimmed);
        option2[1].setTypeOfQuantity("cup");
    }
    
    public String getBreafast()
    {
        String res="";
        res="BREAKFAST\n_______________________________________________\n";
        if(option2[1].getQuantity()>0.0)
        {
            res=res+"1.\ta."+option1[0].getDiet()+"\n  \tb."+option2[1].getDiet()+"\n";
            return res;
        }
        res=res+"1.\ta."+option1[0].getDiet();
        if(option1[1].getQuantity()>0.0)
        res=res+"\n  \tb."+option1[1].getDiet()+"\n";
           if(option2[0].getQuantity()>0.0)
           {
        res=res+"\n\t\tOR\n\n";
        res=res+"2.\t"+option2[0].getDiet()+"\n";
           }
        return res;
    }
}
