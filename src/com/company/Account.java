package com.company;

public class Account {
    private int balans;
    private String status;

    public Account(int balans, String status) {
        this.balans = balans;
        this.status = status;
    }

    public int getBalans() {
        return balans;
    }

//    public void setBalans(int balans) {
//        this.balans = balans;
//    }

    public boolean decreaseBalans(int amount){
        boolean isNotNormal = amount < 0 && amount > balans;
        if (isNotNormal) return false;
        this.balans -= amount;
        return true;
    }

    public boolean increaseBalans(int amount){
        if (amount < 0) return false;
            this.balans += amount;
            return true;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
