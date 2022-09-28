
public class Main {

	public static void main(String[] args) {
		Product product=new Product();

		product.setName("KOla");
		product.setStockAmount(4);
		product.setPrice(4.00);
		product.setDescription("Şekersiz");
		ProductManager productManager=new ProductManager();
		productManager.add(product);

	}

}
