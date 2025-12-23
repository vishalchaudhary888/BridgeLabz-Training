import java.util.Scanner;

public class VowelConsonentInLetter {
    //Methode to find the Vowel and Consonant
    public static void FindVandC(char[] Array){
        for(int i=0;i<Array.length;i++){
            if(Array[i]=='a' || Array[i]=='e' || Array[i] =='i'|| Array[i]=='o'|| Array[i]=='u'){
                System.out.println(Array[i]+"    It's a Vowel");
            }
            else{
                System.out.println(Array[i]+"    It's a Consonant");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine().toLowerCase();
        char[] Array = Split.split(Str);
        FindVandC(Array);

    }
}
