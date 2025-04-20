package task_two;

public class Cycle extends Shape{

    private int radius;

    public Cycle(String color,int radius) {
        super(color);
        this.radius=radius;
    }

    @Override
    public double getArea(){
        return radius*radius*3.14;
    }


}
