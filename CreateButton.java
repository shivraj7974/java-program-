import java.awt.*;
/*class ButtonDemo extends Frame {
    ButtonDemo()
     {
        //Frame f=new frame("java buttons");
        Button b = new Button("Click");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        
    }
    public static void main(String args[])
    {
        ButtonDemo b = new ButtonDemo();
    }
    */
public class CheckboxExample
{
    CheckboxExample()
    {
        frame f = new frame("checkbox ex........");
        Checkbox cb1=new Checkbox("c++");
        Checkbox cb2=new Checkbox("java"); 
        cb1.setBounds(100,100,60,60);
        cb2.setBounds(100,150,60,60);
        f.add(cb1);
        f.add(cb2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String args[])
    {
        new CheckboxExample();
    }
}
