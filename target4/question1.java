public class question1 {
    public static void refCheck(String x, String y) {
        if (x == y) {
            System.out.println("Both pointing to the same reference");

        } else {
            System.out.println("Both are pointing to different reference");
        }
    }
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println("Before Modification in st1");
        System.out.println(str1);
        refCheck(str1, str2);
        str1 += "world";
        System.out.println("After Modification");
        System.out.println(str1);
        refCheck(str1, str2);
    }
}

