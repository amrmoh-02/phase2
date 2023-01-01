package com.softarch.phase2;

public class LandlineServices implements ServiceController
{
    float receipt =100; // this part executes the landline services options
    @Override
    public String Execute(int WoP ,String Amount ,int sp ,String CreditCardNo)
    {
        return ChooseServiceProvider(sp);
    }

    public String PrintServiceProvider() // this displays the options of paying the landline fees
    {
        return("Landline Services: \n" +
                "1-Monthly receipt \n" +
                "2-Quarterly receipt\n" +
                "3-Exit \n" +
                "Choice: ");
    }

    public String ChooseServiceProvider(int choice) // this menu manages the payment form for landline services
    {
        Startup k = new Startup();
        receipt = Float.parseFloat(AddDiscount(Float.toString(receipt)));
        if (choice == 1)
        {
            return"For User: "+k.currentUser.Username +" Your monthly payment = "+ receipt + " L.E";
        }
        else if (choice == 2)
        {
            return"For User: "+k.currentUser.Username +" Your quarterly payment = "+ receipt*3 + " L.E";
        }
        return null;
    }
    public String AddDiscount(String k) // this part adds discounts to the landline fees
    {
        DiscountAdder D = new OverAllDiscount();
        receipt = Float.parseFloat(D.Discounting(0,Float.toString(receipt)));
        DiscountAdder DD = new SpecificDiscount();
        receipt = Float.parseFloat(DD.Discounting(3,Float.toString(receipt)));
        return Float.toString(receipt);
    }
}
