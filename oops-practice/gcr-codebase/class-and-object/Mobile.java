
class MobilePhone{
    private String brand;
    private String model;
    private float price;

    MobilePhone(String brand,String model,float price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void display(){
        System.out.println("Brand of mobile:"+brand.toUpperCase());
        System.out.println("Model of mobile:"+model.toUpperCase());
        System.out.println("Price of mobile:"+price);
        System.out.println("-------------------------");
    }
}
public class Mobile {
    public static void main(String[] args) {
        MobilePhone Jatin = new MobilePhone("IQOO","Neo 7 pro",36000);
        MobilePhone Chhail = new MobilePhone("MotoRola","Edge 30",58000);
        MobilePhone Vishal = new MobilePhone("VIVO","z1x",21000);
        Jatin.display();
        Chhail.display();
        Vishal.display();
    }
}
