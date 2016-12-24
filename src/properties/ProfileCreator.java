/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package properties;

import Exercise.CalorieCalculator;
import Exercise.HeightAndWeightProfile;
import Exercise.StandardHeightAndWeight;

/**
 *
 * @author Souvik
 */
public class ProfileCreator {
    public int age;
    public int weight;
    public int height;
    public String sex;
    public String pro;
    public String condition;
    public String season;
    public String diet;
    public String chronic;
    String Name;
    String profile;

    public ProfileCreator(String Name,int age, int weight, int height, String sex, String pro, String condition, String season,String diet,String chronic) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
        this.pro = pro;
        this.diet=diet;
        this.chronic=chronic;
       
            if(age>=1 && age<=3)
                this.profile="(1-3 years)";
            else if(age>=4 && age<=6)
                this.profile="(4-6 years)";
            else if(age>=7 && age<=9)
                this.profile="(7-9 years)";
            else if(age>=10 && age<=12)
                this.profile="(10-12 years)";
            else if(age>=13 && age<=15)
                this.profile="(13-15 years)";
            else if(age>=16 && age<=18)
                this.profile="(16-18 years)";
            else if(age>=19 && age<=21)
                this.profile="(19-21 years)";
            else if(age>=22 && age<=24)
                this.profile="(22-24 years)";
            else if(age>=25 && age<=27)
                this.profile="(25-27 years)";
            else if(age>=28 && age<=30)
                this.profile="(28-30 years)";
            else if(age>=31 && age<=33)
                this.profile="(31-33 years)";
            else if(age>=34 && age<=36)
                this.profile="(34-36 years)";
            else if(age>=37 && age<=39)
                this.profile="(37-39 years)";
            else if(age>39)
                this.profile=""+age;
       

            if(age<=18)
            {
                this.pro=profile;
            }
            
            
        
