/*
    git init
    git add .
    git commit -m "solution"
    git push 
*/

class Solution {
    
    public static Boolean isPerm(String s1) {
        int[] intArray = new int[128];
        int count = 0;
        
        for(int i=0; i<s1.length(); i++) {
            if(s1.charAt(i) != ' ') {
                intArray[s1.charAt(i)] = intArray[s1.charAt(i)] + 1;
            }
        }
        
        for(int i=0; i<s1.length(); i++) {
            if(intArray[s1.charAt(i)]%2 == 1) {
                count++;
                if(count > 1) { return false; }
            }
        }
        
        return true;
    }
        
    
  public static void main(String[] args) {
      String s1 = "tactcoapaapa";
      String s2 = "taco cat";
      System.out.println(isPerm(s2));
  }
}
