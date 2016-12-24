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
public class lunch {
    public diet option1[]=new diet[3];

    public lunch() {
        for(int i=0;i<3;i++)
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
        
    }
    
    public lunch(double rice,double dahl,double veg) {
        for(int i=0;i<3;i++)
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
        
    }
    public String getLunch()
    {
        String res="";
        res="LUNCH\n_______________________________________________\n";
        res=res+"1.\ta."+option1[0].getDiet()+"\n  \tb."+option1[1].getDiet()+"\n  \tc."+option1[2].getDiet()+"\n";
                
        return res;
    }
}
