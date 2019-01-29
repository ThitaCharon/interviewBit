public class Solution {
    public ArrayList<Integer> primesum(int A) {
        
        ArrayList<Integer> index = new ArrayList<Integer>();
        ArrayList<Integer> prime = sieves(A);
        // System.out.println("A is " +A);
        for (int n=0; n<prime.size() ;n++){
            for(int m=0; m<prime.size(); m++){
                if (prime.get(n) + prime.get(m) == A){
                    index.add(prime.get(n));
                    index.add(prime.get(m));
                    // System.out.println("(" + prime.get(n) + "," + prime.get(m) +")");
                    return index;
                }
            }
        }
        return index;
    }
    
    public ArrayList<Integer> sieves(int A){
        ArrayList<Integer> primeFactor = new ArrayList<Integer>();
        int [] isPrime = new int [A+1];
        Arrays.fill(isPrime,1);
        
        for (int i=2; i<A+1; i++){
            if (isPrime[i] == 1){
                for(int j=2; j*i<A+1; j++){
                    isPrime[j*i] = 0;
                }
            }
        }
        
        for (int i=2; i<A+1; i++) {
            if(isPrime[i]==1){
                primeFactor.add(i);
            }
        }
  
        return primeFactor;
    }
}
