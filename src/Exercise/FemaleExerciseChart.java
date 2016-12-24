/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

/**
 *
 * @author Souvik
 */
public class FemaleExerciseChart {
   
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

    public FemaleExerciseChart(int height, int weight,String profile) {
        this.height = height;
        this.weight = weight;
        this.profile=profile;
    }
    

    /**
     * 
     * @return
     */
    public String getExcerciseProfile()
    {
        double hrs[]=new double[19];
        HeightAndWeightProfile hawp=new HeightAndWeightProfile();
        ExerciseProfile ep;
        shaw=new StandardHeightAndWeight();
        String res="";
        for(int i=1;i<shaw.FemaleHeightAndWeight.length;i++)
        {
            if(shaw.FemaleHeightAndWeight[i-1].getCentimeter()==height)
                hawp=shaw.FemaleHeightAndWeight[i-1];
            else if(shaw.FemaleHeightAndWeight[i].getCentimeter()==height)
                hawp=shaw.FemaleHeightAndWeight[i];
            else if(shaw.FemaleHeightAndWeight[i-1].getCentimeter()>height && shaw.FemaleHeightAndWeight[i].getCentimeter()<height)
                hawp=shaw.FemaleHeightAndWeight[i-1];
        }
        
        if(weight>hawp.getUpperLimitWeight() && weight<hawp.getObese())
        {
          switch (this.profile) {
            case "Pregnant":                                                    this.calorie=160;
                hrs[8]=1.0;
                break;
            case "Lactation(0 to 6 months)":                                    this.calorie=160;
                hrs[8]=1.0;
                break;
            case "Lactation(6 to 12 months)":                                   this.calorie=160;
                hrs[8]=1.0;
                break;
            case "Jaundice":       
                
                break;
            case "Diabetic":                                                    this.calorie=662 ;
                hrs[0]=1;
                hrs[8]=2;
                hrs[16]=1;
                break;
            case "Under Diet":                                                  this.calorie=502 ;
                hrs[0]=1;
                hrs[8]=1;
                hrs[16]=1;
                break;
            case "Sedentary Diet":                                              this.calorie=265 ;
                hrs[0]=0.5;
                hrs[8]=1.0;   
                break;
            case "Moderate Work":                                               this.calorie=185 ;
                hrs[0]=0.5;
                hrs[8]=0.5;     
                break;
            case "Heavy Work":                                                  this.calorie=185 ;
                hrs[0]=0.5;
                hrs[8]=0.5;
                break;
            case "(28-30 years)":                                               this.calorie=420 ;
                hrs[0]=2.0;
                break;  
            case "(25-27 years)":                                               this.calorie=582 ;
                hrs[0]=1.0;
                hrs[13]=1.0;
                break;  
            case "(22-24 years)":                                               this.calorie=744 ;
                hrs[13]=2.0;
                break;    
            case "(19-21 years)":                                               this.calorie=732 ;
                hrs[3]=1.0;
                hrs[13]=1.0;
                break;    
            case "(16-18 years)":                                               this.calorie=532 ;
                hrs[8]=1;
                hrs[13]=1;
                break;            
            case "(13-15 years)":                                               this.calorie=548 ;
                hrs[7]=0.5;
                hrs[13]=1;
                break;
            case "(10-12 years)":                                               this.calorie=441 ;
                hrs[3]=0.5;
                hrs[6]=0.5;
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
            default:                                                            this.calorie=370 ;
                hrs[0]=1.0;
                hrs[8]=1.0;
                break;
                
        }
        }
        else if(weight>hawp.getObese())
        {
            switch (this.profile) {
            case "Pregnant":                                                    this.calorie=160;
                hrs[8]=1.0;
                break;
            case "Lactation(0 to 6 months)":                                    this.calorie=160;
                hrs[8]=1.0;
                break;
            case "Lactation(6 to 12 months)":                                   this.calorie=160;
                hrs[8]=1.0;
                break;
            case "Jaundice":       
                
                break;
            case "Diabetic":                                                    this.calorie=730 ;
                hrs[0]=1;
                hrs[3]=1;
                hrs[8]=1;
                break;
            case "Under Diet":                                                  this.calorie=702 ;
                hrs[0]=1;
                hrs[3]=1;
                hrs[16]=1;
                break;
            case "Sedentary Work":                                              this.calorie=688 ;
                hrs[0]=1;
                hrs[16]=1;
                hrs[18]=1;
                break;
            case "Moderate Work":                                               this.calorie=550 ;
                hrs[0]=0.5;
                hrs[3]=1;
                hrs[8]=0.5;          
                break;
            case "Heavy Work":                                                  this.calorie=570 ;
                hrs[3]=1;
                hrs[7]=1;
                break;
            case "(31-33 years)":                                               this.calorie=740 ;
                hrs[0]=2.0;
                hrs[8]=2.0;
                break;
            case "(28-30 years)":                                               this.calorie=682 ;
                hrs[6]=1.0;
                hrs[8]=1.0;
                break;
            case "(25-27 years)":                                               this.calorie=765 ;
                hrs[5]=0.5;
                hrs[6]=0.5;
                hrs[7]=0.5;
                break;
            case "(22-24 years)":                                               this.calorie=910 ;
                hrs[4]=1.0;
                hrs[8]=1.0;
                break;
            case "(19-21 years)":                                               this.calorie=1015 ;
                hrs[3]=1.0;
                hrs[5]=1.0;
                break;
            case "(16-18 years)":                                               this.calorie=882 ;
                hrs[3]=1;
                hrs[6]=1;
                break;            
            case "(13-15 years)":                                               this.calorie=753 ;
                hrs[3]=1;
                hrs[7]=1;
                break;
            case "(10-12 years)":                                               this.calorie=627 ;
                hrs[3]=0.5;
                hrs[6]=0.5;
                hrs[16]=1;        
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
            default:                                                            this.calorie=580 ;
                hrs[0]=2.0;
                hrs[8]=1.0;
                break;
        }
        
        }
        else 
        {
            hrs[8]=1.0;
            this.calorie=160;
        }
        
        ep=new ExerciseProfile(hrs);
        res=ep.getExcerciseProfile();
        
        return res;
    }
    
}