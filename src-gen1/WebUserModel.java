package hnue.it.shoppingonline;

public class WebUserModel {
	 private String login;
	 private String password;
	 private UserState state;
	 private Customer customer;
	 private ShoppingCart shoppingcart;
	 public WebUser(){}
   	 public WebUser(String login, String password, UserState state, Customer customer, ShoppingCart shoppingcart)
	 {
	     this.login = login;

	     this.password = password;

	     this.state = state;

	     this.customer = customer;

	     this.shoppingcart = shoppingcart;
	 }
 
     public String getLogin() {
       return this.login;
     }
	 public void setLogin(){
		this.login = login;
	 }

     public String getPassword() {
       return this.password;
     }
	 public void setPassword(){
		this.password = password;
	 }

     public UserState getState() {
       return this.state;
     }
	 public void setState(){
		this.state = state;
	 }

     public Customer getCustomer() {
       return this.customer;
     }
	 public void setCustomer(){
		this.customer = customer;
	 }

     public ShoppingCart getShoppingcart() {
       return this.shoppingcart;
     }
	 public void setShoppingcart(){
		this.shoppingcart = shoppingcart;
	 }
	

	 public void Output()
	 {
	     System.out.println(login);

	     System.out.println(password);

	     System.out.println(state);

	     System.out.println(customer);

	     System.out.println(shoppingcart);
	 }
}
