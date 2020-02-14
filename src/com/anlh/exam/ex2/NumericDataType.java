package com.anlh.exam.ex2;

public class NumericDataType implements Operations<Double>{

    @Override
    public void addition(Double a, Double b) {
        System.out.println("The addition of two numbers is: " + (a+b));
    }

    @Override
    public void subtraction(Double a, Double b) {
        System.out.println("The subtraction of two numbers is: "  + (a-b));
    }

    @Override
    public void multiplication(Double a, Double b) {
        System.out.println("The multiplication of two numbers is: " + (a*b));
    }

    @Override
    public void division(Double a, Double b) {
        System.out.println("The division of two numbers is: " + (a/b));
    }

    public void performAll(Double a, Double b){
        addition(a,b);
        subtraction(a,b);
        multiplication(a,b);
        division(a,b);
    }

}
