package homeWorkTwentyFive;


public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.second = second;
        this.first = first;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(122, "chips");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
