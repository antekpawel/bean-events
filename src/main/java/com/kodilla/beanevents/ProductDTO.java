package com.kodilla.beanevents;

/**
 * User: Z6PWA
 * Date: 15.10.2023
 */
public class ProductDTO
{
  private String productName;
  private String otherData;

  public ProductDTO(String productName, String otherData)
  {
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
