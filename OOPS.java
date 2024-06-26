public class OOPS {
    public static void main(String args[])
    {
        Pen p1 = new Pen();
        p1.setColor("BLUE");
        System.out.println(p1.Color);
       
    }
    
}
class Pen {
    String Color;

    void setColor(String newColor)
    {
        Color=newColor;
    }
  
}
