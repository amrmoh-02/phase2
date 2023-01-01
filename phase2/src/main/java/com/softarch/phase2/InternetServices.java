package com.softarch.phase2;
public class InternetServices implements ServiceController
{
    @Override // this function will display the internet service form for the user
    public String Execute(int WoP ,String Amount ,int sp ,String CreditCardNo)
    {
        Startup k = new Startup();
        IPaying P;
        String NoS;
        NoS = ChooseServiceProvider(sp);
        switch(WoP)
        {
            case 1:
            {
                P = new WalletPayment();
                Amount = AddDiscount(Amount);
                if(P.payment(k.currentUser,null,Amount))
                {
                    k.currentUser.l.logger(NoS +" " + "Wallet Payment" + " Amount: "+ Amount + " " + "L.E",Float.parseFloat(Amount));
                    return "Transaction Completed Successfully";
                }
                else
                {
                    return "insufficient funds";

                }
            }
            case 2:
            {
                P = new CreditCard();
                Amount = AddDiscount(Amount);
                P.payment(k.currentUser,CreditCardNo,Amount);
                k.currentUser.l.logger(NoS +" " + "Credit Card: "+k.currentUser.CardNumber + " Amount: "+ Amount + " " + "L.E",Float.parseFloat(Amount));
                return "Transaction Completed Successfully";
            }
            case 3:
            {
                P = new CashOnDelivery();
                Amount = AddDiscount(Amount);
                P.payment(k.currentUser,null,Amount);
                k.currentUser.l.logger(NoS +" " + "Cash On Delivery" + " Amount: "+ Amount + " " + "L.E",Float.parseFloat(Amount));
                return "Transaction Completed Successfully";
            }

        }
        return "Transaction Failed";
    }

    @Override  // this part will display the service providers for the internet recharge service
    public String ChooseServiceProvider(int NosChoice)
    {
        if (NosChoice == 1)
        {
            return "Vodafone";
        }
        else if (NosChoice == 2)
        {
            return "Etisalat";
        }
        else if (NosChoice == 3)
        {
            return "Orange";
        }
        else if (NosChoice == 4)
        {
            return "WE";
        }
        return null;
    }

    public String PrintServiceProvider() // prints service providers of internet service
    {
        return
                (
                        "Internet recharge services: \n"+
                                "1-Vodafone \n" +
                                "2-Etisalat\n" +
                                "3-Orange\n" +
                                "4-We"
                );
    }
    @Override
    public String AddDiscount(String amnt) // adds discount to the internet recharge fees
    {
        DiscountAdder d = new OverAllDiscount();
        amnt =  d.Discounting(0,amnt);
        DiscountAdder dd = new SpecificDiscount();
        amnt = dd.Discounting(2,amnt);
        return amnt;
    }

}
