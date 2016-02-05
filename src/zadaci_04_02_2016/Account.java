package zadaci_04_02_2016;

/**
 * Naziv klase: Account
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Date;

public class Account {
	
	/*
	 *  Design a class named Account that contains:
	 *  A private int data field named id for the account (default 0)
	 *  A private double data field named balance for the account (default 0).
	 *  A private double data field named annualInterestRate that stores the current interest rate (default 0). 
	 *  Assume all accounts have the same interest rate.
	 *  A private Date data field named dateCreated that stores the date when the account was created.
	 *  A no-arg constructor that creates a default account.
	 *  A constructor that creates an account with the specified id and initial balance.
	 *  The accessor and mutator methods for id,balance, and annualInterestRate.
	 *  The accessor method for dateCreated.
	 *  A method named getMonthlyInterestRate() that returns the monthly interest rate.
	 *  A method named getMonthlyInterest() that returns the monthly interest.
	 *  A method named withdraw that withdraws a specified amount from the  account.
	 *  A method named deposit that deposits a specified amount to the account. 
	 */

	//Osobine
	private int id = 0;//Redni broj
	private double balance = 0;//Stanje
	private double annualInterestRate = 0;//Godisnja kamatna stopa
	private Date dateCreated;//Datum kreiranja
	
	//Konstruktori
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;	
		this.annualInterestRate = 4.5;
		this.dateCreated = new Date();
	}
	
	public Account(){	
	}

	//Metode
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		annualInterestRate = annualInterestRate / 100;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate / 1200;
	}
	
	public double getMonthlyInterest(){
		return balance * getMonthlyInterestRate();
	}
	
	public void withdraw(double withdraw){
		balance -= withdraw;
	}

	public void deposit(double deposit){
		balance += deposit;
	}
	
	public void print(){
		System.out.println("Balance: " + balance);
		System.out.println("Monthly interest: " + getMonthlyInterest());
		System.out.println("Created: " + getDateCreated());
	}
}
