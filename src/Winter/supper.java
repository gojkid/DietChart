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
public class supper {
public diet option1[]=new diet[5];
public diet option2[]=new diet[3];
public diet option3[]=new diet[3];
public diet option4[]=new diet[3];
public diet option5[]=new diet[3];
    public supper(String diet) {
        for(int i=0;i<5;i++)
        {
            option1[i]=new diet();
        }
        for(int i=0;i<3;i++)
        {
            option2[i]=new diet();
            option3[i]=new diet();
            option4[i]=new diet();
            option5[i]=new diet();
        }
        option1[0].setFood("roti");
        option1[0].setQuantity(4.0);
        option1[0].setTypeOfQuantity("nos.");
        
        option1[1].setFood("vegetable(dry)");
        option1[1].setQuantity(1.0);
        option1[1].setTypeOfQuantity("cup");
        
        option1[2].setFood("plain dahl");
        option1[2].setQuantity(0.5);
        option1[2].setTypeOfQuantity("cup");
        
        option1[3].setFood("omlette");
        option1[3].setQuantity(1.0);
        option1[3].setTypeOfQuantity("nos.");
        
        option1[4].setFood("Salad (consisting of 1 carrot, 1 cucumber, 1 onion & 1 tomato)");
        option1[4].setQuantity(0.0);
        option1[4].setTypeOfQuantity("plate");
        
        ////////////////////////////////////////
        
        option2[0].setFood("roti");
        option2[0].setQuantity(4.0);
        option2[0].setTypeOfQuantity("nos.");
        
        option2[1].setFood("vegetable(dry)");
        option2[1].setQuantity(1.0);
        option2[1].setTypeOfQuantity("cup");
        
        option2[2].setFood("mutton curry");
        option2[2].setQuantity(0.75);
        option2[2].setTypeOfQuantity("cup");
        
        ////////////////////////////////////////
        
        option3[0].setFood("roti");
        option3[0].setQuantity(4.0);
        option3[0].setTypeOfQuantity("nos.");
        
        option3[1].setFood("vegetable(dry)");
        option3[1].setQuantity(1.0);
        option3[1].setTypeOfQuantity("cup");
        
        option3[2].setFood("chicken curry");
        option3[2].setQuantity(0.75);
        option3[2].setTypeOfQuantity("cup");
        
        ////////////////////////////////////////
        
        option4[0].setFood("roti");
        option4[0].setQuantity(4.0);
        option4[0].setTypeOfQuantity("nos.");
        
        option4[1].setFood("vegetable(dry)");
        option4[1].setQuantity(1.0);
        option4[1].setTypeOfQuantity("cup");
        
        option4[2].setFood("prawn curry");
        option4[2].setQuantity(1.0);
        option4[2].setTypeOfQuantity("cup");
        
        if(diet.equals("veg"))
        {
        option1[3].setFood("paneer curry");
        option1[3].setQuantity(1.0);
        option1[3].setTypeOfQuantity("cup");
        
        option2[2].setFood("paneer curry");
        option2[2].setQuantity(1.5);
        option2[2].setTypeOfQuantity("cup");
        }
            
    }
    
    public supper(double roti,double veg,double dahl,double omlette,double chicken,double mutton,double prawn,double salad,String diet) {
        for(int i=0;i<5;i++)
        {
            option1[i]=new diet();
        }
        for(int i=0;i<3;i++)
        {
            option2[i]=new diet();
            option3[i]=new diet();
            option4[i]=new diet();
            option5[i]=new diet();
        }
        option1[0].setFood("roti");
        option1[0].setQuantity(roti);
        option1[0].setTypeOfQuantity("nos.");
        
        option1[1].setFood("vegetable(dry)");
        option1[1].setQuantity(veg);
        option1[1].setTypeOfQuantity("cup");
        
        option1[2].setFood("plain dahl");
        option1[2].setQuantity(dahl);
        option1[2].setTypeOfQuantity("cup");
        
        option1[3].setFood("omlette");
        option1[3].setQuantity(omlette);
        option1[3].setTypeOfQuantity("nos.");
        
        option1[4].setFood("Salad (consisting of 1 carrot, 1 cucumber, 1 onion & 1 tomato)");
        option1[4].setQuantity(salad);
        option1[4].setTypeOfQuantity("plate");
        
        ////////////////////////////////////////
        
        option2[0].setFood("roti");
        option2[0].setQuantity(roti);
        option2[0].setTypeOfQuantity("nos.");
        
        option2[1].setFood("vegetable(dry)");
        option2[1].setQuantity(veg);
        option2[1].setTypeOfQuantity("cup");
        
        
        option2[2].setFood("mutton curry");
        option2[2].setQuantity(mutton);
        option2[2].setTypeOfQuantity("cup");
        
        ////////////////////////////////////////
        
        option3[0].setFood("roti");
        option3[0].setQuantity(roti);
        option3[0].setTypeOfQuantity("nos.");
        
        option3[1].setFood("vegetable(dry)");
        option3[1].setQuantity(veg);
        option3[1].setTypeOfQuantity("cup");
        
        option3[2].setFood("chicken curry");
        option3[2].setQuantity(chicken);
        option3[2].setTypeOfQuantity("cup");
        
        ////////////////////////////////////////
        
        option4[0].setFood("roti");
        option4[0].setQuantity(roti);
        option4[0].setTypeOfQuantity("nos.");
        
        option4[1].setFood("vegetable(dry)");
        option4[1].setQuantity(veg);
        option4[1].setTypeOfQuantity("cup");
        
        option4[2].setFood("prawn curry");
        option4[2].setQuantity(prawn);
        option4[2].setTypeOfQuantity("cup");
        
        if(diet.equals("veg"))
        {
        option1[3].setFood("paneer curry");
        option1[3].setQuantity(omlette);
        option1[3].setTypeOfQuantity("cup");
        
        option2[2].setFood("paneer curry");
        option2[2].setQuantity(prawn*1.5);
        option2[2].setTypeOfQuantity("cup");
        }
    }
    
    public String getSupper(String diet)
    {
        String res="";
        res="SUPPER\n_______________________________________________\n";
        if(option1[4].getQuantity()>0.0)
        {
            res=res+"1.\ta."+option1[0].getDiet()+"\n  \tb."+option1[1].getDiet()+"\n  \tc."+option1[2].getDiet()+"\n  \td."+option1[4].getDiet()+"\n";
            return res;
        }
        res=res+"1.\ta."+option1[0].getDiet()+"\n  \tb."+option1[1].getDiet()+"\n  \tc."+option1[2].getDiet()+"\n  \td."+option1[3].getDiet()+"\n";
        res=res+"\n\t\tOR\n\n";
        res=res+"2.\ta."+option2[0].getDiet()+"\n  \tb."+option2[1].getDiet()+"\n  \tc."+option2[2].getDiet()+"\n";
        if(!diet.equals("veg"))
        {
        res=res+"\n\t\tOR\n\n";
        res=res+"3.\ta."+option3[0].getDiet()+"\n  \tb."+option3[1].getDiet()+"\n  \tc."+option3[2].getDiet()+"\n";
        res=res+"\n\t\tOR\n\n";
        res=res+"4.\ta."+option4[0].getDiet()+"\n  \tb."+option4[1].getDiet()+"\n  \tc."+option4[2].getDiet()+"\n";
        }
        return res;
    }
    
}
