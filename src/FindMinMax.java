public class FindMinMax {

    static int findMinMax(int[] a){
        int min = a[0];
        int max = a[0];

        for(int i=1; i<a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
            if(a[i] > max){
                max = a[i];
            }
        }

        System.out.println(min + "," + max);

        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMinMax(new int[]{1,2,3,4,5,6}));
    }
}
