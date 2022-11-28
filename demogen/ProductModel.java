package hnue.it.shoppingonline;

public class ProductModel {
	 private String id;
	 private String name;
	 private Supplier supplier;
	 private LineItem lineitem;
	 public Product(){}
   	 public Product(String id, String name, Supplier supplier, LineItem lineitem)
	 {
	     this.id = id;

	     this.name = name;

	     this.supplier = supplier;

	     this.lineitem = lineitem;
	 }
 
     public String getId() {
       return this.id;
     }
	 public void setId(){
		this.id = id;
	 }

     public String getName() {
       return this.name;
     }
	 public void setName(){
		this.name = name;
	 }

     public Supplier getSupplier() {
       return this.supplier;
     }
	 public void setSupplier(){
		this.supplier = supplier;
	 }

     public LineItem getLineitem() {
       return this.lineitem;
     }
	 public void setLineitem(){
		this.lineitem = lineitem;
	 }
	

	 public void Output()
	 {
	     System.out.println(id);

	     System.out.println(name);

	     System.out.println(supplier);

	     System.out.println(lineitem);
	 }
}
