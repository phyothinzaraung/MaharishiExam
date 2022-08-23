import java.util.Arrays;

public class ReversedArray {

    static int[] reverseArray(int[] a){
        int[] resultArray = new int[a.length];
        int j = 0;

        for(int i= a.length-1; i>=0; i--){
            resultArray[j++] = a[i];
        }

        return resultArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{1,2,3,4,5})));
    }
}
