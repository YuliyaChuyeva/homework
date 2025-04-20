public class Printer {

    public void print(String string){
        System.out.println(string);
    }

    public void print(int a){
        System.out.println(a);
    }

    public void print(String s, String s2){
        System.out.println(s + " " + s2);
    }

    public void print(String s, int s2){
        System.out.println(s + " " + s2);
    }
    public void print( int s2, String s){
        System.out.println(s + " " + s2);
    }
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello");
        printer.print(1);
        printer.print("My name ","is Julia" );
    }
}
