public class ListBox<T>{
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ListBox<String> listBox = new ListBox<>();
        listBox.setName("banana");
        ListBox<Integer> listBox1 = new ListBox<>();
        listBox1.setName(123);
        System.out.println(listBox.getName());
        System.out.println(listBox1.getName());
    }
}
