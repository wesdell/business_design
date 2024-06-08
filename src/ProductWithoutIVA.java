public class ProductWithoutIVA extends Product {
  public ProductWithoutIVA(String name, double price, int stock) {
    super(name, price, stock);
  }

  public double getVAT() {
    return 0;
  }
}