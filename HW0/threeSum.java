public class threeSum {
    public static void main(String[] args) {
        int a[] = new int[] {-6, 2, 5};
        int b[] = new int[] {-6, 3, 10, 200};
        int c[] = new int[] {5, 1, 0, 3, 6};
        System.out.println(threesum(a));
        System.out.println(threesum(b));
        System.out.println(threesum(c));
    }
    public static String threesum(int[] a) {
        for (int f = 0; f < a.length; f++) {
            for (int g = 0; g < a.length; g++) {
                for (int h = 0; h < a.length; h++) {
                    if (a[f] + a[g] +a[h] == 0) {
                        return "True";
                    }
                }
            }
        } return "False";
    }
}