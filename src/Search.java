public class Search {

    static int searchChar(String str, char c){

        char[] charArr = str.toLowerCase().toCharArray();
        int count = 0;

        for(int i=0; i<charArr.length; i++){
            if(charArr[i] == c){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(searchChar("Hello World", 'H'));
    }
}
