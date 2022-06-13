import java.text.*;
import java.util.*;

class Main {

  public static double productCost(Product n)
  {
    double pc = n.getPrice() * n.getQuantity();
    return pc;
  }

  public static double grandTotal(Product[] r)
  {
    double gt = 0.0;
    for (Product od : r)
    {
      gt += (od.getPrice() * od.getQuantity());
    }
    return gt;
  }
  
  public static void main(String[] args) 
  {
    //instantiate Product array
    Product[] items = new Product[6];
    
    //instantiate object from each class
    Product p = new Product(5.49, "Maybelline","Concealer", ((int) (Math.random()*4)+3));
    Media m = new Media();
    m.setQuantity((int) (Math.random()*4)+3);
    Electronics e = new Electronics(399.99, "Samsung", "Galaxy Watch4", ((int) (Math.random()*4)+3), "rose gold", true);
    Clothing c = new Clothing(49.99, "Fast Retailing Co.", "Trousers", ((int) (Math.random()*4)+3), "Uniqlo", "small");
    Men mn = new Men(679.99, "Gap Inc.", "Leather Jacket", ((int) (Math.random()*4)+3), "Banana Republic", "large", false);
    Women w = new Women(1225.05, "Capri Holdings", "Silk Skirt", ((int) (Math.random()*4)+3), "Versace", "small", "petite");

    //populate array
    items[0] = p;
    items[1] = m;
    items[2] = e;
    items[3] = c;
    items[4] = mn;
    items[5] = w;

    //print items with  quantities
    System.out.println("Printing Each Product With Respective toString Method\n");
    for (Product x : items)
    {
      System.out.println(x + "\n");
    }
    System.out.println("-------------------------------------------------------");

    
    System.out.println("Printing To Utilize Cost & Total Methods\n");

    NumberFormat nf=NumberFormat.getCurrencyInstance();
    String fmt = "%1$20s %2$20s %3$15s %4$15s %5$15s";
    System.out.printf(fmt, "Name", "Company", "Quantity" , "Price", "Total Cost\n");
    System.out.println("*******************************************************************************************");

    for(int i = 0; i<items.length; i++)
    {
      System.out.printf(fmt, items[i].getName() , items[i].getCompany() , items[i].getQuantity(), nf.format(items[i].getPrice()), nf.format(productCost(items[i])));
      
      System.out.println();
    }
    System.out.println("*******************************************************************************************");
    System.out.printf("Grand Total%20s" , nf.format(grandTotal(items)));

  }
}