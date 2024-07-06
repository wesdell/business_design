import java.util.ArrayList;
import java.util.List;

public class Business {
  private final String name;
  private final ArrayList<Product> products = new ArrayList<>();
  private int receiptId;

  public Business(String name) {
    this.name = name;
  }

  public void addProducts(Product... products) {
    this.products.addAll(List.of(products));
  }

  public Receipt sellProducts(Customer customer, PurchasedProduct... purchasedProducts) {
      return new Receipt(
            receiptId++,
            new Date(7, 12, 2024),
            customer,
            this.name,
            purchasedProducts
    );
  }

  public Product getProductById(int id) {
    if (id <= 0 || id > products.size()) {
      return null;
    }
    return this.products.get(id - 1);
  }
}