        this.condition = condition;
        this.season = season;
        this.Name=Name;
    }

   
    public String getProfile()
    {
        CalorieCalculator cc=new CalorieCalculator(sex,age,height,weight);
        Summer.MalefoodChart mfcs;
        Summer.FemalefoodChart ffcs;
        Summer.ChildFoodChart cfcs;
        Monsoon.MalefoodChart mfcm;
        Monsoon.FemalefoodChart ffcm;
        Monsoon.ChildFoodChart cfcm;
        Winter.MalefoodChart mfcw;
        Winter.FemalefoodChart fcfw;
        Winter.ChildFoodChart cfcw;
        Exercise.MaleExerciseChart mec;
        Exercise.FemaleExerciseChart fec;
        PEMChecker pc = null;
        HeightAndWeightProfile hawp = null;
        StandardHeightAndWeight shaw=new StandardHeightAndWeight();
        String res="Name :"+Name+"\n";
        res=res+"Age :"+age+"   Sex:"+sex+"\n";
        res=res+"Height :"+height+" cms   Weight:"+weight+" kg\n";
        if(age>18)
        {
        res=res+"\nResting Energy Expenditure: "+cc.getCalorie()+" KCal\n\n\n";
        res=res+"\nApproximate Energy Requirement: "+(height-100)*30+" KCal\n\n\n";
        }
        else if(age>=1 && age<=5)
        {
            if(sex.equals("Male"))
            {
                hawp=shaw.MaleHeightAndWeight[age-1];
            }
            else if(sex.equals("Male"))
            {
                hawp=shaw.MaleHeightAndWeight[age-1];
            }
            
             pc=new PEMChecker(height,weight,hawp  );
             if(pc.ckeck())
             {
                 res=res+"\nYou are suffering from Protien Energy Malnutrition.\n\tAnd your diet is as follows\n";
                 res=res+pc.getRecipe();
                 return res;
             }
        }
        res=res+"\n_______________________________________________\n";
        switch (season) {
            case "Summer":
                if(age>9)
                {
            switch (sex) {
                case "Male":   
                    mfcs =new Summer.MalefoodChart(pro,diet,chronic);
                    res=res+mfcs.getFoodChart(diet);
                    res=res+"APPROXIMATE WATER INTAKE\n_______________________________________________\n";
                    if(this.chronic.equals("Chronic Kidney Disease"))
                        res=res+"1. Upper Limit --> Volume of urine + 0.75 litres of water\n2. Lower Limit --> Volume of urine + 0.5 litres of water";
                    else
                        if(this.chronic.equals("Chronic Kidney Disease"))                         res=res+"1. Upper Limit --> Volume of urine + 0.75 litres of water\n2. Lower Limit --> Volume of urine + 0.5 litres of water";                     
                        else                         
                            res=res+"1. "+(weight*50)/1000+" litres of water";
                    res=res+"\n\n";
                    res=res+"\n\n\nTotal Calorie Intake: "+mfcs.getCalorie()+" KCal";
                    break;
                case "Female":
                    ffcs =new Summer.FemalefoodChart(pro,condition,diet,chronic);
                    res=res+ffcs.getFoodChart();
                    res=res+"APPROXIMATE WATER INTAKE\n_______________________________________________\n";
                    if(this.chronic.equals("Chronic Kidney Disease"))                         
                        res=res+"1. Upper Limit --> Volume of urine + 0.75 litres of water\n2. Lower Limit --> Volume of urine + 0.5 litres of water";                     
                    else                         
                        res=res+"1. "+(weight*50)/1000+" litres of water";
                    res=res+"\n\n";
                    res=res+"\n\n\nTotal Calorie Intake: "+ffcs.getCalorie()+" KCal";
                    break;
            }
                }
                else if(age<=9)
                {      
                        cfcs =new Summer.ChildFoodChart(pro);
                        res=res+cfcs.getFoodChart(diet);
                        res=res+"APPROXIMATE WATER INTAKE\n_______________________________________________\n";
                        if(this.chronic.equals("Chronic Kidney Disease"))                         
                            res=res+"1. Upper Limit --> Volume of urine + 0.75 litres of water\n2. Lower Limit --> Volume of urine + 0.5 litres of water";                     
                        else                         
                            res=res+"1. "+(weight*50)/1000+" litres of water";
                        res=res+"\n\n";
                        res=res+"\n\n\nTotal Calorie Intake: "+cfcs.getCalorie()+" KCal";
                }
                break;
            case "Monsoon":
                if(age>9)
                {
            switch (sex) {
                case "Male":
                    mfcm =new Monsoon.MalefoodChart(pro,diet,chronic);
                    res=res+mfcm.getFoodChart();
                    res=res+"APPROXIMATE WATER INTAKE\n_______________________________________________\n";
                    if(this.chronic.equals("Chronic Kidney Disease"))                         
                        res=res+"1. Upper Limit --> Volume of urine + 0.75 litres of water\n2. Lower Limit --> Volume of urine + 0.5 litres of water";                     
                    else                         
                        res=res+"1. "+(weight*50)/1000+" litres of water";
                    res=res+"\n\n";
                    res=res+"\n\n\nTotal Calorie Intake: "+mfcm.getCalorie()+" KCal";
                    break;
                case "Female":
                    ffcm =new Monsoon.FemalefoodChart(pro,condition,diet,chronic);
                    res=res+ffcm.getFoodChart();
                    res=res+"APPROXIMATE WATER INTAKE\n_______________________________________________\n";
                    if(this.chronic.equals("Chronic Kidney Disease"))                         
                        res=res+"1. Upper Limit --> Volume of urine + 0.75 litres of water\n2. Lower Limit --> Volume of urine + 0.5 litres of water";                     
                    else                         
                        res=res+"1. "+(weight*50)/1000+" litres of water";
                    res=res+"\n\n";
                    res=res+"\n\n\nTotal Calorie Intake: "+ffcm.getCalorie()+" KCal";
                    break;
            }
                }
                else if(age<=9)
                {
                        cfcm =new Monsoon.ChildFoodChart(pro,diet);
                        res=res+cfcm.getFoodChart();
                        res=res+"APPROXIMATE WATER INTAKE\n_______________________________________________\n";
                        if(this.chronic.equals("Chronic Kidney Disease"))                         
                            res=res+"1. Upper Limit --> Volume of urine + 0.75 litres of water\n2. Lower Limit --> Volume of urine + 0.5 litres of water";                     
                        else                         
                            res=res+"1. "+(weight*50)/1000+" litres of water";
                        res=res+"\n\n";
                        res=res+"\n\n\nTotal Calorie Intake: "+cfcm.getCalorie()+" KCal";
                }
                break;
            case "Winter":
                if(age>9)
                {
            switch (sex) {
                case "Male":
                    mfcw =new Winter.MalefoodChart(pro,diet,chronic);
                    res=res+mfcw.getFoodChart();
                    res=res+"APPROXIMATE WATER INTAKE\n_______________________________________________\n";
                    if(this.chronic.equals("Chronic Kidney Disease"))                         
                        res=res+"1. Upper Limit --> Volume of urine + 0.75 litres of water\n2. Lower Limit --> Volume of urine + 0.5 litres of water";                     
                    else                         
                        res=res+"1. "+(weight*50)/1000+" litres of water";
                    res=res+"\n\n";
                    res=res+"\n\n\nTotal Calorie Intake: "+mfcw.getCalorie()+" KCal";
                    break;
                case "Female":
                    fcfw =new Winter.FemalefoodChart(pro,condition,diet,chronic);
                    res=res+fcfw.getFoodChart();
                    res=res+"APPROXIMATE WATER INTAKE\n_______________________________________________\n";
                    if(this.chronic.equals("Chronic Kidney Disease"))                         
                        res=res+"1. Upper Limit --> Volume of urine + 0.75 litres of water\n2. Lower Limit --> Volume of urine + 0.5 litres of water";                     
                    else                         
                        res=res+"1. "+(weight*50)/1000+" litres of water";
                    res=res+"\n\n";
                    res=res+"\n\n\nTotal Calorie Intake: "+fcfw.getCalorie()+" KCal";
                    break;
            }
                }
                else if(age<=9)
                {
                        cfcw =new Winter.ChildFoodChart(pro,diet);
                        res=res+cfcw.getFoodChart();
                        res=res+"APPROXIMATE WATER INTAKE\n_______________________________________________\n";
                        if(this.chronic.equals("Chronic Kidney Disease"))                         res=res+"1. Upper Limit --> Volume of urine + 0.75 litres of water\n2. Lower Limit --> Volume of urine + 0.5 litres of water";                     else                         res=res+"1. "+(weight*50)/1000+" litres of water";
                        res=res+"\n\n";
                        res=res+"\n\n\nTotal Calorie Intake: "+cfcw.getCalorie()+" KCal";
                }
                break;
        }
        switch (sex) {
                case "Male":
                    mec=new Exercise.MaleExerciseChart(height,weight,profile);
                    res=res+mec.getExcerciseProfile(profile);
                    res=res+"\n\n\nTotal Calorie Spent: "+mec.getCalorie()+" KCal";
                    break;
                case "Female":
                    if(condition.equals("None")==false)
                        profile=condition;
                    fec=new Exercise.FemaleExerciseChart(height,weight,profile);
                    res=res+fec.getExcerciseProfile();
                    res=res+"\n\n\nTotal Calorie Spent: "+fec.getCalorie()+" KCal";
                    break;
            }
        return res;
    }
}
