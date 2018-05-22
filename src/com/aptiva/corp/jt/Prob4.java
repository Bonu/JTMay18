package com.aptiva.corp.jt;

public class Prob4 {

    static int count=0;

    Prob4(){
        ++count;
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args){

        int x = 10;
        Prob4 instance = null;
        for(int i = 0; i < 10; ++i){
            instance = new Prob4();
        }
        System.out.println("Number of instances so far 							="+instance.getCount());

        Account account = new Account(1, 200);
        Prob4 p4 = new Prob4();
        p4.method1(account, x);
        System.out.println(account.amount);
        System.out.println("x->"+x);
    }

    public void method1(Account account, int x) {
        account.setAmount(100);
        x = 1000;
    }
}


class Account {
    int id;
    int amount;

    public Account(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}