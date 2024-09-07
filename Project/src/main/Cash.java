/*
Qasim Batrawi
1220204
section 10
 */

package main;

public class Cash extends CustomerPayment {
	
	private double discountRate ;
	
	public Cash() {
		
	}
	
	public Cash(String customerName , int customerId , double amount , double discountRate) {
		super(customerName , customerId , amount) ;
		this.discountRate = discountRate ;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	@Override 
	protected double calculatePayment() {
		return (super.getAmount()-(super.getAmount()*(this.discountRate/100.0))) ;
	}
	
	@Override
	public String toString(){
		return "[discountRate="+this.discountRate+super.toString() ;
	}	
	
}
