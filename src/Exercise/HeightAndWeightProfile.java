/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

/**
 *
 * @author Souvik
 */
public class HeightAndWeightProfile {

    private double centimeter;
    private double lowerLimitWeight;
    private double upperLimitWeight;
    private double obese;

    public HeightAndWeightProfile() {
        this.centimeter=0;
        this.lowerLimitWeight=0;
        this.obese=0;
        this.upperLimitWeight=0;
    }

    /**
     * Get the value of obese
     *
     * @return the value of obese
     */
    public double getObese() {
        return obese;
    }

    /**
     * Set the value of obese
     *
     * @param obese new value of obese
     */
    public void setObese(double obese) {
        this.obese = obese;
    }

    public HeightAndWeightProfile(double centimeter, double lowerLimitWeight, double upperLimitWeight, double obese) {
        this.centimeter = centimeter;
        this.lowerLimitWeight = lowerLimitWeight;
        this.upperLimitWeight = upperLimitWeight;
        this.obese = obese;
    }

    public HeightAndWeightProfile(double centimeter, double upperLimitWeight) {
        this.centimeter = centimeter;
        this.lowerLimitWeight = upperLimitWeight-(upperLimitWeight*0.21);
        this.upperLimitWeight = upperLimitWeight;
        this.obese = upperLimitWeight+(upperLimitWeight*0.08);
    }

    /**
     * Get the value of upperLimitWeight
     *
     * @return the value of upperLimitWeight
     */
    public double getUpperLimitWeight() {
        return upperLimitWeight;
    }

    /**
     * Set the value of upperLimitWeight
     *
     * @param upperLimitWeight new value of upperLimitWeight
     */
    public void setUpperLimitWeight(double upperLimitWeight) {
        this.upperLimitWeight = upperLimitWeight;
    }


    /**
     * Get the value of lowerLimitWeight
     *
     * @return the value of lowerLimitWeight
     */
    public double getLowerLimitWeight() {
        return lowerLimitWeight;
    }

    /**
     * Set the value of lowerLimitWeight
     *
     * @param lowerLimitWeight new value of lowerLimitWeight
     */
    public void setLowerLimitWeight(double lowerLimitWeight) {
        this.lowerLimitWeight = lowerLimitWeight;
    }


    /**
     * Get the value of centimeter
     *
     * @return the value of centimeter
     */
    public double getCentimeter() {
        return centimeter;
    }

    /**
     * Set the value of centimeter
     *
     * @param centimeter new value of centimeter
     */
    public void setCentimeter(double centimeter) {
        this.centimeter = centimeter;
    }

}
