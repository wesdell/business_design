import java.util.Arrays;

public class Receipt {
  public static final double TAX_PERCENTAGE = 0.15;

  private final int receiptId;
  private final int discount;
  private final double subtotal;
  private final double total;
  private final double tax;
  private final String businessName;
  private final Date receiptDate;
  private final Customer customer;
  private final PurchasedProduct[] purchasedProducts;

  public Receipt(int receiptId, Date receiptDate, Customer customer, String businessName, PurchasedProduct[] purchasedProducts) {
    this.receiptId = receiptId;
    this.receiptDate = receiptDate;
    this.customer = customer;
    this.businessName = businessName;
    this.purchasedProducts = purchasedProducts;
    this.subtotal = this.getSubtotal();
    this.discount = this.getDiscount();
    this.tax = this.getTax();
    this.total = this.subtotal + this.tax - this.discount;
  }

  private double getSubtotal() {
    double subtotal = 0;
    for (PurchasedProduct purchasedProduct : purchasedProducts) {
      subtotal += purchasedProduct.getCost();
    }
    return subtotal;
  }

  private int getDiscount() {
    return (int) (this.subtotal / 100) * 20;
  }

  private double getTax() {
    return this.subtotal * TAX_PERCENTAGE;
  }

  @Override
  public String toString() {
    return "Factura \n" +
            "receiptId: " + this.receiptId + "\n" +
            "businessName: " + this.businessName + "\n" +
            "customer: " + this.customer + "\n" +
            "receiptDate: " + this.receiptDate + "\n" +
            "purchasedProducts: " + Arrays.toString(this.purchasedProducts) + "\n" +
            "subtotal: " + this.subtotal + "\n" +
            "tax: " + this.tax + "\n" +
            "discount: " + this.discount + "\n" +
            "total: " + this.total;
  }
}