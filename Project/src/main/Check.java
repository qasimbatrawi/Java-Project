/*
Qasim Batrawi
1220204
section 10
 */

package main;

public class Check extends CustomerPayment implements Payable{
	
	private int accountNumber ;
	private double accountBalance ;
	private int type ;
		
	final static int CASHIER=1 , CERTIFIED=2 , PERSONAL=3 ;
	
	public Check() {
		
	}
	
	public Check(String customerName , int customerId , double amount , int accountNumber , double accountBalance , int type) {
		super(customerName , customerId , amount) ;
		this.accountNumber = accountNumber ;
		this.accountBalance = accountBalance ;
		this.type = type ;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public int getType() {
		return type;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public void deductAmountFromBalance() {
		 this.setAccountBalance(this.getAccountBalance()-super.getAmount()) ;
	}
	
	@Override
	public boolean isAuthorized() {
		if (this.type == CASHIER || this.calculatePayment() <= this.accountBalance) {
			if(this.type != CASHIER) {
				this.deductAmountFromBalance();
			}
			return true ;
		}
		return false ;
	}
	
	@Override 
	protected double calculatePayment() {
		return super.getAmount() ;
 	}
	
	@Override
	public String toString(){
		return "[accountNumber="+this.accountNumber+", accountBalance="+this.accountBalance+", type="+this.type+super.toString() ;
	}
	
	
}
