import java.util.Scanner;

public class CountVowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine().toLowerCase();
        int VowelCount = 0;
        int ConsonentCount = 0;
        for(int i=0;i<Str.length();i++){
            if(Str.charAt(i)=='a' || Str.charAt(i)=='e' || Str.charAt(i)=='i' || Str.charAt(i)=='o' || Str.charAt(i)=='u'){
                VowelCount++;
            }
            else if(Str.charAt(i)!=' '){
                ConsonentCount++;
            }
        }
        System.out.println("Vowels are: "+VowelCount);
        System.out.println("Consonants are: "+ConsonentCount);

    }
}
