package dev.smith.models;

public class Account {

    private  Integer id;
    private Float balance;

    private User user;

    public Account() {
    }

    public Account(Integer id, Float balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account(Integer id, Float balance, User user) {
        this.id = id;
        this.balance = balance;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", user=" + user +
                '}';
    }
}
