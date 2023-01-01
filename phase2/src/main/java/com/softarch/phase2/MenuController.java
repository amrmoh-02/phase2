package com.softarch.phase2;
import org.springframework.web.bind.annotation.*;
@RestController
public class MenuController
{
    @GetMapping(value = "/menu/userMenu")
    public String getUserMenu()
    {
        return (
                """
                        -Search for Service: (http://localhost:8080/users/search/*search-Key*)
                        -Pay Service (http://localhost:8080/menu/PayMenu)
                        -Request Refund (http://localhost:8080/users/refundRequest)
                        -Show Illegible Refunds (http://localhost:8080/users/showRefunds)
                        -Add to Wallet (http://localhost:8080/users/addCash)
                        -Show Wallet Balance(http://localhost:8080/users/showWallet)
                        -Check discounts (http://localhost:8080/users/showDiscount/*search-Key*)"""
        );
    }
    @GetMapping(value = "/menu/PayMenu")
    public String getPayMenu()
    {
        return (
                """
                        -Mobile Recharge Services (http://localhost:8080/users/pay/mobile)
                        -Internet Payment Services (http://localhost:8080/users/pay/internet)
                        -Landline Services (http://localhost:8080/users/pay/landline)
                        -Donations (http://localhost:8080/users/pay/donation)"""
        );
    }
    @GetMapping(value = "/menu/AdminMenu")
    public String getAdmintMenu()
    {
        return (
                """
                        - Set Mobile Services Discount (http://localhost:8080/admin/discount/mobile)
                        - Set Internet Services Discount (http://localhost:8080/admin/discount/Internet)
                        - Set Landline Discount Discount (http://localhost:8080/admin/discount/Landline)
                        - Set Donation Discount (http://localhost:8080/admin/discount/Donation)
                        - Set Overall Discount (http://localhost:8080/admin/discount/overall)
                        - show Refund Requests (http://localhost:8080/admin/printRequest)
                        - send Refund Response (http://localhost:8080/admin/requestReply)"""
        );
    }
}