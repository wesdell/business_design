public abstract class Product {
  private final String name;
  private final double price;
  private int stock;

  public Product(String name, double price, int stock) {
    this.name = name;
    this.price = price;
    this.stock = stock;
  }

  public int reduceStock(int amountToReduce) {
    if (amountToReduce > this.stock) {
      amountToReduce = this.stock;
      this.stock = 0;
    } else {
      this.stock -= amountToReduce;
    }
    return amountToReduce;
  }

  public double getPrice() {
    return this.price;
  }

  @Override
  public String toString() {
    return this.name;
  }

  public abstract double getVAT();
}