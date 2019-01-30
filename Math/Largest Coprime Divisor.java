public class Solution {
    public int cpFact(int A, int B) {
        // int gc = gcd(A,B);
        // int cpf = A / gcd(A,B);
        // // System.out.println(cpf);
        // int gcOfB = gcd(B,cpf);
        // // System.out.println(gcOfB);
        // if (gcOfB == 1);
            // return cpf;
         while (gcd(A, B) != 1) { 
            A = A / gcd(A, B); 
        } 
        return A; 
    }
    
    public int gcd(int A, int B){
        if (B==0)
            return A;
        return gcd(Math.min(A,B) , Math.max(A,B)%Math.min(A,B) ) ;
    }
}

