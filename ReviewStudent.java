class ReviewStudent
{
int rollno;
String name;
String college;
public static void main(String args[])
{
ReviewStudent s1=new ReviewStudent(1,"liya","stc");
ReviewStudent s2=new ReviewStudent(2,"devika","sgc");
s1.display();
s2.display();
}
ReviewStudent(int rollno1,String name1,String college1)
{
 rollno=rollno1;
name=name1;
 college=college1;
}
public void display()
{
System.out.println("roll num is:"+rollno);
System.out.println("name is:"+name);
System.out.println("college is:"+college);
}
}