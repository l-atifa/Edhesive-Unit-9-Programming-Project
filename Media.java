public class Media extends Product
{
  private String type; //ie book dvd

  public Media()
  {
    super(9.99, "Shueisha", "Demon Slayer Volume 18", 1);
    type = "Manga";
  }

  public Media(double p, String c, String n, int q, String t)
  {
    super(p, c, n, q);
    type = t;
  }

  public String getType()
  {
    return type;
  }

  public void setType(String t)
  {
    type = t;
  }

  /*public String toString()
  {
    
  }*/
}