package hnue.it.shoppingonline;

public class LineItemModel {
	 private int quantity;
	 private Price price;
	 private Order order;
	 private ShoppingCart shoppingcart;
	 private Product product;
	 public LineItem(){}
   	 public LineItem(int quantity, Price price, Order order, ShoppingCart shoppingcart, Product product)
	 {
	     this.quantity = quantity;

	     this.price = price;

	     this.order = order;

	     this.shoppingcart = shoppingcart;

	     this.product = product;
	 }
 
     public int getQuantity() {
       return this.quantity;
     }
	 public void setQuantity(){
		this.quantity = quantity;
	 }

     public Price getPrice() {
       return this.price;
     }
	 public void setPrice(){
		this.price = price;
	 }

     public Order getOrder() {
       return this.order;
     }
	 public void setOrder(){
		this.order = order;
	 }

     public ShoppingCart getShoppingcart() {
       return this.shoppingcart;
     }
	 public void setShoppingcart(){
		this.shoppingcart = shoppingcart;
	 }

     public Product getProduct() {
       return this.product;
     }
	 public void setProduct(){
		this.product = product;
	 }
	

	 public void Output()
	 {
	     System.out.println(quantity);

	     System.out.println(price);

	     System.out.println(order);

	     System.out.println(shoppingcart);

	     System.out.println(product);
	 }
}
