package com.demo1;

import java.util.ArrayList;
import java.util.List;

public abstract class Rate {
    protected List<Company> companies=new ArrayList<>();
    public void add(Company company){
        companies.add(company);
    }
    public void remove(Company company){
        companies.remove(company);
    }
    public abstract void change(int number);
}
