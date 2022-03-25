package edu.wpi.teamname.entity;

import javafx.beans.property.SimpleDoubleProperty;

public class Mortgage {
  private double amount;
  private double rate;
  private int years;
  private SimpleDoubleProperty payment = new SimpleDoubleProperty();

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public void setYears(int years) {
    this.years = years;
  }

  public void setPayment(double payment) {
    this.payment.set(payment);
  }

  public double getAmount() {
    return amount;
  }

  public double getRate() {
    return rate;
  }

  public int getYears() {
    return years;
  }

  public SimpleDoubleProperty getPayment() {
    return payment;
  }

  public void calculateMonthlyPayment() {
    payment.set(this.amount * this.rate * this.years);
  }
}
