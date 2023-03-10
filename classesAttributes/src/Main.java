public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus",5000.0,3,"Red");
        Product product12 = new Product();
        product12.setName("Laptop");
        product12.setId(1);
        product12.setDescription("MBP");
        product12.setPrice(5000.0);
        product12.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getName());
        System.out.println(product.getId());
        System.out.println(product.getDescription());
        System.out.println(product.getPrice());
        System.out.println(product.getStockAmount());
    }
}