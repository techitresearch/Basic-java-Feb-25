public class StringDemo {
    public static void main(String[] args) {
        //1 st way to represent String using char array
        char ch[] = {'H','e','l','l','o'};
        for(int i=0;i<5;i++)
        {
            System.out.print(ch[i]);
        }

        String s1 = "Hello";
        System.out.println("\n"+s1);
       
    }
}
