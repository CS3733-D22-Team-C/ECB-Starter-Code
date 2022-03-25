package edu.wpi.teamname.entity;

import javafx.beans.property.SimpleDoubleProperty;

public class Mortgage {
    
    private float amount;
    private float rate;
    private int years;
    private SimpleDoubleProperty monthlyPayment = new SimpleDoubleProperty();
    
    public Mortgage(float amount, float rate, int years) {
        this.amount = amount;
        this.rate = rate;
        this.years = years;
        this.monthlyPayment.setValue(0);
    }
    
    public Mortgage() {
        this.amount = -1;
        this.rate = -1;
        this.years = -1;
        this.monthlyPayment.setValue(0);
    }
    
    public double calculateMonthlyPayment() {
        this.monthlyPayment.setValue(
                this.amount * this.rate * this.years * 12); // this isnt actuallly a real formula lol
        return this.monthlyPayment.getValue();
    }
    
    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    public void setRate(float rate) {
        this.rate = rate;
    }
    
    public void setYears(int years) {
        this.years = years;
    }
    
    public float getAmount() {
        return this.amount;
    }
    
    public float getRate() {
        return this.rate;
    }
    
    public int getYears() {
        return this.years;
    }
    
    public SimpleDoubleProperty getMortgageProperty() {
        return monthlyPayment;
    }
}
