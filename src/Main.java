public class Main {
  public static void main(String[] args) {
    // Dado cliente, empresa, productos
    Business business = new Business("SG");
    Customer sebastian = new Customer("Sebastian");
    business.addProducts(
            new Product("Mochila", 89.99, 5),
            new Product("Zapatos", 50.00, 2),
            new Product("Linterna", 8.49, 10),
            new Product("Gorra", 27.99, 4)
    );

    // Cuando cliente compra productos
    Receipt receipt = business.sellProducts(
            sebastian,
            new PurchasedProduct(business.getProductById(1), 2), // 179.98
            new PurchasedProduct(business.getProductById(2), 1), // 50.00
            new PurchasedProduct(business.getProductById(3), 2), // 16.98
            new PurchasedProduct(business.getProductById(4), 4)  // 111.96
    );

    // Entonces se emite una factura
    System.out.println(receipt); // 352.75
  }
}