/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Summer;

/**
 *
 * @author Souvik
 */
public class FemalefoodChart {

   String profile;
   String condition;
   String diet;
   String chronic;
    private int calorie;

    public int getCalorie() {
        return calorie;
    }

    public FemalefoodChart(String profile,String condition,String diet,String chronic) {
        this.profile = profile;
        this.condition=condition;
        this.diet=diet;
        this.chronic=chronic;
    }
   
    public String getFoodChart()
    {
        breakfast b=new breakfast();
        eveningSnack es=new eveningSnack(this.diet);
        lunch l=new lunch();
        midDayMeal mdm=new midDayMeal();
        supper s=new supper(this.diet);
        String res="";
        
        switch (this.profile) {
            case "Jaundice":                                                    this.calorie=1635 ;
                b=new breakfast(2.0,0.0,0.0,0.0);
                s=new supper(2.0,0.5,1.0,0.0,1.0,this.diet);
                break;
            case "Diabetic":                                                    this.calorie=1600 ;
                b=new breakfast(2.0,0.0,0.0,1.0);
                es= new eveningSnack(0.0,0.0,0.0,0.0,0.0,0.0,1.0,0.0,this.diet);
                break;
            case "Under Diet":                                                  this.calorie=1390 ;
                b=new breakfast(2.0,0.0,0.0,1.0);
                es= new eveningSnack(0.0,0.0,0.0,0.0,0.0,0.0,1.0,0.0,this.diet);
                s=new supper(1.0,0.0,1.0,1.0,1.0,this.diet);
                break;
            case "Sedentary Work":                                              this.calorie=1750 ;
                es= new eveningSnack(0.0,0.0,0.0,0.0,0.0,1.0,0.0,0.0,this.diet);
                break;
            case "Moderate Work":                                               this.calorie=2090 ;
                l=new lunch(2.0,1.0,1.0);
                break;
            case "Heavy Work":                                                  this.calorie=2500 ;
                l=new lunch(3.0,1.0,1.0);
                es=new eveningSnack(4.0,0.0,2.0,0.0,1.0,2.0,0.0,0.0,this.diet);
                break;
            case "(16-18 years)":
                b=new breakfast(2.0,0.0,1.0,0.0);                               this.calorie=2095 ;
                break;
            case "(13-15 years)":
                b=new breakfast(2.0,0.0,1.0,0.0);                               this.calorie=2095 ;
                break;
            case "(10-12 years)":
                b=new breakfast(2.0,0.0,1.0,0.0);                               this.calorie=1925 ;
                l=new lunch(1.5,0.5,1.0);
                s=new supper(1.5,0.5,1.0,1.0,0.0,this.diet);
                break;
        }
        
        switch(this.condition)
        {
            case "Pregnant":
                b=new breakfast(2.0,0.0,2.0,0.0);                                this.calorie=this.calorie+ 345 ;
                mdm=new midDayMeal(2.0,0.0,0.0);
                if(this.profile.equals("Diabetic"))
                {
                     b=new breakfast(2.0,0.0,0.0,2.0);
                     s=new supper(2.0,0.5,1.0,1.0,1.0,this.diet);
                }
                break;
            case "Lactation(0 to 6 months)":                                    this.calorie=this.calorie+ 535 ;
                b=new breakfast(2.0,0.0,2.0,0.0);
                l=new lunch(2.0,1.0,1.0);
                mdm=new midDayMeal(2.0,0.0,0.0);
                es.option1[4].setQuantity(2.0);
                s=new supper(2.0,0.5,1.0,1.0,1.0,this.diet);
                if(this.profile.equals("Diabetic"))
                     b=new breakfast(2.0,0.0,0.0,2.0);
                break;
            case "Lactation(6 to 12 months)":                                    this.calorie=this.calorie+ 465 ;
                b=new breakfast(2.0,0.0,2.0,0.0);
                l=new lunch(2.0,1.0,1.0);
                mdm=new midDayMeal(2.0,0.0,0.0);
                es.option1[4].setQuantity(2.0);
                if(this.profile.equals("Diabetic"))
                {
                     b=new breakfast(2.0,0.0,0.0,1.0);
                     s=new supper(2.0,0.5,1.0,1.0,1.0,this.diet);
                }
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
