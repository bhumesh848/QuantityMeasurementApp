package com.bridgelabz.constant;

public interface IMeasurable {
    public double getConversionFactor();
    public double convertToBaseUnit(double value);
    public double convertFromBaseUnit(double baseValue);
}