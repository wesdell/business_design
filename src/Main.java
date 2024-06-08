public class Main {
  public static void main(String[] args) {
    // Dado cliente, empresa, productos
    Business business = new Business("SG");
    Customer sebastian = new Customer("Sebastian");
    business.addProducts(
            new ProductWithIVA("Mochila", 89.99, 5),
            new ProductWithoutIVA("Zapatos", 50.00, 1),
            new ProductWithoutIVA("Linterna", 5.56, 3),
            new ProductWithIVA("Gorra", 3.00, 2)
    );

    // Cuando cliente compra productos
    Receipt receipt = business.sellProducts(
            sebastian,
            new PurchasedProduct(business.getProductById(1), 4),
            new PurchasedProduct(business.getProductById(2), 4),
            new PurchasedProduct(business.getProductById(4), 1)
    );

    // Entonces se emite una factura
    System.out.println(receipt);
  }
}