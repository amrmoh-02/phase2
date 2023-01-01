package com.softarch.phase2;

public class Search
{
    public String searching (String sname) // this part responsible for  searching for services by name
    {
        ServiceController m;

        if(sname.equals("mobileservices")) // this part displays mobile services and executes it
        {
                m = new MobileServices();
                return m.PrintServiceProvider();

        }
        else if(sname.equals("internetservices")) // this part displays internet services and executes it
        {
                m = new InternetServices();
                return m.PrintServiceProvider();

        }
        else if (sname.equals("landlineservices")) // this part displays landline services and executes it
        {
                m = new LandlineServices();
                return m.PrintServiceProvider();

        }
        else if (sname.equals("donations")) // this part displays donations services and executes it 
        {
                m = new DonationServices();
                return m.PrintServiceProvider();

        }
        return "service not found in database";
    }
}

