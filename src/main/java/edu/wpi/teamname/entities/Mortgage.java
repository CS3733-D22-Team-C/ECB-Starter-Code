package edu.wpi.teamname.entities;

// Mortgages have an amount, a rate, and the number of years the mortgage is for

import javafx.beans.property.SimpleDoubleProperty;

public class Mortgage {
  private double amount;
  private double rate;

  public SimpleDoubleProperty monthlyPayment = new SimpleDoubleProperty();

  public void calculateMonthlyPayment() {
    monthlyPayment.set(this.amount * this.rate * this.years);
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public int getYears() {
    return years;
  }

  public void setYears(int years) {
    this.years = years;
  }

  private int years;
}
