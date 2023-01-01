package com.softarch.phase2;

public interface ServiceController
{ // this interface manages applying different actions to the services provided by the system
  public String Execute(int WoP ,String Amount ,int sp ,String CreditCardNo);
  public String PrintServiceProvider();
  public String ChooseServiceProvider(int sp);
  public String AddDiscount(String k);

}

