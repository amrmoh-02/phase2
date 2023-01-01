package com.softarch.phase2;

//this class manages the wallet payment in the Payment of services
public class WalletPayment implements IPaying
{
    @Override
    public boolean payment(Users l, String CardNo, String AmountToPay)
    {
        return l.wallet.deduct(Float.parseFloat(AmountToPay));
    }
}
