/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Summer;

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

    public ChildFoodChart(String profile) {
        this.profile = profile;
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
            case "(7-9 years)":
                b=new breakfast(2.0,0.0,1.0,0.0);                               this.calorie=1925 ;
                l=new lunch(1.5,0.5,1.0);
                s=new supper(1.5,1.0,0.5,1.0,0.0,this.diet);
                break;
            case "(4-6 years)":
                b=new breakfast(2.0,0.0,1.0,0.0);                               this.calorie=1675 ;
                l=new lunch(1.5,0.5,0.5);
                es=new eveningSnack(1.0,0.0,0.5,0.0,1.0,0.0,0.0,0.0,this.diet);
                s=new supper(1.5,0.5,0.5,1.0,0.0,this.diet);
                break;
           case "(1-3 years)":
                b=new breakfast(2.0,0.0,1.0,0.0);                               this.calorie=1245 ;
                l=new lunch(0.75,0.5,0.5);
                es=new eveningSnack(1.0,0.0,0.5,0.0,0.5,0.0,0.0,0.0,this.diet);
                s=new supper(0.75,0.5,0.5,1.0,0.0,this.diet);
                break;
                
        }
        

        res=b.getBreafast()+mdm.getMidDayMeal()+l.getLunch()+es.getEveningSnack()+s.getSupper();
        
        return res;
    }
}