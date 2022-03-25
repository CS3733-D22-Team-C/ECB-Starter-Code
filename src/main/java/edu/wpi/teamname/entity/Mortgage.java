package edu.wpi.teamname.entity;

import javafx.beans.property.SimpleDoubleProperty;

public class Mortgage {
  private float amount;
  private float rate;
  private float years;

  private SimpleDoubleProperty value = new SimpleDoubleProperty();

  public float getAmount() {
    return amount;
  }

  public void setAmount(float amount) {
    this.amount = amount;
  }

  public float getRate() {
    return rate;
  }

  public void setRate(float rate) {
    this.rate = rate;
  }

  public float getYears() {
    return years;
  }

  public void setYears(float years) {
    this.years = years;
  }

  public double getValue() {
    return value.get();
  }

  public void setValue(double value) {
    this.value.set(value);
  }

  public SimpleDoubleProperty getValueProperty() {
    return this.value;
  }
}
