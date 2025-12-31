
class Items{
    private String itemCode;
    private String itemName;
    private float price;

    Items(String itemCode,String itemName,float price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItems(){
        System.out.println("itemCode:"+itemCode);
        System.out.println("itemPrice:"+price);
        System.out.println("itemName:"+itemName);
        System.out.println("--------------------");
    }
}
public class ItemsDetails {
    public static void main(String[] args) {
        Items item1 = new Items("01AA","Water Bottle",500);
        Items item2 = new Items("01BB","Rice",700);
        Items item3 = new Items("02AA","Black board",400);
        item1.displayItems();
        item2.displayItems();
        item3.displayItems();
    }
}
