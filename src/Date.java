public class Date {
  private final int day;
  private final int month;
  private final int year;

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  @Override
  public String toString() {
    return this.day + "/" + this.month + "/" + this.year;
  }
}