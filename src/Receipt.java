import java.util.ArrayList;
import java.util.List;

public class Receipt {
  private final int receiptId;
  private final int discount;
  private double subtotal;
  private final double total;
  private double vat;
  private final String businessName;
  private final Date receiptDate;
  private final Customer customer;
  private final ArrayList<PurchasedProduct> purchasedProducts = new ArrayList<>();

  public Receipt(int receiptId, Date receiptDate, Customer customer, String businessName, PurchasedProduct[] purchasedProducts) {
    this.receiptId = receiptId;
    this.receiptDate = receiptDate;
    this.customer = customer;
    this.businessName = businessName;
    this.purchasedProducts.addAll(List.of(purchasedProducts));
    this.setSubtotalAndVAT();
    this.discount = this.getDiscount();
    this.total = this.subtotal + this.vat - this.discount;
  }

  private void setSubtotalAndVAT() {
    for (PurchasedProduct purchasedProduct : purchasedProducts) {
      this.subtotal += purchasedProduct.getCost();
      this.vat += purchasedProduct.getVAT();
    }
  }

  private int getDiscount() {
    return (int) (this.subtotal / 100) * 20;
  }

  @Override
  public String toString() {
    return "Factura \n" +
            "receiptId: " + this.receiptId + "\n" +
            "businessName: " + this.businessName + "\n" +
            "customer: " + this.customer + "\n" +
            "receiptDate: " + this.receiptDate + "\n" +
            "purchasedProducts: " + this.purchasedProducts + "\n" +
            "subtotal: " + this.subtotal + "\n" +
            "tax: " + this.vat + "\n" +
            "discount: " + this.discount + "\n" +
            "total: " + this.total;
  }
}