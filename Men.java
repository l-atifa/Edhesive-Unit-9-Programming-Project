public class Men extends Clothing
{
  public boolean hasButtons;

  public Men()
  {
    super();
    hasButtons = true;
  }

  public Men(double p, String c, String n, int q, String b, String s, boolean hB)
  {
    super(p, c, n, q, b, s);
    hasButtons = hB;
  }

  public boolean getHasButtons()
  {
    return hasButtons;
  }

  public void setHasButtons(boolean i)
  {
    hasButtons = i;
  }

  public String toString()
  {
    return super.toString() + ". Has buttons: " + this.getHasButtons() + ".";
  }
}