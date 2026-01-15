class Student
{
    String studName;
    int rn;
    int marks;

    public Student(int rn,String studName,int marks)
    {
        this.rn=rn;
        this.studName=studName;
        this.marks=marks;
    } 

    public String toString()
    {
        return "Student Name :"+studName+"\n Roll No : "+rn+"\n Marks : "+marks;
    }
}

class ToStringDemo
{
    public static void main(String args[])
    {
        Student s1=new Student(5,"Jayesh",85);
        System.out.println(s1);
    }
}