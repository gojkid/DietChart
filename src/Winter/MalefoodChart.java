/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Winter;

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
            case "Jaundice":
                b=new breakfast(2.0,0.0,0.0,0.0);                                this.calorie=1710 ;
                l=new lunch(2.0,0.5,1.0,0.0,3.0,1.0,this.diet);
                s=new supper(5.0,1.0,0.5,0.0,0.0,0.0,0.0,1.0,this.diet);
                break;
             case "Diabetic":
                b=new breakfast(2.0,0.0,0.0,1.0);                                this.calorie=1750 ;
                l=new lunch(2.0,0.5,1.0,1.0,0.0,0.0,this.diet);
                es= new eveningSnack(0.0,0.0,0.0,0.0,1.0,0.0,this.diet);
                break;
            case "Under Diet":                                                   this.calorie=1840 ;
                l=new lunch(2.0,0.5,1.0,1.0,0.0,0.0,this.diet);
                es= new eveningSnack(0.0,0.0,0.0,0.0,1.0,0.0,this.diet);
                s=new supper(4.0,1.0,0.5,1.0,0.75,0.75,1.0,1.0,this.diet);
                break;
            case "Sedentary Work":                                               this.calorie=2140 ; 
                l=new lunch(2.0,1.0,1.0,1.0,6.0,0.0,this.diet);
                break;
            case "Moderate Work":                                                this.calorie=2720 ;
                l=new lunch(3.0,1.0,1.0,1.0,6.0,0.0,this.diet);
                es=new eveningSnack(4.0,0.0,2.0,0.0,1.0,2.0,this.diet);
                break;
            case "Heavy Work":                                                   this.calorie=3230 ;
                mdm=new midDayMeal(1.0,2.0,1.0);
                l=new lunch(4.0,1.0,2.0,1.0,6.0,0.0,this.diet);
                es=new eveningSnack(4.0,0.0,2.0,1.0,1.0,4.0,this.diet);
                break;
            case "(16-18 years)":                                               this.calorie=2625 ;
                b=new breakfast(2.0,0.0,1.0,0.0);
                mdm=new midDayMeal(2.0,0.0,0.0);
                l=new lunch(2.0,1.0,1.0,1.0,6.0,0.0,this.diet);
                es=new eveningSnack(4.0,0.0,2.0,0.0,1.0,2.0,this.diet);
                break;
            case "(13-15 years)":                                               this.calorie=2365 ;
                b=new breakfast(2.0,0.0,1.0,0.0);
                mdm=new midDayMeal(2.0,0.0,0.0);
                l=new lunch(2.0,1.0,1.0,1.0,6.0,0.0,this.diet);
                es=new eveningSnack(2.0,0.0,1.0,0.0,1.0,2.0,this.diet);
                break;
            case "(10-12 years)":                                               this.calorie=2115 ;
                b=new breakfast(2.0,0.0,1.0,0.0);
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
