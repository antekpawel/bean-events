package com.kodilla.beanevents;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.*;

/**
 * User: Z6PWA
 * Date: 15.10.2023
 */
@RestController
@RequestMapping("/calculator")
public class CalculatorController implements ApplicationEventPublisherAware
{
  private ApplicationEventPublisher applicationEventPublisher;

  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher)
  {
    this.applicationEventPublisher = applicationEventPublisher;
  }

  @PostMapping(path = "calculate")
  public void calculate(@RequestBody CalculationDTO calculationDTO)
  {
    CalculationEvent calculationEvent = new CalculationEvent(this, calculationDTO.getA(), calculationDTO.getB(), calculationDTO.getOperation());
    applicationEventPublisher.publishEvent(calculationEvent);
  }
}
