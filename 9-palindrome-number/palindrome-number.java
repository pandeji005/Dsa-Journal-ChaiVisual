class Solution {
    public boolean isPalindrome(int x) {
        int rev = x;
        int sum=0;
        while(x>0){
            sum=sum*10 + (x%10);
            x=x/10;
        }
        return rev==sum;
        
    }
}