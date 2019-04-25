//import required packages here
import java.util.Scanner;
class Item
{
  public int price;
  Item(int price)
  {
    this.price = price;
  }
  public int getPrice()
  {
    return this.price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  Customer(String product, int quantity)
  {
    this.product = product;
    this.quantity = quantity;
  }
  public int getQuantity()
  {
    return this.quantity;
  }
}

class Bill
{
 Customer customer;
  Item item;
  int cost;
  Bill(Customer customer,Item item)
  {
    this.customer = customer;
    this.item = item;
  }
  public void TotalCost()
  {
    cost = customer.getQuantity()*item.getPrice();
    System.out.println("Total Price is : "+cost);
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String product = in.nextLine();
    int price = in.nextInt();
    int quantity = in.nextInt();
    Item i = new Item(price);
    Customer c = new Customer(product,quantity);
    Bill obj = new Bill(c,i);
    obj.TotalCost();
    }
}