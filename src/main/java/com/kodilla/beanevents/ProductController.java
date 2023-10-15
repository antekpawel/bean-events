package com.kodilla.beanevents;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.*;

/**
 * User: Z6PWA
 * Date: 15.10.2023
 */
@RestController
@RequestMapping("/v1/products")
public class ProductController implements ApplicationEventPublisherAware
{
  private ApplicationEventPublisher applicationEventPublisher;
  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher)
  {
    this.applicationEventPublisher = applicationEventPublisher;
  }

  @PostMapping(path = "createProduct")
  public void createProduct(@RequestBody ProductDTO productDTO)
  {
    System.out.println("Registered: " + productDTO.getProductName());
    applicationEventPublisher.publishEvent(
      new ProductRegisteredEvent(this, productDTO.getProductName(), productDTO.getOtherData()));
  }
}
