package com.softarch.phase2;

public class CheckDiscounts
{  // this part is responsible for viewing discounts for different services for the user
    public String ViewDiscounts(int choice)
    {
        DiscountAdder oi = new SpecificDiscount();
        DiscountAdder oll = new OverAllDiscount();
        if (choice == 5)
        {
            return oll.getDiscount(choice);
        }
        return oi.getDiscount(choice);

    }

}
