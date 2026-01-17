class Solution2{
    public boolean isPowerOfTwo(int n) {
        long num=1;
        while(num < n){
            num = num*2;
        }
        return num == n ? true : false;
    }
}

public class PowerOfTwo {
    public static void main(String[] args) {
        Solution2 pow = new Solution2();
        System.out.println(pow.isPowerOfTwo(2561));
    }
}
