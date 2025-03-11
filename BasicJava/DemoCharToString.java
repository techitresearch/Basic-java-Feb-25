package BasicJava;

public class DemoCharToString {

    public static void main(String[] args) {

        //1.Char to String
        //Initialize Char variable
        char c = 'A';

        System.out.println("Before cobverting char is"+c);

        //Initialize String varibale & convert char to String
        String str = Character.toString(c);

        System.out.println("After cobverting string is"+str);

        //2.String to char
        //Initialize string variable
        String str1 = "Hello";

        //initialize char array variable
        char ch[] = str1.toCharArray();

        //print the single char using for loop
        for (int i=0;i<str1.length();i++)
        {
            System.out.println("char is"+ch[i]);
        }


    }
}