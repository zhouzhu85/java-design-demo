package com.mediator.demo1;

import java.util.ArrayList;
import java.util.List;

public class EstateMedium implements Medium{
    private List<Customer> members=new ArrayList<>();
    @Override
    public void register(Customer customer) {
        if (!members.contains(customer)){
            members.add(customer);
            customer.setMedium(this);
        }
    }

    @Override
    public void relay(String from, String ad) {
        for (Customer ob:members){
            String name=ob.getName();
            if (!name.equals(from)){
                ob.receive(from,ad);
            }
        }
    }
}
