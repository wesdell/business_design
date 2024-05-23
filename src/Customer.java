public class Customer {
  private final String name;

  public Customer(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}