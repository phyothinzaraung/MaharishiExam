public class MartianArray {

    static int isMartian(int[ ] a){
        if(a.length == 0) {
            return 0;
        }

        if(a.length == 1 && a[0] != 1){
            return 0;
        }

        int oneCount = 0;
        int twoCount = 0;
        for(int i=0; i<a.length; i++){
            if(i<a.length-1){
                if(a[i] == a[i+1]){
                    return 0;
                }
            }
            if(a[i]==1){
                oneCount++;
            }
            if(a[i]==2){
                twoCount++;
            }
        }

        if(oneCount <= twoCount){
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMartian(new int[]{1, 3}));
        System.out.println(isMartian(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}));
        System.out.println(isMartian(new int[]{1, 3, 2}));
        System.out.println(isMartian(new int[]{1, 3, 3, 2, 1}));
        System.out.println(isMartian(new int[]{1, 2, -18, -18, 1, 2}));
        System.out.println(isMartian(new int[]{}));
        System.out.println(isMartian(new int[]{1}));
        System.out.println(isMartian(new int[]{2}));

    }
}
