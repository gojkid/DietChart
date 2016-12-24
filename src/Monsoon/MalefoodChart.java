/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Monsoon;

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
   
    public String getFoodChart()
    {
        breakfast b=new breakfast();
        eveningSnack es=new eveningSnack(this.diet);
        lunch l=new lunch(this.diet);
        midDayMeal mdm=new midDayMeal();
        supper s=new supper(this.diet);
        String res="";
        
        switch (this.profile) {
            case "Jaundice":                                          calorie=1815 ;
                b=new breakfast(2.0,0.0,0.0,0.0);
                l=new lunch(2.0,0.5,1.0,3.0,0.0,this.diet);
                s=new supper(2.0,0.5,1.0,0.0,1.0,this.diet);
                break;
            case "Diabetic":                                          calorie=1550 ;
                b=new breakfast(2.0,0.0,0.0,1.0);
                mdm=new midDayMeal(0.0,0.0,0.0);
                es= new eveningSnack(0.0,0.0,0.0,0.0,2.0,0.0,this.diet);
                break;
            case "Under Diet":                                        calorie=1700 ;
                mdm=new midDayMeal(0.0,0.0,0.0);
                es= new eveningSnack(0.0,0.0,0.0,0.0,1.0,0.0,this.diet);
                break;
            case "Sedentary Work":                                    calorie=2280 ;
                mdm=new midDayMeal(2.0,0.0,0.0);
                l=new lunch(2.0,1.0,1.0,2.0,1.0,this.diet);                 
                break;
            case "Moderate Work":                                     calorie=2395 ;
                mdm=new midDayMeal(2.0,0.0,0.0);
                l=new lunch(3.0,1.0,1.0,3.0,1.0,this.diet);                
                es=new eveningSnack(4.0,0.0,2.0,0.0,1.0,2.0,this.diet);
                break;
            case "Heavy Work":                                        calorie=3085 ;
                mdm=new midDayMeal(2.0,2.0,1.0);
                l=new lunch(4.0,1.0,2.0,4.0,1.0,this.diet);
                es=new eveningSnack(4.0,0.0,2.0,1.0,2.0,2.0,this.diet);
                break;
            case "(16-18 years)":                                     calorie=2590 ;
                b=new breakfast(2.0,0.0,1.0,0.0);
                mdm=new midDayMeal(2.0,0.0,0.0);
                l=new lunch(3.0,1.0,1.0,3.0,1.0,this.diet);                   
                es=new eveningSnack(4.0,1.0,0.0,0.0,1.0,2.0,this.diet);
                break;
            case "(13-15 years)":                                     calorie=2320 ;
                b=new breakfast(2.0,0.0,1.0,0.0);
                mdm=new midDayMeal(2.0,0.0,0.0);
                es=new eveningSnack(4.0,1.0,0.0,0.0,1.0,2.0,this.diet);
                break;
            case "(10-12 years)":                                      calorie=2105 ;
                b=new breakfast(2.0,0.0,1.0,0.0);                   
                break;
        }
        
        switch(this.chronic)
        {
            case "Hypertension":
                
            case "Coronary Heart Disease":
                b=new breakfast(2.0,0.0,0.0,1.0);
                l.option2[0].setQuantity(l.option2[0].getQuantity()+l.option2[1].getQuantity());
                l.option2[1].setQuantity(0.0);
                es.option1[3].setQuantity(0.0);
                es.option1[4].setFood(es.option2[1].getFood());
                es.option2[0].setQuantity(0.0);
                es.option2[1].setQuantity(0.0);
                break;
                
            case "Chronic Kidney Disease":
                es.option1[4].setFood(es.option2[1].getFood());
            
        }

        res=b.getBreafast()+mdm.getMidDayMeal()+l.getLunch()+es.getEveningSnack()+s.getSupper();
        
        return res;
    }
    
}
