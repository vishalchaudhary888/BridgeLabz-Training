public class Length {
    public static int length(String Str){
        int length = 0;
        try {
            while (true) {
                Str.charAt(length);
                length++;
            }
        }
        catch (StringIndexOutOfBoundsException e){
            return length;
        }
    }

}
