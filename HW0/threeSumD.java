public class threeSumD {
    public static void main(String[] args) {
        int a[] = new int[] {-6, 2, 4};
        int b[] = new int[] {-6, 3, 10, 200};
        int c[] = new int[] {8, 2, -1, -1, 15};
        System.out.println(threeSumDistinct(a));
        System.out.println(threeSumDistinct(b));
        System.out.println(threeSumDistinct(c));
    }
    public static String threeSumDistinct(int[] a) {
        for (int f = 0; f < a.length; f++) {
            for (int g = f + 1; g < a.length; g++) {
                for (int h = g + 1; h < a.length; h++) {
                    if (a[f] + a[g] + a[h] == 0) {
                        return "True";
                    }
                }
            }
        }
        return "False";
    }
}