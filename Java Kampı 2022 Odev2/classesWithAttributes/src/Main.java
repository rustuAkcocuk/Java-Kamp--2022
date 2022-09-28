public class Main {

    public static void main(String[] args) {
	// write your code here
        Product product=new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");
    /*    product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(5);*/

        ProductManager productManager =new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());

    }

}
