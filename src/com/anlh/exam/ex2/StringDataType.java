package com.anlh.exam.ex2;

public class StringDataType implements Operations<String> {

    @Override
    public void addition(String a, String b) {
        System.out.println("The addition of 2 strings is: " + a.concat(b));
    }

    @Override
    public void subtraction(String a, String b) {
        System.out.println("This operation can't be perform on strings");
    }

    @Override
    public void multiplication(String a, String b) {
        System.out.println("This operation can't be perform on strings");
    }

    @Override
    public void division(String a, String b) {
        System.out.println("This operation can't be perform on strings");
    }

    public void performAll(String a, String b){
        addition(a,b);
        subtraction(a,b);
        multiplication(a,b);
        division(a,b);
    }

}
