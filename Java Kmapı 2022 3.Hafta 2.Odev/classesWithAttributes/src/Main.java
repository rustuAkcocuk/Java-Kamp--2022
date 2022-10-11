public class Main {

    public static void main(String[] args) {
	// write your code here
        Product product =new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");
        /*product.setName("Laptop");
        product.setid(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.getId();*/

        ProductManager productMnager=new ProductManager();
        productMnager.add(product);
        System.out.println(product.getKod());
    }
}
