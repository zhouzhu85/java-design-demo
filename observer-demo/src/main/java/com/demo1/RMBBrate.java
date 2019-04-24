package com.demo1;

public class RMBBrate extends Rate{
    @Override
    public void change(int number) {
        for (Company company:companies){
            company.reponse(number);
        }
    }
}
