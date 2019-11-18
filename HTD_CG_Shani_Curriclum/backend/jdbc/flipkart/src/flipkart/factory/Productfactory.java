package flipkart.factory;

import flipkart.dao.Productdao;
import flipkart.dao.Productimpl;

public class Productfactory {

	public Productfactory() {
		
	}
	
	public static Productdao getInstance() {
		try {
			Productdao dao= new Productimpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
