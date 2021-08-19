package com.homewrokmvvm;

public class CalculatorModel
{
    int numberFour;
    int numberTwo;

    public CalculatorModel(int numberFour, int numberTwo)
    {
        this.numberFour = numberFour;
        this.numberTwo = numberTwo;
    }

    public int getNumberFour() {
        return numberFour;
    }

    public int getNumberTwo() {
        return numberTwo;
    }
}
