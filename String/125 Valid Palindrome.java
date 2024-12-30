// Two pointer
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        for(int i=0;i<s.length()/2;i++){
            if(!s.substring(i,i+1).equals(s.substring(s.length()-i-1,s.length()-i))){
                return false;
            }
        }
        return true;
    }
}