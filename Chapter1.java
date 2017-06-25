/* CTCI 6th Edition Chapter 1: Arrays & Strings Solutions
    Hashma Shahid
*/


//1.1
//a. With Hashtable
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

//b. with array
public static boolean isUnique(String s1) {
    
    boolean[] bool = new boolean[128];
    
    for (int i=0; i<s1.length();i++) {
        if(bool[s1.charAt(i)] == true) { return false; } else {
            bool[s1.charAt(i)] = true;
        }
    }
        return true;
}