package com.company;

public class NumberBox<T extends Number> {
    private T[] numbers;

    public NumberBox(T[] numbers) {
        this.numbers = numbers;
    }

    public double average() {
        double d = 0.0;
        for(T number: numbers) {
            d+= number.doubleValue();
        }
        return d/this.numbers.length;
    }

    public T[] getNumbers() {
        return numbers;
    }

    public void setNumbers(T[] numbers) {
        this.numbers = numbers;
    }
}
