public class Electronics extends Product
{
  private String color;
  private boolean batteryIncluded;

  public Electronics()
  {
    super();
    color = "black";
    batteryIncluded = true;
  }

  public String getColor()
  {
    return color;
  }

  public boolean getBatteryIncluded()
  {
    return batteryIncluded;
  }

  public void setColor(String c)
  {
    color = c;
  }

  public void setBatteryIncluded(boolean b)
  {
    batteryIncluded = b;
  }
}