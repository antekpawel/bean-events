package com.kodilla.beanevents;

/**
 * User: Z6PWA
 * Date: 15.10.2023
 */
public class CalculationDTO
{
  private double a;
  private double b;
  private String operation;

  public CalculationDTO(double a, double b, String operations)
  {
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
