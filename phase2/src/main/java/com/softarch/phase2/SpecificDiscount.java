package com.softarch.phase2;

public class SpecificDiscount implements DiscountAdder
{  // this part initiates specific discounts for all services
    static public float MSDiscount=0,InDiscount=0,LLDiscount=0, DoDisCount=0;

    @Override
    public String Discounting(int choice, String Amount) // this part is responsible for applying discounts to all services
    {

        if(choice == 1)  // this part applies discount to mobile service
        {
            if(MSDiscount == 100)
            {return "0";}
            else
            {return Float.toString(Float.parseFloat(Amount)*(1-MSDiscount/100));}
        }
        else if(choice == 2) // this part applies discount to internet service
        {
            if(InDiscount == 100)
            {return "0";}
            else
            {return Float.toString(Float.parseFloat(Amount)*(1-InDiscount/100));}

        }
        else if(choice == 3) // this part applies discount to landline service
        {
            if(LLDiscount == 100)
            {return "0";}
            else
            {return Float.toString(Float.parseFloat(Amount)*(1-LLDiscount/100));}

        }
        else if(choice == 4) // this part applies discount to donations
        {
            if(DoDisCount == 100)
            {return "0";}
            else
            {return Float.toString(Float.parseFloat(Amount)*(1-DoDisCount/100));}

        }
        return null;
    }

    @Override // this part displays discounts
    public String getDiscount(int choice) {
        if(choice == 1)
        {
            return MSDiscount + "%";
        }
        else if(choice == 2)
        {
            return InDiscount + "%";

        }
        else if(choice == 3)
        {
            return LLDiscount + "%";

        }
        else if(choice == 4)
        {
            return DoDisCount + "%";

        }
        return null;
    }



    @Override
    public String SetDiscount(float P,float k,float l, float m,int so)
    {
        if(so == 1){MSDiscount = P;}
        if(so == 2){InDiscount = k;}
        if(so == 3){LLDiscount = l;}
        if(so == 4){DoDisCount = m;}
        return "Discount Added Successfully";
    }

}
