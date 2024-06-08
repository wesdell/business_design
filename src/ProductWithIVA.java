public class ProductWithIVA extends Product {
  public static final double VAT_PERCENTAGE = 0.15;

  private final double vat;

  public ProductWithIVA(String name, double price, int stock) {
    super(name, price, stock);
    this.vat = this.setVat();
  }

  public double getVAT() {
    return this.vat;
  }

  private double setVat() {
    return super.getPrice() * VAT_PERCENTAGE;
  }
}