package edu.wpi.teamname.entities;

public class Mortgage {
  int amount;
  double rate;
  int years;

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
