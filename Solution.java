/*
    git init
    git add .
    git commit -m "solution"
    git push 
*/

class Solution {
    
    public static String add20(String s1, int len) {
    
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i < s1.length(); i++) {
            if(s1.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(s1.charAt(i));
            }
        }
        
        return sb.toString();
    }
        
    
  public static void main(String[] args) {
      String s1 = "rat poison is ew ";
      String s2 = "ttar";
      System.out.println(add20(s1, 13));
  }
}
