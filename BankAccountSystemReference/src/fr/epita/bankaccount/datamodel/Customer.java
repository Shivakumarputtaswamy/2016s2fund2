/**
 * 
 */
package fr.epita.bankaccount.datamodel;

/**
 * @author tbrou
 *
 */
public class Customer {
	
	private String name;
	private String address;
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param name
	 * @param address
	 */
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	
	/**
	 * Default Constructor
	 */
	public Customer() {
		
	}
	

}
