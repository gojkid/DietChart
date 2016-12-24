/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Winter;

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
        lunch l=new lunch(this.diet);
        midDayMeal mdm=new midDayMeal();
        supper s=new supper(this.diet);
        String res="";
        
        switch (this.profile) {
            case "Jaundice":                                                    this.calorie=1630 ;
                b=new breakfast(2.0,0.0,0.0,0.0);
                l=new lunch(2.0,0.5,1.0,0.0,3.0,1.0,this.diet);
                s=new supper(4.0,1.0,0.5,0.0,0.0,0.0,0.0,1.0,this.diet);
                break;
             case "Diabetic":                                                   this.calorie=1750 ;
                b=new breakfast(2.0,0.0,0.0,1.0);
                l=new lunch(2.0,0.5,1.0,1.0,0.0,0.0,this.diet);
                es= new eveningSnack(0.0,0.0,0.0,0.0,1.0,0.0,this.diet);
                break;
            case "Under Diet":                                                  this.calorie=1760 ;
                b=new breakfast(2.0,0.0,0.0,1.0);
                l=new lunch(2.0,0.5,1.0,1.0,0.0,0.0,this.diet);
                es= new eveningSnack(0.0,0.0,0.0,0.0,1.0,0.0,this.diet);
                s=new supper(4.0,1.0,0.5,1.0,0.75,0.75,1.0,1.0,this.diet);
                break;
            case "Sedentary Work":                                              this.calorie=1890 ;
                l=new lunch(2.0,0.5,1.0,1.0,0.0,0.0,this.diet);
                es= new eveningSnack(0.0,0.0,0.0,0.0,1.0,0.0,this.diet);
                break;
            case "Moderate Work":                                               this.calorie=2140 ;
                l=new lunch(2.0,1.0,1.0,1.0,6.0,0.0,this.diet);
                break;
            case "Heavy Work":                                                  this.calorie=2720 ;
                l=new lunch(3.0,1.0,1.0,1.0,6.0,0.0,this.diet);
                es=new eveningSnack(4.0,0.0,2.0,0.0,1.0,2.0,this.diet);
                break;
            case "(16-18 years)":
                b=new breakfast(2.0,0.0,1.0,0.0);                               this.calorie=2115 ;
                break;
            case "(13-15 years)":
                b=new breakfast(2.0,0.0,1.0,0.0);                               this.calorie=2115 ;
                break;
            case "(10-12 years)":
                b=new breakfast(2.0,0.0,1.0,0.0);                               this.calorie=1950 ;
                l=new lunch(1.5,0.5,1.0,1.0,0.0,1.0,this.diet);
                s=new supper(3.0,1.0,0.5,1.0,0.75,0.75,1.0,1.0,this.diet);
                break;
        }
        
        switch(this.condition)
        {
            case "Pregnant":
                b=new breakfast(0.0,0.0,2.0,0.0);                               this.calorie=this.calorie+ 325 ;
                mdm=new midDayMeal(2.0,0.0,0.0);
                es.option1[4].setQuantity(2.0);
                if(this.profile.equals("Diabetic"))
                {
                     b=new breakfast(2.0,0.0,0.0,2.0);
                    s=new supper(5.0,1.0,0.5,1.0,1.0,1.0,1.0,1.0,this.diet);
                }
                break;
            case "Lactation(0 to 6 months)":                                    this.calorie=this.calorie+ 535 ;
                b=new breakfast(2.0,0.0,1.0,0.0);
                l=new lunch(2.0,1.0,1.0,1.0,3.0,1.0,this.diet);
                mdm=new midDayMeal(2.0,0.0,0.0);
                es.option1[4].setQuantity(2.0);
                s=new supper(5.0,1.0,0.5,1.0,1.0,1.0,1.0,1.0,this.diet);
                if(this.profile.equals("Diabetic"))
                     b=new breakfast(2.0,0.0,0.0,1.0);
                break;
            case "Lactation(6 to 12 months)":                                   this.calorie=this.calorie+ 373 ;
                b=new breakfast(2.0,0.0,2.0,0.0);
                 l=new lunch(2.0,1.0,1.0,1.0,3.0,1.0,this.diet);
                mdm=new midDayMeal(2.0,0.0,0.0);
                es.option1[4].setQuantity(2.0);
                if(this.profile.equals("Diabetic"))
                {
                     b=new breakfast(2.0,0.0,0.0,1.0);
                     s=new supper(5.0,1.0,0.5,1.0,1.0,1.0,1.0,1.0,this.diet);

                }
                break;
                
        }
        
        switch(this.chronic)
        {
            case "Hypertension":
                
            case "Coronary Heart Disease":
                b=new breakfast(2.0,0.0,0.0,1.0);
                b.option1[0].setQuantity(b.option1[0].getQuantity()*2);
                mdm.option2[0].setFood(mdm.option1[0].getFood());
                es.option2[0].setQuantity(0.0);
                es.option2[1].setQuantity(0.0);
                es.option1[3].setQuantity(0.0);
                s.option1[3].setFood("fish curry");
                s.option1[3].setTypeOfQuantity("cup");
                s.option1[4].setQuantity(1.0);
                 for(int i=0;i<3;i++)
                  {
                      s.option2[i]=null;
                      s.option3[i]=null;
                      s.option4[i]=null;
                      s.option5[i]=null;
                  }
                break;
                
            case "Chronic Kidney Disease":
                b.option1[0].setQuantity(b.option1[0].getQuantity()*2);
                mdm.option1[0].setQuantity(0.0);
                mdm.option2[0].setQuantity(0.0);
                break;
            
        }

        res=b.getBreafast()+mdm.getMidDayMeal()+l.getLunch()+es.getEveningSnack()+s.getSupper(this.diet);
        
        return res;
    }
    
}
