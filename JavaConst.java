public class JavaConst {
    public static void main(String args[])
    {
        Student s1=new Student("ram");
        System.out.println(s1.name);
        
    }
}
class Student
{
    String name;
    int roll;
    Student(String name)
    {
        this.name=name;
    }
}
