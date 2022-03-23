class Main {

  public static double productCost(Product n)
  {
    double pc = n.getPrice() * n.getQuantity();
    return pc;
  }

  public static double grandTotal(Product[] r)
  {
    double gt = 0.0
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
    Product p = new Product(5.49, "Maybelline","Concealer", 1);
    Media m = new Media();
    Electronics e = new Electronics(399.99, "Samsung", "Galaxy Watch4", 3, "Rose Gold", true);
    Clothing c = new Clothing(49.90, "Fast Retailing Co.", "Trousers", 15, "Uniqlo", "Small");
    Men mn = new Men(679.99, "Gap Inc.", "Leather Jacket", 2, "Banana Republic", "Large", false);
    Women w = new Women(1225.00, "Michael Kors", "Silk Skirt", 1, "Small", "Petite");

    //populate array
    items[0] = p;
    items[1] = m;
    items[2] = e;
    items[3] = c;
    items[4] = mn;
    items[5] = w;

    //print items with new quantities
    for (Product x : items)
    {
      System.out.println(x);
      System.out.println();
    }
/*
    //randomly determine item quantity
    for(int i = 0; i<6; i++)
    {
      int q = (int) (Math.random()*4)+3;
      items[i].setQuantity(q);
    }*/

    System.out.println("BREAK");
    for (Product x : items)
    {
      System.out.println(x);
      System.out.println();
    }

//checklist
    //make to string methods in other classes
    //configure print format
    //write total methods
    
//i should make this first
//then the for loop to do .set



    
//check what kind of constructors to make
    //make sure methods are good
    //pay special attention to product class and prjctsem info

    //for here
    //array of products, 1 of each class including parent
    //use ran num generator to get quantity
    //for(Product w : )
  }
}