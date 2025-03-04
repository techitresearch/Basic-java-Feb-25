package GetterSetterMethods;

public class Student {
    //variables or attributes
    String name,address,course;
    int age,id;

    //setMethod
    void setName(String newName)
    {
        this.name = newName;
    }

    //get Method
    String getName()
    {
        return name;
    }

    void setAddress(String newAddress)
    {
        this.address = newAddress;
    }

    String getAddress()
    {
        return address;
    }

    void setAge(int newAge)
    {
        this.age = newAge;
    }
    int getAge()
    {
        return age;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Aniruddha");
        System.out.println("Name of Student is"+student1.getName());
        student1.setAddress("Panvel");
        System.out.println("Address is"+student1.getAddress());
        student1.setAge(34);
        System.out.println("Age is"+student1.getAge());

    }

}
