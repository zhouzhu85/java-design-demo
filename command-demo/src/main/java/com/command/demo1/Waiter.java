package com.command.demo1;

public class Waiter {
    private Breakfast changFen,hunTun,heFen;

    public void setChangFen(Breakfast chengFen) {
        this.changFen = chengFen;
    }

    public void setHunTun(Breakfast hunTun) {
        this.hunTun = hunTun;
    }

    public void setHeFen(Breakfast heFen) {
        this.heFen = heFen;
    }
    public void chooseChangFen(){
        changFen.cooking();
    }
    public void chooseHunTun()
    {
        hunTun.cooking();
    }
    public void chooseHeFen()
    {
        heFen.cooking();
    }
}
