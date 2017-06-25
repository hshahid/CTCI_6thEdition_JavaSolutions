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

//1.2
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

//1.3
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