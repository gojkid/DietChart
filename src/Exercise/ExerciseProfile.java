/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

/**
 *
 * @author Souvik
 */
public class ExerciseProfile {

    public String res="";
    
    public ExerciseProfile(double hours[]) {
        activity activities[]=new activity[19];
        activities[0]=new activity("Cleaning/moping",210,hours[0]);
        activities[1]=new activity("Gardening",300,hours[1]);
        activities[2]=new activity("Watching TV",86,hours[2]);
        activities[3]=new activity("Cycling(15 km/hr)",360,hours[3]);
        activities[4]=new activity("Running(12 km/hr)",750,hours[4]);
        activities[5]=new activity("Running(10 km/hr)",655,hours[5]);
        activities[6]=new activity("Running(8 km/hr)",522,hours[6]);
        activities[7]=new activity("Running(6 km/hr)",353,hours[7]);
        activities[8]=new activity("Walking(4 km/hr)",160,hours[8]);
        activities[9]=new activity("Shuttle",348,hours[9]);
        activities[10]=new activity("Table tennis",245,hours[10]);
        activities[11]=new activity("Tennis",392,hours[11]);
        activities[12]=new activity("Volley ball",180,hours[12]);
        activities[13]=new activity("Dancing",372,hours[13]);
        activities[14]=new activity("Fishing",222,hours[14]);
        activities[15]=new activity("Sleeping",57,hours[15]);
        activities[16]=new activity("Standing",132,hours[16]);
        activities[17]=new activity("Sitting",86,hours[17]);
        activities[18]=new activity("Typing",108,hours[18]);       
        res="\n_______________________________________________\nEXERCISE PROFILE\n_______________________________________________\n";
        int j=1;
        for(int i=0;i<activities.length;i++)
        {
            if(activities[i].getHours()>0)
            res=res+"\n"+j++ +"."+activities[i].getActivity()+"\n";
        }
    }

    
    
    public String getExcerciseProfile()
    {
        return this.res;
    }

}
