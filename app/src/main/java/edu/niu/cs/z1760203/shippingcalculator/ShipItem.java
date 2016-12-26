package edu.niu.cs.z1760203.shippingcalculator;

/**
 * Created by Z1760203 on 2/2/2016.
 */
public class ShipItem {


    //Constants

    static final Double BASE_AMOUNT = 3.00;
    static final Double ADDITIONAL_AMOUNT = 0.50;
    static final int BASE_WEIGHT = 16;
    static final double EXTRA_OUNCES = 4.0;

    //DATA MEMBERS

    private Integer weight;
    private Double baseCost,addedCost,totalCost;

    //constructor

    public ShipItem(){

        weight = 0;
        baseCost = BASE_AMOUNT;
        addedCost = 0.0;
        totalCost = 0.0;

    }//constructor ends here

    public void setWeight(int newWeight){

        weight = newWeight;
        calcCost();
    }

    //method to calculate the total shipping cost

    public void calcCost(){
        addedCost = 0.0;
        baseCost = BASE_AMOUNT;


        if(weight<=0)
            baseCost = 0.00;
        else if(weight>BASE_WEIGHT)
            addedCost = Math.ceil((double)(weight - BASE_WEIGHT) / EXTRA_OUNCES) * ADDITIONAL_AMOUNT;
        totalCost = baseCost + addedCost;

    }//calcCost ends

//defining the getter methods

    public Double getBaseCost(){

        return baseCost;
    }


    public Double getAddedCost(){

        return addedCost;
    }


    public Double getTotalCost(){

        return totalCost;
    }


}//shipite ends here
