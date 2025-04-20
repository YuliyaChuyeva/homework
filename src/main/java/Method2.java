public class Method2 {
    public static void main(String[] args) {
        System.out.println(isEven(6));
        System.out.println(isEven(17));
        System.out.println(isEven(19));
    }

    private static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}
