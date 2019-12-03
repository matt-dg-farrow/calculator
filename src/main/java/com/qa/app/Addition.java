package com.qa.app;

public class Addition implements Operations {

    private int number1;

    private int number2;

    /**
     * @param number1 the number1 to set
     */
    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    /**
     * @param number2 the number2 to set
     */
    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    /**
     * @return the number1
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * @return the number2
     */
    public int getNumber2() {
        return number2;
    }

    public int calculate(int number1, int getNumber2) {
        
        int z;

        z = number1 + number2;
        
        return z;


    }

    
}