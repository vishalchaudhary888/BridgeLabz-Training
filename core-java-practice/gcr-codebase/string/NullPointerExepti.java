public class NullPointerExepti {
    public static void main(String[] args) {
        String Str = null;
        try{
            System.out.print(Str.length());
        }
        catch (NullPointerException e){
            System.out.println("String has nothing in it");
        }
    }
}
