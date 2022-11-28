package hnue.it.shoppingonline;

public class ShoppingCartModel {
	 private Date created;
	 private Account account;
	 private LineItem lineitem;
	 private WebUser webuser;
	 public ShoppingCart(){}
   	 public ShoppingCart(Date created, Account account, LineItem lineitem, WebUser webuser)
	 {
	     this.created = created;

	     this.account = account;

	     this.lineitem = lineitem;

	     this.webuser = webuser;
	 }
 
     public Date getCreated() {
       return this.created;
     }
	 public void setCreated(){
		this.created = created;
	 }

     public Account getAccount() {
       return this.account;
     }
	 public void setAccount(){
		this.account = account;
	 }

     public LineItem getLineitem() {
       return this.lineitem;
     }
	 public void setLineitem(){
		this.lineitem = lineitem;
	 }

     public WebUser getWebuser() {
       return this.webuser;
     }
	 public void setWebuser(){
		this.webuser = webuser;
	 }
	

	 public void Output()
	 {
	     System.out.println(created);

	     System.out.println(account);

	     System.out.println(lineitem);

	     System.out.println(webuser);
	 }
}
