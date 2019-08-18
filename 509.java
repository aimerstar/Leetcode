// Fibonacci numbers
class Solution {
    public int fib(int N) {
        return F(N);
    }
    
    private int F(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else if(n>1){
            return F(n-1)+F(n-2);
        }
        return 0;
    }
}
