public class PowerNumber {

    static int power(int base, int exponent){
        int result = 1;
        for(int i=1; i<=exponent; i++){
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(5, 3));
    }
}
