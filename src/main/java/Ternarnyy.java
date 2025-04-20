public class Ternarnyy {
    public static void main(String[] args) {
        int a =-2;

        String result= (a>=0)?
                ((a==0)? "0":"1"):
                "-1";

        System.out.println(result);

        int b=3;
        int c=8;
        int max=(b>c)?b:c;
        System.out.println(max);





    }
}
