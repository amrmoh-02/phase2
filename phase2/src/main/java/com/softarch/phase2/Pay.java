package com.softarch.phase2;

public class Pay {
    ServiceController q;
    public String payMobile(int choice,String amount ,int sp,String ccn)
    {
        q = new MobileServices();
        return q.Execute(choice,amount,sp,ccn);
    }
    public String PayInternet(int choice,String amount ,int sp,String ccn)
    {
        q = new InternetServices();
        return q.Execute(choice,amount,sp,ccn);
    }
    public String payDonation(int choice,String amount ,int sp,String ccn)
    {
        q = new DonationServices();
        return q.Execute(choice,amount,sp,ccn);
    }
    public String payLandline(int choice,String amount ,int sp,String ccn)
    {
        q = new LandlineServices();
        return q.Execute(choice,amount,sp,ccn);
    }
}
