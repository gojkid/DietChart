/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Summer;

/**
 *
 * @author Souvik
 */
public class MalefoodChart {

   String profile;
   String diet;
   String chronic;
    private int calorie;

    public int getCalorie() {
        return calorie;
    }

    public MalefoodChart(String profile,String diet,String chronic) {
        this.profile = profile;
        this.diet=diet;
        this.chronic=chronic;
    }
   
    public String getFoodChart(String diet)
    {
        breakfast b=new breakfast();
        eveningSnack es=new eveningSnack(this.diet);
        lunch l=new lunch();
        midDayMeal mdm=new midDayMeal();
        supper s=new supper(this.diet);
        String res="";
        
        switch (this.profile) {
            case "Jaundice":                                                 this.calorie=1695 ;
                b=new breakfast(2.0,0.0,0.0,0.0);
                s=new supper(2.0,0.5,1.0,0.0,1.0,this.diet);
                break;
            case "Diabetic":                                                 this.calorie=1600 ;
                b=new breakfast(2.0,0.0,0.0,1.0);
                es= new eveningSnack(0.0,0.0,0.0,0.0,0.0,0.0,1.0,0.0,this.diet);
                break;
            case "Under Diet":                                               this.calorie=1750 ;
                es= new eveningSnack(0.0,0.0,0.0,0.0,0.0,1.0,0.0,0.0,this.diet);
                break;
            case "Sedentary Work":                                           this.calorie=2150 ;
                l=new lunch(2.0,1.0,1.0);
                break;
            case "Moderate Work":                                            this.calorie=2500 ;
                l=new lunch(3.0,1.0,1.0);
                es=new eveningSnack(4.0,0.0,2.0,0.0,1.0,2.0,0.0,0.0,this.diet);
                break;
            case "Heavy Work":
                mdm=new midDayMeal(1.0,2.0,1.0);                             this.calorie=2830 ;
                l=new lunch(4.0,1.0,2.0);
                es=new eveningSnack(4.0,0.0,2.0,0.0,2.0,2.0,0.0,0.0,this.diet);
                break;
            case "(16-18 years)":                                            this.calorie=2605 ;
                b=new breakfast(2.0,0.0,1.0,0.0);
                mdm=new midDayMeal(2.0,0.0,0.0);
                es=new eveningSnack(4.0,1.0,0.0,0.0,1.0,2.0,0.0,0.0,this.diet);
                break;
            case "(13-15 years)":                                            this.calorie=2350 ;
                b=new breakfast(2.0,0.0,1.0,0.0);
                mdm=new midDayMeal(2.0,0.0,0.0);
                break;
            case "(10-12 years)":                                            this.calorie=2155 ;
                b=new breakfast(2.0,0.0,1.0,0.0);
                break;
        }
        
        switch(this.chronic)
        {
            case "Hypertension":
                
            case "Coronary Heart Disease":
                b=new breakfast(2.0,0.0,0.0,1.0);
                b.option1[0].setQuantity(b.option1[0].getQuantity()*2);
                mdm.option1[0].setQuantity(0.0);
                mdm.option2[0].setQuantity(0.0);
                    es.option1[5].setQuantity(es.option1[5].getQuantity()+es.option1[3].getQuantity());
                es.option1[3].setQuantity(0.0);
                es.option1[4].setFood(es.option2[1].getFood());
                es.option2[0].setQuantity(0.0);
                es.option2[1].setQuantity(0.0);
                break;
                
            case "Chronic Kidney Disease":
                b.option1[0].setQuantity(b.option1[0].getQuantity()*2);
                mdm.option1[0].setQuantity(0.0);
                mdm.option2[0].setQuantity(0.0);
                break;
            
        }

        res=b.getBreafast()+mdm.getMidDayMeal()+l.getLunch()+es.getEveningSnack()+s.getSupper();
        
        return res;
    }
    
}
