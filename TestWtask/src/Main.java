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

        int[] arr = {2, 5, 6, 7, 8, 9};
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        System.out.println();
        System.out.println(reversNumber(4564278));
        arrRev(arr);

    }
    public static void arrRev(int[] arr){
        int[] arrRev = new int[6];
        for (int i = arr.length-1; i >= 0; i--) {
            arrRev[i] = arr[i];
            System.out.print(arrRev[i]);
        }

    }
    public static long reversNumber(long num){
        long revers = 0;
        while (num != 0){
            revers = revers*10 + num%10;
            num = num/10;
        }
        return revers;

    }

}