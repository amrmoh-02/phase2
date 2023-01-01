package com.softarch.phase2;

public interface IPaying
{ // this interface manages the different ways of payment
    public boolean payment(Users l, String CardNo, String AmountToPay);
}
