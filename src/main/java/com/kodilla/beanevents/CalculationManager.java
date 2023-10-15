package com.kodilla.beanevents;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * User: Z6PWA
 * Date: 15.10.2023
 */
@Component
public class CalculationManager implements ApplicationListener<CalculationEvent>
{
  @Override
  public void onApplicationEvent(CalculationEvent event)
  {
    double a = event.getA();
    double b = event.getB();
    String operation = event.getOperation();

    double result = switch (operation)
    {
      case "+" -> a + b;
      case "-" -> a - b;
      case "*" -> a * b;
      case ":", "/" -> a / b;
      default -> throw new IllegalArgumentException("Unknown operation: " + operation);
    };
    System.out.println(a + operation + b + "=" + result);
  }
}
