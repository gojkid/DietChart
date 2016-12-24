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
public class midDayMeal {
    public diet option1[]=new diet[3];
    public diet option2[]=new diet[3];

    public midDayMeal() {
        for(int i=0;i<3;i++)
        {
            option1[i]=new diet();
            option2[i]=new diet();
        }
        option1[0].setFood("Water Melon");
        option1[0].setQuantity(4.0);
        option1[0].setTypeOfQuantity("slices");
        
        option1[1].setFood("bread");
        option1[1].setQuantity(0);
        option1[1].setTypeOfQuantity("slices");
        
        option1[2].setFood("bannana");
        option1[2].setQuantity(0);
        option1[2].setTypeOfQuantity("nos");
        
        /////////////////////////////////////
        
        option2[0].setFood("Musk  Melon");
        option2[0].setQuantity(4.0);
        option2[0].setTypeOfQuantity("slices");
        
        option2[1].setFood("bread");
        option2[1].setQuantity(0);
        option2[1].setTypeOfQuantity("slices");
        
        option2[2].setFood("bannana");
        option2[2].setQuantity(0);
        option2[2].setTypeOfQuantity("nos");
    }
    
    public midDayMeal(double fruits,double bread,double bannana) {
        for(int i=0;i<3;i++)
        {
            option1[i]=new diet();
            option2[i]=new diet();
        }
        option1[0].setFood("Water Melon");
        option1[0].setQuantity(fruits);
        option1[0].setTypeOfQuantity("slices");
        
        option1[1].setFood("bread");
        option1[1].setQuantity(bread);
        option1[1].setTypeOfQuantity("slices");
        
        option1[2].setFood("bannana");
        option1[2].setQuantity(bannana);
        option1[2].setTypeOfQuantity("nos");
        
        /////////////////////////////////////
        
        option2[0].setFood("Musk  Melon");
        option2[0].setQuantity(fruits);
        option2[0].setTypeOfQuantity("slices");
        
        option2[1].setFood("bread");
        option2[1].setQuantity(fruits);
        option2[1].setTypeOfQuantity("slices");
        
        option2[2].setFood("bannana");
        option2[2].setQuantity(bannana);
        option2[2].setTypeOfQuantity("nos");
    }
    
    public String getMidDayMeal()
    {
         String res="";
         int flag=0;
         for(int i=0;i<3;i++)
        {
            if(option1[i].getQuantity()>0.0)
                flag=1;
            if(option2[i].getQuantity()>0.0)
                flag=1;
        }
         if(flag==0)
             return res;
        res="MID-DAY MEAL\n_______________________________________________\n";
        if(option1[0].getQuantity()>0.0)
        res=res+"1.\ta."+option1[0].getDiet()+"\n";
        if(option1[1].getQuantity()>0.0)
        res=res+"  \tb."+option1[1].getDiet()+"\n";
        if(option1[2].getQuantity()>0.0)
        res=res+"  \tc."+option1[2].getDiet()+"\n";
                
        res=res+"\n\t\tOR\n\n";
        if(option2[0].getQuantity()>0.0)
        res=res+"1.\ta."+option2[0].getDiet()+"\n";
        if(option2[1].getQuantity()>0.0)
        res=res+"  \tb."+option2[1].getDiet()+"\n";
        if(option2[2].getQuantity()>0.0)
        res=res+"  \tc."+option2[2].getDiet()+"\n";
        return res;
    }
}
