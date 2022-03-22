public class Product
{
  private double price;
  private String company;
  private String name;
  private int quantity;

  public Product()
  {
    this(32.0, "Samsung", "Wireless Mouse", 2);
  }

  public double getPrice()
  {
    return price;
  }

  public String getCompany()
  {
    return company;
  }

  public String getName()
  {
    return name;
  }
  
  public int getQuantity()
  {
    return quantity;
  }
  
  public void setPrice(double d)
  {
    price = d;
  }

  public void setCompany(String s)
  {
    company = s;
  }
  
  public void setName(String s)
  {
    name = s;
  }
  
  public void setQuantity(int x)
  {
    quantity = x;
  }
  
  public String toString()
  {
    String rv = quantity;
    return rv;
  }

}