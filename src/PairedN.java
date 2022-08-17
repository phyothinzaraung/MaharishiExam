public class PairedN {

    static int isPairedN(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++)
                if (a[i] + a[j] == n && i + j == n) {
                    return 1;
                }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isPairedN(new int[]{1, 4, 1, 4, 5, 6}, 5));
        System.out.println(isPairedN(new int[]{1, 4, 1, 4, 5, 6}, 6));
        System.out.println(isPairedN(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 6));
        System.out.println(isPairedN(new int[]{1, 4, 1}, 5));
        System.out.println(isPairedN(new int[]{8, 8, 8, 8, 7, 7, 7}, 15));
        System.out.println(isPairedN(new int[]{8, -8, 8, 8, 7, 7, -7}, -15));
        System.out.println(isPairedN(new int[]{3}, 3));
        System.out.println(isPairedN(new int[]{}, 0));
    }
}
