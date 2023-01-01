package com.softarch.phase2;

import org.springframework.web.bind.annotation.*;

@RestController
public class OperationController {

    Search s = new Search();
    CheckDiscounts c = new CheckDiscounts();
    Refund r = new Refund();
    WalletManagement w = new WalletManagement();
    Pay p = new Pay();

    @PostMapping(value = "/users/pay/mobile")
    public String payMobile(@RequestParam int choice,String amount ,int sp,String ccn)
    {
        return p.payMobile(choice,amount,sp,ccn);
    }
    @PostMapping(value = "/users/pay/internet")
    public String payInternet(@RequestParam int choice,String amount ,int sp,String ccn)
    {
        return p.PayInternet(choice,amount,sp,ccn);
    }
    @PostMapping(value = "/users/pay/donation")
    public String payDonation(@RequestParam int choice,String amount ,int sp,String ccn)
    {
        return p.payDonation(choice,amount,sp,ccn);
    }
    @PostMapping(value = "/users/pay/landline")
    public String payLandline(@RequestParam int choice,String amount ,int sp,String ccn)
    {
        return p.payLandline(choice,amount,sp,ccn);
    }
    @PostMapping(value = "/users/refundRequest")
    public String refundRequest(@RequestParam int choice)
    {
        return r.RefundRequest(choice);
    }
    @PostMapping(value = "/users/addCash")
    public String addCash(@RequestParam String cnum,int cash)
    {
        return w.addCash(cnum,cash);
    }




    @GetMapping(value = "/users/showDiscount/{choice}")
    public String ViewDiscounts(@PathVariable ("choice") int choice)
    {
        return c.ViewDiscounts(choice);
    }
    @GetMapping(value = "/users/showRefunds")
    public String showRefunds()
    {
        return r.ShowRefunds();
    }
    @GetMapping(value = "/users/search/{searching}")
    public String SearchFunction(@PathVariable ("searching") String searching)
    {
        return s.searching(searching);
    }
    @GetMapping(value = "/users/showWallet")
    public float walletPrint()
    {
        return w.walletPrint();
    }
}
