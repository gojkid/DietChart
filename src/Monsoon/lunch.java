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
public class lunch {
    public diet option1[]=new diet[3];
    public diet option2[]=new diet[2];
    public lunch(String diet) {
        for(int i=0;i<3;i++)
        {
            option1[i]=new diet();
        }
        for(int i=0;i<2;i++)
        {
            option2[i]=new diet();
        }
        option1[0].setFood("rice");
        option1[0].setQuantity(2.0);
        option1[0].setTypeOfQuantity("cup");
        
        option1[1].setFood("plain dahl");
        option1[1].setQuantity(0.5);
        option1[1].setTypeOfQuantity("cup");
        
        option1[2].setFood("vegetable with gravy");
        option1[2].setQuantity(1.0);
        option1[2].setTypeOfQuantity("cup");
        
        ////////////////////////////////////////
        
        option2[0].setFood("khichdi");
        option2[0].setQuantity(2.0);
        option2[0].setTypeOfQuantity("cup");
        
        option2[1].setFood("omlette");
        option2[1].setQuantity(1.0);
        option2[1].setTypeOfQuantity("nos.");
        
        if(diet.equals("veg"))
        {
        option2[0].setFood("khichdi");
        option2[0].setQuantity(3.0);
        option2[0].setTypeOfQuantity("cup");
        
        option2[1].setFood("omlette");
        option2[1].setQuantity(0.0);
        option2[1].setTypeOfQuantity("nos.");
        }
        
    }
    
    public lunch(double rice,double dahl,double veg,double khichdi,double egg,String diet) {
        for(int i=0;i<3;i++)
        {
            option1[i]=new diet();
        }
        for(int i=0;i<2;i++)
        {
            option2[i]=new diet();
        }
        
        option1[0].setFood("rice");
        option1[0].setQuantity(rice);
        option1[0].setTypeOfQuantity("cup");
        
        option1[1].setFood("plain dahl");
        option1[1].setQuantity(dahl);
        option1[1].setTypeOfQuantity("cup");
        
        option1[2].setFood("vegetable with gravy");
        option1[2].setQuantity(veg);
        option1[2].setTypeOfQuantity("cup");
        
        ////////////////////////////////////////
        
        option2[0].setFood("khichdi");
        option2[0].setQuantity(khichdi);
        option2[0].setTypeOfQuantity("cup");
        
        option2[1].setFood("omlette");
        option2[1].setQuantity(egg);
        option2[1].setTypeOfQuantity("nos.");
        
        if(diet.equals("veg"))
        {
        option2[0].setFood("khichdi");
        option2[0].setQuantity(khichdi+egg);
        option2[0].setTypeOfQuantity("cup");
        
        option2[1].setFood("omlette");
        option2[1].setQuantity(0.0);
        option2[1].setTypeOfQuantity("nos.");
        }
        
    }
    public String getLunch()
    {
        String res="";
        res="LUNCH\n_______________________________________________\n";
        res=res+"1.\ta."+option1[0].getDiet()+"\n  \tb."+option1[1].getDiet()+"\n  \tc."+option1[2].getDiet()+"\n";
        res=res+"\n\t\tOR\n\n";
        res=res+"2.\ta."+option2[0].getDiet()+"\n";
        if(option2[1].getQuantity()>0.0)
        res=res+"  \tb."+option2[1].getDiet()+"\n";        
        return res;
    }
}
