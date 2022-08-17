public class SelfReferential {

    static int isSelfReferential(int[ ] a){
        int count = 0;
        int i=0;
        boolean isSelfReferential = false;
        while (i<a.length) {
            for (int k : a) {
                if (i == k) {
                    count++;
                }
                if (count == k) {
                    isSelfReferential = true;
                }else {
                    isSelfReferential = false;
                }
            }
            count = 0;
            i++;
        }

        if(isSelfReferential)
            return 1;
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(isSelfReferential(new int[]{1,2,1,0}));
        System.out.println(isSelfReferential(new int[]{2, 0, 2, 0}));
        System.out.println(isSelfReferential(new int[]{2, 1, 2, 0, 0}));
        System.out.println(isSelfReferential(new int[]{ 2, 0, 0}));
        System.out.println(isSelfReferential(new int[]{3, 2, 1, 1, 0, 0, 2}));
        System.out.println(isSelfReferential(new int[]{4, 2, 1, 0, 1, 0, 0, 0}));
        System.out.println(isSelfReferential(new int[]{5, 2, 1, 0, 0, 1, 0, 0, 0}));
        System.out.println(isSelfReferential(new int[]{6, 2, 1, 0, 0, 0, 1, 0, 0, 0}));

    }
}
