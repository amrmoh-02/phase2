package com.softarch.phase2;

public class OverAllDiscount implements DiscountAdder
{  // this part manages the overall discount in the different services
    static public float overall;

    public String SetDiscount(float overall,float k,float l, float m, int so)
    {
        this.overall = overall;
        return "Discount Added Successfully";
    }

    @Override
    public String Discounting(int choice, String Amount) //responsible for calculating discount
    {
        float k = Float.parseFloat(Amount);
        k = k * (1-overall/100);
        return Float.toString(k);

    }
    @Override
    public String getDiscount(int choice)
    {
        return Float.toString(overall);
    }

}
