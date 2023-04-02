class Solution {
    public boolean isPalindrome(int x) {
        int inc = 1;
        char[] xCharArr = String.valueOf(x).toCharArray(); 
        for(char c : xCharArr){
            if(c == xCharArr[xCharArr.length-inc]){
            inc++;
            }else{
                return false;
            }
        }
        return true;
    }
}
