public class Split {
    public static char[] split(String str){
        char[] Array = new char[Length.length(str)];
        for(int i=0;i<Array.length;i++){
            Array[i] = str.charAt(i);
        }
        return Array;
    }
}
