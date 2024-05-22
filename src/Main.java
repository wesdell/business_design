public class Main {
  public static void main(String[] args) {
    // Dado cliente, empresa, productos
    Business business = new Business();
    Customer sebastian = new Customer("Sebastian");
    business.addProduct(
            new Product("Mochila", 89.99, 5),
            new Product("Zapatos", 50.00, 2),
            new Product("Linterna", 8.49, 10),
            new Product("Gorra", "27,99", 4)
    );

    // Cuando cliente compra productos
    business.showProducts();

    // Entonces se emite una factura
  }
}