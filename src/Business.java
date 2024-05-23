public class Business {
  private final String name;
  private Product[] products;
  private int receiptId;
  private int orderId;

  public Business(String name) {
    this.name = name;
  }

  public void addProducts(Product... products) {
    this.products = products;
  }

  public Receipt sellProducts(Customer customer, PurchasedProduct... purchasedProducts) {
    Receipt receipt = new Receipt(
            receiptId++,
            new Date(7, 12, 2024),
            customer,
            this.name,
            purchasedProducts
    );
    return receipt;
  }

  public Product getProductById(int id) {
    if (id <= 0 || id > products.length) {
      return null;
    }
    return this.products[id - 1];
  }
}