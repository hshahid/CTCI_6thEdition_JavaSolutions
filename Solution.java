/*
    git init
    git add .
    git commit -m "solution"
    git push 
*/







class Solution {
    
    public static boolean isUnique(String s1) {
    
    boolean[] bool = new boolean[128];
    
    for (int i=0; i<s1.length();i++) {
        if(bool[s1.charAt(i)] == true) { return false; } else {
            bool[s1.charAt(i)] = true;
        }
    }
        return true;
    }
    
  public static void main(String[] args) {
      String input = "hashma";
      System.out.println(isUnique(input));
  }
}
