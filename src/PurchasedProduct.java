public class PurchasedProduct {
  private final Product product;
  private final int amount;
  private final double cost;

  public PurchasedProduct(Product product, int amount) {
    this.product = product;
    this.amount = product.reduceStock(amount);
    this.cost = product.getPrice() * this.amount;
  }

  public double getCost() {
    return this.cost;
  }

  public double getVAT() {
    return this.product.getVAT() * this.amount;
  }

  @Override
  public String toString() {
    return this.product.toString();
  }
}