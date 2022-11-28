package hnue.it.shoppingonline;

public class CustomerModel {
	 private String id;
	 private Address address;
	 private Phone phone;
	 private String email;
	 private Account account;
	 private WebUser webuser;
	 public Customer(){}
   	 public Customer(String id, Address address, Phone phone, String email, Account account, WebUser webuser)
	 {
	     this.id = id;

	     this.address = address;

	     this.phone = phone;

	     this.email = email;

	     this.account = account;

	     this.webuser = webuser;
	 }
 
     public String getId() {
       return this.id;
     }
	 public void setId(){
		this.id = id;
	 }

     public Address getAddress() {
       return this.address;
     }
	 public void setAddress(){
		this.address = address;
	 }

     public Phone getPhone() {
       return this.phone;
     }
	 public void setPhone(){
		this.phone = phone;
	 }

     public String getEmail() {
       return this.email;
     }
	 public void setEmail(){
		this.email = email;
	 }

     public Account getAccount() {
       return this.account;
     }
	 public void setAccount(){
		this.account = account;
	 }

     public WebUser getWebuser() {
       return this.webuser;
     }
	 public void setWebuser(){
		this.webuser = webuser;
	 }
	

	 public void Output()
	 {
	     System.out.println(id);

	     System.out.println(address);

	     System.out.println(phone);

	     System.out.println(email);

	     System.out.println(account);

	     System.out.println(webuser);
	 }
}
