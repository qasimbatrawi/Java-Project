/*
Qasim Batrawi
1220204
section 10
 */

package main;
		
import java.util.* ;
		
public class Driver {
		
	public static void main(String[] args) {
		
		ArrayList<CustomerPayment> customerPayment = new ArrayList<>() ;
		
		CustomerPayment check1 = new Check("Ahmed" , 111 , 100 , 222 , 50 , Check.CASHIER) ;
		if (!((Check)check1).isAuthorized()) {
			check1 = null ; // java will automatically collect the space (garbage collector)
		}
		else {
			customerPayment.add(check1) ;
		}
		
		
		CustomerPayment cash1 = new Cash("Ali" , 12345 , 320 , 5.0) ;
		customerPayment.add(cash1) ;
		
		
		CustomerPayment creditCard1 = new CreditCard("Basel" , 9999 , 100 , 15 , new Date(122 , 4 , 3)) ;
		if (!((CreditCard)creditCard1).isAuthorized()) {
			creditCard1 = null ;
		}
		else {
			customerPayment.add(creditCard1) ;
		}
			
		
		CustomerPayment check2 = new Check("Mohammad" , 6789 , 240 , 2132 , 400 , Check.CERTIFIED) ;
		if (!((Check)check2).isAuthorized()) {
			check2 = null ;
		}
		else {
			customerPayment.add(check2) ;
		}
		
		
		CustomerPayment cash2 = new Cash("Qasim" , 6789 , 240 , 10.0) ;
		customerPayment.add(cash2) ;
		
		
		CustomerPayment check3 = new Check("Fares" , 2468 , 190 , 1357 , 150 , Check.PERSONAL) ;
		if (!((Check)check3).isAuthorized()) {
			check3 = null ;
		}
		else {
			customerPayment.add(check3) ;
		}
		
		
		CustomerPayment creditCard2 = new CreditCard("Sameer" , 5555 , 45 , 20 , new Date(125 , 12 , 12)) ;
		if (!((CreditCard)creditCard2).isAuthorized()) {
			creditCard2 = null ;
		}
		else {
			customerPayment.add(creditCard2) ;
		}
		
		
		Collections.sort(customerPayment) ; // calling compraeTo method in CustomerPayment class
		
		for (int i = 0 ; i < customerPayment.size() ; i++) {
			customerPayment.get(i).printPaymentInfo() ;
		}

		
	}

}
