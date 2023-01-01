package com.softarch.phase2;

import java.util.Scanner;
public class RefundReply
{  // this part responsible for accessing transactions in the users' logs
    static  String [] Request =  new String [100];
    static int [] index = new int[100];
    static public Users[] Requestee = new Users[100];
    static int refundCounter = 0;


    public void TakeRefunds(Users u, String l, int k) // this part manages refund requests
    {
        Request [refundCounter] = l;
        Requestee [refundCounter] = u;
        index[refundCounter] = k;
        refundCounter++;
    }

    public String RequestPrint()
    {
        String k=" ";
        if(refundCounter==0)
        {
            return "No requests";
        }
        for (int i = 0; i < refundCounter; i++) {
            k += i +"-"+ Requestee[i].Username + " " + Request[i] + "\n";
        }
        return k;

    }
    public String RequestResponse(int choice,int requestIndex) // this part is accessed by the admin to accept or deny the refund requests
    {
            if (choice == 1 && requestIndex < refundCounter)
            {
                Requestee[requestIndex].wallet.add(Requestee[requestIndex].l.amount[index[requestIndex]]);
                refundCounter = 0;
                return Requestee[requestIndex].Username  + " has been refunded " + Requestee[requestIndex].l.amount[index[requestIndex]]+" L.E";

            }
            else if (choice == 2)
            {
                return "Refund Denied";
            }


         return "invalid choice";
    }
}
