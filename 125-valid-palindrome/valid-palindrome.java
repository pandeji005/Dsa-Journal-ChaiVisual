class Solution {
    public boolean isPalindrome(String s) {

        String p = s.toLowerCase();
        
        int l = 0;
        int r = p.length()-1;

        while(l<r){
            if(!Character.isLetterOrDigit(p.charAt(l))) l++;
            else if(!Character.isLetterOrDigit(p.charAt(r))) r--;
            else if(p.charAt(l)!=p.charAt(r)) return false;
            else{
                l++;
                r--;
            }

            
        }
        return true;
            
        
    }
}