package Constuctor;

public class Student {

    int rollNo,age, marks;
    String name,address,div;
    float avg;

    //default constructor
    Student()
    {
        System.out.println("I am in default constructor");
    }

    //1st para constructor-Admission 3
    Student(int age,String name,String address)
    {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    //2nd para constrcutor- Exam 4
    Student(int marks,int rollno,float avg,String name)
    {
        this.marks = marks;
        this.rollNo = rollno;
        this.avg = avg;
        this.name = name;
    }

    //3rd para for dept
    Student(int marks,int rollno,float avg,String name,String address,int age, String div)
    {
        this.marks = marks;
        this.rollNo = rollno;
        this.avg = avg;
        this.name = name;
        this.address =address;
        this.age = age;
        this.div =div;
    }

    
    void displayStudent()
    {
        System.out.println("roono is"+rollNo);
        System.out.println("age is"+age);
        System.out.println("marks is"+marks);
        System.out.println("name is"+name);
        System.out.println("Address is"+address);
        System.out.println("Div is"+div);
        System.out.println("avg is"+avg);
    }

    public static void main(String[] args) {

        Student st1 = new Student();
        st1.displayStudent();

        System.out.println("++++++++++++++++++++++++++++++++++");

        Student st2 = new Student(30, "ABC", "PANVEL");
        st2.displayStudent();

        System.out.println("++++++++++++++++++++++++++++++++++");
        Student st3 = new Student(30, 101, 8.9f, "ABC");
        st3.displayStudent();

        System.out.println("++++++++++++++++++++++++++++++++++");
        Student st4 = new Student(30, 101, 8.9f, "ABC","PANVEL",30,"D");
        st4.displayStudent();
        
    }
}
