package lessonSix_taskOne;

 class Car extends Vehicle{
    private int passengers;

    public Car(int maxSpeed,int passengers) {
        super(maxSpeed);
        this.passengers=passengers;
    }

     @Override
     public void move() {
         if(fuel>=2){
             fuel=fuel-2;
             int distance = speed*1;
             System.out.println("Автомобиль проехал " + distance + " км. Остаток топлива:"  + fuel + " л.");
         }
         else {
             System.out.println("Недостаточно топлива");
         }
     }
 }
