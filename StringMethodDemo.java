public class StringMethodDemo {
    public static void main(String[] args) {
        String s1 = "How are you, sandesh?";
        System.out.println(s1);
        System.out.println("Length of string is"+s1.length());

        String s2 = "I am in panvel";
        String s3 = s1.concat(s2);
        System.out.println(s3);

        String s4 = "HELLO";
        String s5 = "hello";
        System.out.println(s4.toLowerCase()+"\t"+s5.toUpperCase());

        String s6 = "Hello Iam in Panvel where are you?      ";
        System.out.println(s6.substring(13, 19));
        System.out.println(s6.length());
        String s7 =s6.trim();
        System.out.println(s7+""+s7.length());

        System.out.println(s6.charAt(6));

        


    }
}
