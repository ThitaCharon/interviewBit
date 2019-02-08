public class Solution {
    private static final int M = 1000003;

    public int findRank(String S) {
        // int M = 1000003;
        int rank = 1;
        int len = S.length();
        int mul = fact(len);

        for (int i = 0; i < len; i++) {
            // int smallInRight = smallerPosition(S , i, len-1);
            // mul /= len-i;
            // rank += smallInRight * mul;
            rank += smallerPosition(S, i, len - 1) * fact(len - i - 1);
            rank %= M;
        }

        return rank;
    }

    public int smallerPosition(String S, int check, int end) {

        int countSmall = 0;
        for (int i = check + 1; i <= end; i++) {
            if (S.charAt(i) < S.charAt(check)) {
                countSmall++;
            }
        }
        return countSmall;
    }

    // public long factorial(int n){
    // return n <= 1? 1: (n * factorial(n - 1))%M;
    // }

    private static int fact(int n) {
        int mod = 1000003;
        if ((n == 0) || (n == 1)) {
            return (1);
        }
        if (n < 0) {
            n = -n;
        }
        int f = 1;
        while (n > 0) {

            f = (f * n) % M;
            n -= 1;

        }
        return (f);

    }
}
