public class Women extends Clothing
{
  private String extendedSize; //ie plus size petite tall 

  public Women()
  {
    super();
    extendedSize = "tall";
  }

  public String getExtendedSize()
  {
    return extendedSize;
  }

  public void setExtendedSize(String es)
  {
    extendedSize = es;
  }
}