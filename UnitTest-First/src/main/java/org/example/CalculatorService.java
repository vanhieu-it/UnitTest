package org.example;

public class CalculatorService extends Calculator{
    private Calculator calculator;

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }
    public int performAddition(int a, int b){
        return calculator.add(a,b);
    }
}
