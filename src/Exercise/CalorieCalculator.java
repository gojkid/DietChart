/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

/**
 *
 * @author Souvik
 */
public class CalorieCalculator {

    private String sex;
    private int age;
    private int height;
    private int weight;

    public CalorieCalculator(String sex, int age, int height, int weight) {
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
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

    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Get the value of sex
     *
     * @return the value of sex
     */
    public String getSex() {
        return sex;
    }

    public int getCalorie()
    {
        int res=0;
        switch (this.sex) {
            case "Male":
                res=(int) (66+(13.7*this.weight)+(5*this.height)-(6.8*this.age));
                break;
            case "Female":
                res=(int) (665+(9.6*this.weight)+(1.8*this.height)-(4.7*this.age));
                break;
        }
        return res;
    }
}
