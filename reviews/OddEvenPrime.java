import java.util.Arrays;

public class OddEvenPrime{
    public static boolean IsPrime(int number){
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] EvenOddPrime = new int[9];
        int EvenOddIndex = 0;
        int[] EvenNumbers = new int[10];
        int EvenIndex = 0;
        int[] OddNumbers = new int[11];
        int OddIndex = 0;
        for(int i=1;i<=20;i++){
            if(IsPrime(i)){
                EvenOddPrime[EvenOddIndex] = i;
                EvenOddIndex++;
            }
            if(i%2!=0){
                EvenNumbers[EvenIndex] = i;
                EvenIndex++;
            }
            else{
                OddNumbers[OddIndex] = i;
                OddIndex++;
            }
        }
        System.out.println("Prime Numbers: "+Arrays.toString(EvenOddPrime));
        System.out.println("Even Numbers: "+Arrays.toString(OddNumbers));
        System.out.println("Odd Numbers: "+Arrays.toString(EvenNumbers));

    }
}

