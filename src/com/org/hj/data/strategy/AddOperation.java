package com.org.hj.data.strategy;

public class AddOperation implements Operation {
    @Override
    public int operation(int var1, int var2) {
        return var1+var2;
    }
}
