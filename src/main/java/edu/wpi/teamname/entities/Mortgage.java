package edu.wpi.teamname.entities;

import javafx.beans.property.SimpleDoubleProperty;

public class Mortgage {
  public int getAmount() {
    return amount;
  }

  public double getRate() {
    return rate;
  }

  public int getYears() {
    return years;
  }

  int amount;
  double rate;
  int years;

  public double getValue() {
    return value.get();
  }

  public SimpleDoubleProperty valueProperty() {
    return value;
  }

  public void setValue(double value) {
    this.value.set(value);
  }

  SimpleDoubleProperty value = new SimpleDoubleProperty();

  public Mortgage(int amount, double rate, int years) {
    this.amount = amount;
    this.rate = rate;
    this.years = years;
  }

  public Mortgage() {}

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public void setYears(int years) {
    this.years = years;
  }
}
