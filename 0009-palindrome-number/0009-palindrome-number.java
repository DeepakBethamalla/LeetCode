class Solution {
    public boolean isPalindrome(int x) {
       String y = String.valueOf(x);
        int start =0;
        int end = y.length()-1;
        while(start<end){
            if(y.charAt(start) != y.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }

        }
        return true;
       
    }

}