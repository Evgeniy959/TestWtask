public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String s1 = "text";
        String s2 = "Text".toLowerCase();
        String s3 = "t"+"ext";

        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}