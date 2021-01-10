package com.company.entites;

public class CheckingAccount extends Account{
    private double overdraftLimit;

    public CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double sum){
        try{
            if(sum > overdraftLimit){
                throw new Exception("Cannot withdraw more than the overdraft!");
            }
            System.out.println("Withdrawn " + sum);
            setBalance(getBalance() - sum);
            System.out.println("Current balance " + super.getBalance());
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return "CheckingAccount{ " + super.toString() +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }
}
