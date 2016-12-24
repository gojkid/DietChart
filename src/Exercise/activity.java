/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

/**
 *
 * @author Souvik
 */
public class activity {
    

    private String activityName;
    private int calorieSpent;
    private double hours;

    public activity() {
        this.activityName = "";
        this.calorieSpent = 0;
        this.hours=0;
    }

    
    
    public activity(String activityName, int calorieSpent,double hours) {
        this.activityName = activityName;
        this.calorieSpent = calorieSpent;
        this.hours=hours;
    }
    
    

    /**
     * Get the value of calorieSpent
     *
     * @return the value of calorieSpent
     */
    public int getCalorieSpent() {
        return calorieSpent;
    }

    /**
     * Set the value of calorieSpent
     *
     * @param calorieSpent new value of calorieSpent
     */
    public void setCalorieSpent(int calorieSpent) {
        this.calorieSpent = calorieSpent;
    }


    /**
     * Get the value of activityName
     *
     * @return the value of activityName
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * Set the value of activityName
     *
     * @param activityName new value of activityName
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    public String getActivity()
    {
        return this.getActivityName()+" for "+this.getHours()+" hours";
    }
    

}
