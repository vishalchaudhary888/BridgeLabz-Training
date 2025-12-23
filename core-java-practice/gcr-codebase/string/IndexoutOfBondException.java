public class IndexoutOfBondException {
    public static void main(String[] args) {
        String Str = "Welcome to Capgemini!!";
        try{
            System.out.print(Str.charAt(100));
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.print("Index is out of the bond!!");
        }
    }
}
