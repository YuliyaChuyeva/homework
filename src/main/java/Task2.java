public class Task2 {
    public static void main(String[] args) {
        String month = "November";
        int length = month.length();
        char first = month.charAt(0);
        char last = month.charAt(length-1);
        String f = month.substring(1,length-1);

        String finalMonth = last+ f+ first;
        System.out.println(finalMonth);




    }
}
