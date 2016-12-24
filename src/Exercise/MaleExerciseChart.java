/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

/**
 *
 * @author Souvik
 */
public class MaleExerciseChart {
   
    int height;
    int weight;
    String profile;
    private StandardHeightAndWeight shaw;
    private int calorie;

    /**
     * Get the value of calorie
     *
     * @return the value of calorie
     */
    public int getCalorie() {
        return calorie;
    }

    public MaleExerciseChart(int height, int weight,String profile) {
        this.height = height;
        this.weight = weight;
        this.profile=profile;
    }    

    public String getExcerciseProfile(String profile)
    {
        double hrs[]=new double[19];
        HeightAndWeightProfile hawp=new HeightAndWeightProfile();
        
        shaw=new StandardHeightAndWeight();
        String res="";
        for(int i=1;i<shaw.MaleHeightAndWeight.length;i++)
        {
            if(shaw.MaleHeightAndWeight[i-1].getCentimeter()==height)
                hawp=shaw.MaleHeightAndWeight[i-1];
            else if(shaw.MaleHeightAndWeight[i].getCentimeter()==height)
                hawp=shaw.MaleHeightAndWeight[i];
            else if(shaw.MaleHeightAndWeight[i-1].getCentimeter()<height && shaw.MaleHeightAndWeight[i].getCentimeter()>height)
                hawp=shaw.MaleHeightAndWeight[i-1];
        }
        
        if(weight>hawp.getUpperLimitWeight() && weight<hawp.getObese())
        {
          switch (profile) {
            case "Jaundice":       
                
                break;
            case "Diabetic":                                                     this.calorie=771 ;
                hrs[1]=1.0;
                hrs[3]=1.0;
                hrs[14]=0.5;
                break;
            case "Under Diet":                                                  this.calorie=882 ;
                 hrs[1]=1.0;
                hrs[3]=1.0;
                hrs[14]=1.0;
                break;
            case "Sedentary Work":                                              this.calorie=582 ;
                hrs[1]=1.0;
                hrs[14]=1.0;          
                break;
            case "Moderate Work":                                               this.calorie=660 ;
                hrs[1]=1.0;
                hrs[3]=1.0;
                break;
            case "Heavy Work":                                                  this.calorie=660 ;
                hrs[1]=1.0;
                hrs[3]=1.0;
                break;
           case "(37-39 years)":                                                this.calorie=320 ;
                hrs[8]=2.0;
                break;
           case "(34-36 years)":                                                this.calorie=336 ;
                hrs[7]=0.5;
                hrs[8]=1.0;
                break;
           case "(31-33 years)":                                                this.calorie=513 ;
                hrs[7]=1.0;
                hrs[8]=1.0;
                break;
           case "(28-30 years)":                                                this.calorie=682 ;
                hrs[6]=1.0;
                hrs[8]=1.0;
                break;
           case "(25-27 years)":                                               this.calorie=752 ;
                hrs[4]=0.5;
                hrs[5]=0.5;
                hrs[8]=1.0;
                break;
            case "(22-24 years)":                                               this.calorie=748 ;
                hrs[5]=0.5;
                hrs[6]=0.5;
                hrs[8]=1.0;
                break;
            case "(19-21 years)":                                               this.calorie=862 ;
                hrs[4]=0.5;
                hrs[5]=0.5;
                hrs[8]=1.0;
                break;
            case "(16-18 years)":                                               this.calorie=752 ;
                hrs[3]=1.0;
                hrs[11]=1.0;
                break;            
            case "(13-15 years)":                                               this.calorie=552 ;
                 hrs[6]=1.0;
                break;
            case "(10-12 years)":                                               this.calorie=598 ;
                hrs[7]=1.0;
                hrs[11]=1.0;
                break;
            case "(7-9 years)":                                                 this.calorie=256 ;
                hrs[7]=0.5;
                hrs[8]=0.5;
                break;            
            case "(4-6 years)":                                                 this.calorie=176 ;
                hrs[7]=0.5;
                break;
            case "(1-3 years)":                                                 this.calorie=160 ;
                hrs[8]=1.0;
                break;
            default:                                                            this.calorie=240 ;
                hrs[8]=1.5;
                
        }
        }
        else if(weight>hawp.getObese())
        {
            switch (profile) {
            case "Jaundice":       
                
                break;
            case "Diabetic":                                                     this.calorie=771 ;
                 hrs[1]=1.0;
                hrs[3]=1.0;
                hrs[14]=0.5;
                break;
            case "Under Diet":                                                  this.calorie=882 ;
                hrs[1]=1.0;
                hrs[3]=1.0;
                hrs[14]=1.0;
                break;
            case "Sedentary Work":                                              this.calorie=690 ;
                hrs[1]=1.0;
                hrs[14]=1.0;       
                hrs[18]=1.0;
                break;
            case "Moderate Work":                                               this.calorie=660 ;
                hrs[1]=1.0;
                hrs[3]=1.0;              
                break;
            case "Heavy Work":                                                  this.calorie=660 ;
                hrs[1]=1.0;
                hrs[3]=1.0;          
                break;
            case "(37-39 years)":                                                this.calorie=320 ;
                hrs[8]=2.0;
                break;
           case "(34-36 years)":                                                this.calorie=336 ;
                hrs[7]=0.5;
                hrs[8]=1.0;
                break;
           case "(31-33 years)":                                                this.calorie=513 ;
                hrs[7]=1.0;
                hrs[8]=1.0;
                break;
           case "(28-30 years)":                                                this.calorie=713 ;
                hrs[3]=1.0;
                hrs[7]=1.0;
                break;
            case "(25-27 years)":                                               this.calorie=898 ;
                hrs[3]=1.0;
                hrs[5]=0.5;
                hrs[6]=0.5;
                break;
            case "(22-24 years)":                                               this.calorie=963 ;
                hrs[4]=0.5;
                hrs[5]=0.5;
                hrs[6]=0.5;
                break;
            case "(19-21 years)":                                               this.calorie=1143 ;
                hrs[3]=0.5;
                hrs[4]=0.5;
                hrs[5]=0.5;
                hrs[6]=0.5;
                break;
            case "(16-18 years)":                                               this.calorie=1062 ;
                hrs[3]=1.0;
                hrs[6]=1.0;       
                hrs[12]=1.0;
                break;            
            case "(13-15 years)":                                               this.calorie=893 ;
                hrs[3]=1.0;
                hrs[7]=1.0;       
                hrs[12]=1.0;  
                break;
            case "(10-12 years)":                                               this.calorie=713 ;
                hrs[3]=1.0;
                hrs[7]=1.0;       
                break;
            case "(7-9 years)":                                                 this.calorie=353 ;
                hrs[7]=0.5;
                break;            
            case "(4-6 years)":                                                 this.calorie=256 ;
                hrs[7]=0.5;
                hrs[8]=0.5;
                break;
            case "(1-3 years)":                                                 this.calorie=160 ;
                hrs[8]=1.0;
                break;
            default:                                                            this.calorie=320 ;
                hrs[8]=2.0;
                
        }
        
        }
        else 
        {
            hrs[8]=1.5;
            this.calorie=240;
        }
        
        ExerciseProfile ep=new ExerciseProfile(hrs);
        res=ep.getExcerciseProfile();
        
        return res;
    }
    
}
