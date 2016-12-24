/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package properties;

import Exercise.HeightAndWeightProfile;

/**
 *
 * @author Souvik
 */
public class PEMChecker {

    private int height;
    private int weight;
    private HeightAndWeightProfile profile;
    /**
     * 
     */
    private String recipe ="\t\tRecipie\n1.\tDried whole milk   115gm\n2.\tSugar   66 gm\n3.\tVegetable Oil   53 gm\n4.\tWater   1 litre"
            + "\n\n\t\tAlternative Recipie\n1.\tDried Skimmed milk   90gm\n2.\tSugar   90 gm\n3.\tVegetable Oil   80 gm\n4.\tWater   1 litre"
            + "\n\n\nHave the above solution in 5 to 6 feeds a day"
            + "\nMultivitamin syrup, required for first 3 days.";

    /**
     * Get the value of recipe
     *
     * @return the value of recipe
     */
    public String getRecipe() {
        return recipe;
    }

    public PEMChecker(int height, int weight, HeightAndWeightProfile profile) {
        this.height = height;
        this.weight = weight;
        this.profile = profile;
    }

    /**
     * Get the value of profile
     *
     * @return the value of profile
     */
    public HeightAndWeightProfile getProfile() {
        return profile;
    }

    /**
     * Get the value of weight
     *
     * @return the value of weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Get the value of height
     *
     * @return the value of height
     */
    public int getHeight() {
        return height;
    }

    public boolean ckeck()
    {
        boolean res=false;
        if(this.weight<(this.profile.getLowerLimitWeight()*0.7) && (this.height<(this.profile.getCentimeter()*0.8)))
            res=true;
        else if(this.weight<(this.profile.getLowerLimitWeight()*0.7))
            res=true;
        return res;
    }
}
