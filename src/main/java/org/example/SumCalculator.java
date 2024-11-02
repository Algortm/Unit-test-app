package org.example;

public class SumCalculator {
    public int sum(int number) {
        if(number!=0) {
            int result = 0;
            for(int i = 1; i<=number; i++) result += i;
            return result;
        } else throw new IllegalArgumentException("Number can`t be zero");
    }
}
