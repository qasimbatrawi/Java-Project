/*
Qasim Batrawi
1220204
section 10
 */

package main;

import java.util.Date ;

public class CreditCard extends CustomerPayment implements Payable{
	
	private double chargingFee ;
	private Date expiryDate ;
	
	public CreditCard() {
		
	}
	
	public CreditCard(String customerName , int customerId , double amount , double chargingFee , Date expiryDate) {
		super(customerName , customerId , amount) ;
		this.chargingFee = chargingFee ;
		this.expiryDate = expiryDate ;
	}

	public double getChargingFee() {
		return chargingFee;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setChargingFee(double chargingFee) {
		this.chargingFee = chargingFee;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	@Override
	public boolean isAuthorized() {
		Date currentDate = new Date() ;
		if (this.expiryDate.compareTo(currentDate) >= 0) { // compareTo method will return a positive number if expiryDate > currentDate, and will return zero if they are equal, and will return negative number if expiryDate < currentDate 
			return true ;
		}
		return false ;
	}
	
	@Override 
	protected double calculatePayment() {
		return super.getAmount()+this.chargingFee ;
	}
	
	@Override
	public String toString(){
		return "[ChargingFee="+this.chargingFee+", expiryDate="+this.expiryDate+super.toString() ;
	}
	
}
