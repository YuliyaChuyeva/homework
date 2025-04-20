public class Product {
    private String name;
    private double price;
    private int quantity;

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setPrice(double price){
        if(price>0){
            this.price=price;
        }
        else {
            System.out.println("Invalid");
        }
    }

    public void setQuantity(int quantity){
        if(quantity>=0){
            this.quantity=quantity;
        }
        else {
            System.out.println("Invalid quantity");
        }
    }

    public void setName(String name){
        if (name!= null || !name.equals("")){
            this.name=name;
        }
        else {
            System.out.println("Invalid name");
        }
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Milk");
        product.setPrice(12.2);
        product.setQuantity(3);
        System.out.println(product.getName() + " "+ product.getPrice() + " " + product.getQuantity());
    }

}
