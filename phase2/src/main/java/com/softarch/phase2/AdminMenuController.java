package com.softarch.phase2;
import org.springframework.web.bind.annotation.*;
@RestController
public class AdminMenuController
{
    RefundReply r = new RefundReply();
    DiscountAdder sp = new SpecificDiscount();
    DiscountAdder ov = new OverAllDiscount();


    @PostMapping(value = "/admin/discount/mobile")
    public String MobileServiceSpeDis(@RequestParam int discountSpecific)
    {
        return sp.SetDiscount(discountSpecific,0,0,0,1);
    }
    @PostMapping(value = "/admin/discount/Internet")
    public String internetDiscount(@RequestParam int discountSpecific)
    {
        return sp.SetDiscount(0,discountSpecific,0,0,2);
    }
    @PostMapping(value = "/admin/discount/Landline")
    public String landlineDiscount(@RequestParam int discountSpecific)
    {
        return  sp.SetDiscount(0,0,discountSpecific,0,3);
    }
    @PostMapping(value = "/admin/discount/Donation")
    public String donationDiscount(@RequestParam int discountSpecific)
    {
        return sp.SetDiscount(0,0,0,discountSpecific,4);
    }
    @PostMapping(value = "/admin/discount/overall")
    public String overallDiscount(@RequestParam int overallDiscount)
    {
        return ov.SetDiscount(overallDiscount,0,0,0,0);
    }
    @PostMapping(value = "/admin/requestReply")
    public String requestReply(@RequestParam int choice, int index)
    {
        return r.RequestResponse(choice,index);
    }


    @GetMapping(value = "/admin/printRequest")
    public String getRefundRequests()
    {
        return r.RequestPrint();
    }



}