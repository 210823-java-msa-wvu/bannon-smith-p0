package dev.smith.models;

public class Request {

    private boolean requestApproved;
    private float balance;

    private Account account;

    public Request() {
    }

    public Request(boolean requestApproved, float balance) {
        this.requestApproved = requestApproved;
        this.balance = balance;
    }

    public Request(boolean requestApproved, float balance, Account account) {
        this.requestApproved = requestApproved;
        this.balance = balance;
        this.account = account;
    }






    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


    @Override
    public String toString() {
        return "Request{" +
                "requestApproved=" + requestApproved +
                ", balance=" + balance +
                ", account=" + account +
                '}';
    }
}
