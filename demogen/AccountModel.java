package hnue.it.shoppingonline;

public class AccountModel {
	 private String id;
	 private Address billing_address;
	 private boolean is_closed;
	 private Date open;
	 private Date closed;
	 private Customer customer;
	 private Payment payment;
	 private ShoppingCart shoppingcart;
	 private Order order;
	 public Account(){}
   	 public Account(String id, Address billing_address, boolean is_closed, Date open, Date closed, Customer customer, Payment payment, ShoppingCart shoppingcart, Order order)
	 {
	     this.id = id;

	     this.billing_address = billing_address;

	     this.is_closed = is_closed;

	     this.open = open;

	     this.closed = closed;

	     this.customer = customer;

	     this.payment = payment;

	     this.shoppingcart = shoppingcart;

	     this.order = order;
	 }
 
     public String getId() {
       return this.id;
     }
	 public void setId(){
		this.id = id;
	 }

     public Address getBilling_address() {
       return this.billing_address;
     }
	 public void setBilling_address(){
		this.billing_address = billing_address;
	 }

     public boolean getIs_closed() {
       return this.is_closed;
     }
	 public void setIs_closed(){
		this.is_closed = is_closed;
	 }

     public Date getOpen() {
       return this.open;
     }
	 public void setOpen(){
		this.open = open;
	 }

     public Date getClosed() {
       return this.closed;
     }
	 public void setClosed(){
		this.closed = closed;
	 }

     public Customer getCustomer() {
       return this.customer;
     }
	 public void setCustomer(){
		this.customer = customer;
	 }

     public Payment getPayment() {
       return this.payment;
     }
	 public void setPayment(){
		this.payment = payment;
	 }

     public ShoppingCart getShoppingcart() {
       return this.shoppingcart;
     }
	 public void setShoppingcart(){
		this.shoppingcart = shoppingcart;
	 }

     public Order getOrder() {
       return this.order;
     }
	 public void setOrder(){
		this.order = order;
	 }
	

	 public void Output()
	 {
	     System.out.println(id);

	     System.out.println(billing_address);

	     System.out.println(is_closed);

	     System.out.println(open);

	     System.out.println(closed);

	     System.out.println(customer);

	     System.out.println(payment);

	     System.out.println(shoppingcart);

	     System.out.println(order);
	 }
}
