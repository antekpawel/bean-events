package com.kodilla.beanevents;

import org.springframework.context.ApplicationEvent;

/**
 * User: Z6PWA
 * Date: 15.10.2023
 */
public class ProductRegisteredEvent extends ApplicationEvent
{
  private String productName;
  private String otherData;
  public ProductRegisteredEvent(Object source, String productName, String otherData)
  {
    super(source);
    this.productName = productName;
    this.otherData = otherData;
  }

  public String getProductName()
  {
    return productName;
  }

  public String getOtherData()
  {
    return otherData;
  }
}
