package com.kodilla.beanevents;

import org.springframework.context.ApplicationEvent;

/**
 * User: Z6PWA
 * Date: 15.10.2023
 */
public class CalculationEvent extends ApplicationEvent
{
  private double a;
  private double b;
  private String operation;
  public CalculationEvent(Object source, double a, double b, String operations)
  {
    super(source);
    this.a = a;
    this.b = b;
    this.operation = operations;
  }

  public double getA()
  {
    return a;
  }

  public double getB()
  {
    return b;
  }

  public String getOperation()
  {
    return operation;
  }
}
