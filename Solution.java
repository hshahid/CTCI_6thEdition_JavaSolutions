/*
    git init
    git add .
    git commit -m "solution"
    git push 
*/

class Solution {
    
    public static boolean checkPerm(String s1, String s2) {
        //length
        //add to int array
        //if element is smaller than 0, then return false
        int[] intArray = new int[128];
        
        if(s1.length() != s2.length()) { return false; }
        
        for (int i=0; i<s1.length(); i++) {
            intArray[s1.charAt(i)] += 1;
        }
        
        for (int i=0; i<s2.length(); i++) {
                intArray[s2.charAt(i)] =  intArray[s2.charAt(i)] - 1;
            if (intArray[s2.charAt(i)] < 0) {
                return false;
            }
                                  
        }
        
        return true;
    }
        
    
  public static void main(String[] args) {
      String s1 = "ratt";
      String s2 = "ttar";
      System.out.println(checkPerm(s1, s2));
  }
}
