/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package properties;

/**
 *
 * @author Souvik
 */
public class diet {

    private String food;

    public diet() {
        this.food = "";
        this.typeOfQuantity = "";
        this.quantity = 0;
    }

    /**
     * Get the value of food
     *
     * @return the value of food
     */
    public String getFood() {
        return food;
    }

    /**
     * Set the value of food
     *
     * @param food new value of food
     */
    public void setFood(String food) {
        this.food = food;
    }
    private String typeOfQuantity;

    /**
     * Get the value of typeOfQuantity
     *
     * @return the value of typeOfQuantity
     */
    public String getTypeOfQuantity() {
        return typeOfQuantity;
    }

    /**
     * Set the value of typeOfQuantity
     *
     * @param typeOfQuantity new value of typeOfQuantity
     */
    public void setTypeOfQuantity(String typeOfQuantity) {
        this.typeOfQuantity = typeOfQuantity;
    }
    private double quantity;

    /**
     * Get the value of quantity
     *
     * @return the value of quantity
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * Set the value of quantity
     *
     * @param quantity new value of quantity
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
    public String getDiet()
    {
        
        String res="";
        if(this.getQuantity()>0.0)
                res=this.getQuantity()+" "+this.getTypeOfQuantity()+" "+this.getFood()+"\n";
        return res;
    }

}
