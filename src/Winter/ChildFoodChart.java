/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Winter;
/**
 *
 * @author Souvik
 */
public class ChildFoodChart {
       String profile;
       String diet;
    private int calorie;

    public int getCalorie() {
        return calorie;
    }

    public ChildFoodChart(String profile,String diet) {
        this.profile = profile;
        this.diet=diet;
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
            case "(7-9 years)":
                b=new breakfast(2.0,0.0,1.0,0.0);                               this.calorie=1950 ;
                l=new lunch(1.5,0.5,1.0,1.0,0.0,1.0,this.diet);
                s=new supper(3.0,1.0,0.5,1.0,0.75,0.75,1.0,1.0,this.diet);
                break;
            case "(4-6 years)":
                b=new breakfast(2.0,0.0,1.0,0.0);                               this.calorie=1695 ;
                l=new lunch(1.0,0.5,0.5,1.0,0.0,1.0,this.diet);
                s=new supper(3.0,0.5,0.5,1.0,0.75,0.75,1.0,0.0,this.diet);
                break;
           case "(1-3 years)":
                b=new breakfast(0.0,0.0,1.0,0.0);                               this.calorie=1342 ;
                l=new lunch(0.75,0.5,0.5,1.0,0.0,0.0,this.diet);
                es=new eveningSnack(1.0,0.5,0.0,0.0,1.0,0.0,this.diet);
                s=new supper(2.0,0.5,0.5,1.0,0.75,0.75,1.0,0.0,this.diet);
                break;
                
        }
        

        res=b.getBreafast()+mdm.getMidDayMeal()+l.getLunch()+es.getEveningSnack()+s.getSupper(this.diet);
        
        return res;
    }
}