   public class Payment {
		 private String id;

		 private Date paid;

		 private Real total;

		 private String details;

		 private Account account;

		 private Order order;
		 public Payment(){}
	   	 public Payment(String id, Date paid, Real total, String details, Account account, Order order
		 {
		     this.id = id;

		     this.paid = paid;

		     this.total = total;

		     this.details = details;

		     this.account = account;

		     this.order = order;
		 }
	 
	     public String getId() {
	       return this.id;
	     }
		 public void setId{
			this.id = id;
		 }

	     public Date getPaid() {
	       return this.paid;
	     }
		 public void setPaid{
			this.paid = paid;
		 }

	     public Real getTotal() {
	       return this.total;
	     }
		 public void setTotal{
			this.total = total;
		 }

	     public String getDetails() {
	       return this.details;
	     }
		 public void setDetails{
			this.details = details;
		 }

	     public Account getAccount() {
	       return this.account;
	     }
		 public void setAccount{
			this.account = account;
		 }

	     public Order getOrder() {
	       return this.order;
	     }
		 public void setOrder{
			this.order = order;
		 }
		

		 public void Output()
		 {
		     System.out.println(id);

		     System.out.println(paid);

		     System.out.println(total);

		     System.out.println(details);

		     System.out.println(account);

		     System.out.println(order);
		 }
   }
