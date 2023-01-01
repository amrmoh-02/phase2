package com.softarch.phase2;

public class CashOnDelivery implements IPaying {
    //this is the option for cash on delivery way of payment
    @Override
    public boolean payment(Users l, String CardNo, String AmountToPay)
    {
        return true;
    }
}
