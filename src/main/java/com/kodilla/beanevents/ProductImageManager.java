package com.kodilla.beanevents;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * User: Z6PWA
 * Date: 15.10.2023
 */
@Component
public class ProductImageManager implements ApplicationListener<ProductRegisteredEvent>
{
  @Override
  public void onApplicationEvent(ProductRegisteredEvent event)
  {
    System.out.println("Processing image of " + event.getProductName());
    System.out.println("The graphic is: " + event.getOtherData());
  }
}
