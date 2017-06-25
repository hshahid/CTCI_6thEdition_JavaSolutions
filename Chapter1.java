/* CTCI 6th Edition Chapter 1: Arrays & Strings Solutions
    Hashma Shahid
*/


//1.1

public static boolean isUnique(String s) {
    Set<Character> set = new HashSet<Character>();
    
    for(int i = 0; i<s.length();i++) {
      if(set.contains(s.charAt(i))) {
        return false;
      }
      
      set.add(s.charAt(i));
    }
    
    return true;
  }