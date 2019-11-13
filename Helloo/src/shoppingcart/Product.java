package shoppingcart;

public class Product {
	int productid;
	String productname;
	String qua;
	float price;
	
	public Product(int productid,String productname,String qua,float price) {
		this.productid=productid;
		this.productname=productname;
		this.qua=qua;
		this.price=price;
		
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getQua() {
		return qua;
	}

	public void setQua(String qua) {
		this.qua = qua;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
    public String toString() {
        return "product{" +
    "product id" + productid +" \n"+"product name=" + productname + " \n" +"product quantity"+qua+"\n "+"Product price"+price+" \n";
    }

}
