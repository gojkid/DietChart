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
public class supper {
public diet option1[]=new diet[5];
    public supper(String diet) {
        for(int i=0;i<5;i++)
        {
            option1[i]=new diet();
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
        
        option1[3].setFood("fish curry");
        option1[3].setQuantity(1.0);
        option1[3].setTypeOfQuantity("cup");
        
        option1[4].setFood("Salad (consisting of 1 carrot, 1 cucumber, 1 onion & 1 tomato)");
        option1[4].setQuantity(0.0);
        option1[4].setTypeOfQuantity("plate");
        
        if(diet.equals("veg"))
        {
        option1[3].setFood("paneer curry");
        option1[3].setQuantity(1.0);
        option1[3].setTypeOfQuantity("cup");
        }
    }
    
    public supper(double rice,double veg,double dahl,double fish, double salad,String diet) {
        for(int i=0;i<5;i++)
        {
            option1[i]=new diet();
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
        
        option1[3].setFood("fish curry");
        option1[3].setQuantity(fish);
        option1[3].setTypeOfQuantity("cup");
        
        option1[4].setFood("Salad (consisting of 1 carrot, 1 cucumber, 1 onion & 1 tomato)");
        option1[4].setQuantity(salad);
        option1[4].setTypeOfQuantity("plate");
        
        if(diet.equals("veg"))
        {
        option1[3].setFood("paneer curry");
        option1[3].setQuantity(fish);
        option1[3].setTypeOfQuantity("cup");
        }
    }
    
    public String getSupper()
    {
        String res="";
        res="SUPPER\n_______________________________________________\n";
        res=res+"1.\ta."+option1[0].getDiet()+"\n  \tb."+option1[1].getDiet()+"\n  \tc."+option1[2].getDiet();
        if(option1[3].getQuantity()>0.0)
        res=res+"\n  \td."+option1[3].getDiet()+"\n";
        if(option1[4].getQuantity()>0.0)
        res=res+"\n  \td."+option1[4].getDiet()+"\n";
        
        return res;
    }
    
}