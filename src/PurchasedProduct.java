public class PurchasedProduct {
  private final Product product;
  private final int amount;
  private final double cost;

  public PurchasedProduct(Product product, int amount) {
    this.product = product;
    this.amount = amount;
    this.cost = product.getPrice() * this.amount;
  }

  public double getCost() {
    return this.cost;
  }

  @Override
  public String toString() {
    return this.product.toString();
  }
}