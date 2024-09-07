/*
Qasim Batrawi
1220204
section 10
 */

package main;

public abstract class CustomerPayment implements Comparable<CustomerPayment>{
	
	protected String customerName ;
	protected int customerId ;
	protected double amount ;
	
	protected CustomerPayment() {
		
	}
	
	protected CustomerPayment(String customerName , int customerId , double amount) {
		this.customerName = customerName ;
		this.customerId = customerId ;
		this.amount = amount ;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public double getAmount() {
		return amount;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	void printPaymentInfo() {
		if (this instanceof Cash) { // "this" refers to CustomerPayment class 
			System.out.print("Cash "+((Cash)this).toString()) ;
			System.out.println(" Payment = "+((Cash)this).calculatePayment()+"\n");
		}
		
		else if (this instanceof Check) {
			System.out.print("Check "+((Check)this).toString()) ;
			System.out.println(" Payment = "+((Check)this).calculatePayment()+"\n");
		}
		
		else { // The CustomerPayment will be instanceof CreditCard
			System.out.print("CreditCard "+((CreditCard)this).toString()) ;
			System.out.println(" Payment = "+((CreditCard)this).calculatePayment()+"\n");
		}
	}
	
	protected abstract double calculatePayment() ;
	
	@Override
	public int compareTo(CustomerPayment customerPayment) {
		if (customerPayment instanceof Cash) {
			return (int)(((Cash)customerPayment).calculatePayment() - this.calculatePayment()) ;
		}
		
		else if (customerPayment instanceof Check) {
			return (int)(((Check)customerPayment).calculatePayment() - this.calculatePayment()) ;
		}
		
		return (int)(((CreditCard)customerPayment).calculatePayment() - this.calculatePayment()) ;

	}
	
	@Override
	public String toString(){
		return ", customerName="+this.customerName+", customerId="+this.customerId+", amount="+this.amount+"]" ;
	}
	
}
