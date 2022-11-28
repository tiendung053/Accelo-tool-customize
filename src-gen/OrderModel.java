   public class Order {
		 private String number;

		 private Date ordered;

		 private Date shipped;

		 private Address ship_to;

		 private OrderStatus status;

		 private Real total;

		 private Payment payment;

		 private Account account;

		 private LineItem lineitem;
		 public Order(){}
	   	 public Order(String number, Date ordered, Date shipped, Address ship_to, OrderStatus status, Real total, Payment payment, Account account, LineItem lineitem
		 {
		     this.number = number;

		     this.ordered = ordered;

		     this.shipped = shipped;

		     this.ship_to = ship_to;

		     this.status = status;

		     this.total = total;

		     this.payment = payment;

		     this.account = account;

		     this.lineitem = lineitem;
		 }
	 
	     public String getNumber() {
	       return this.number;
	     }
		 public void setNumber{
			this.number = number;
		 }

	     public Date getOrdered() {
	       return this.ordered;
	     }
		 public void setOrdered{
			this.ordered = ordered;
		 }

	     public Date getShipped() {
	       return this.shipped;
	     }
		 public void setShipped{
			this.shipped = shipped;
		 }

	     public Address getShip_to() {
	       return this.ship_to;
	     }
		 public void setShip_to{
			this.ship_to = ship_to;
		 }

	     public OrderStatus getStatus() {
	       return this.status;
	     }
		 public void setStatus{
			this.status = status;
		 }

	     public Real getTotal() {
	       return this.total;
	     }
		 public void setTotal{
			this.total = total;
		 }

	     public Payment getPayment() {
	       return this.payment;
	     }
		 public void setPayment{
			this.payment = payment;
		 }

	     public Account getAccount() {
	       return this.account;
	     }
		 public void setAccount{
			this.account = account;
		 }

	     public LineItem getLineitem() {
	       return this.lineitem;
	     }
		 public void setLineitem{
			this.lineitem = lineitem;
		 }
		

		 public void Output()
		 {
		     System.out.println(number);

		     System.out.println(ordered);

		     System.out.println(shipped);

		     System.out.println(ship_to);

		     System.out.println(status);

		     System.out.println(total);

		     System.out.println(payment);

		     System.out.println(account);

		     System.out.println(lineitem);
		 }
   }
