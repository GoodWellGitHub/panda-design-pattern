package com.org.hj.data.producerconsumer;

public class PCData {
    private final int intData;

    public PCData(int d) {
        this.intData = d;
    }

    public PCData(String data) {
        this.intData = Integer.valueOf(data);
    }

    public int getData() {
        return intData;
    }

    @Override
    public String toString() {
        return "data: " + intData;
    }
}
