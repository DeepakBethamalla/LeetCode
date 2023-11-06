class Solution {
    public boolean isPalindrome(String s) {
        String cs = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = cs.length()-1;
        while(left < right){
            if(cs.charAt(left) != cs.charAt(right)){
                return false;
            }else{
                left ++;
                right --;
            }
        }
        return true;
    }
}