package string;

public class longest_uncommon_sequence_2 {
    public static int findLUSlength(String[] strs) {
        // String min = strs[0];
        // String max ="";
        // for (String str : strs) {
        //     if (min.length()>str.length()) 
        //         min = str;
        // }
        // for (String str : strs) {
        //     if (max.length()<str.length()) 
        //         max = str;
        // }

        // for (int i = 0; i < strs.length; i++) {
        //     if(!min.equals(strs[i])&&!strs[i].contains(min))
        //      return max.length();

        // }
        // return -1;
        // ek to ye hosakta hai ke 
        String temp = strs[0];
        int i;
       for ( i = 1; i < strs.length; i++) {
         if(strs[i].contains(temp)&&!strs[i].equals(temp))
                temp=strs[i]; //agar contain hai par large hai to exchage hogayega
         
       }
       if (i==strs.length&&temp==strs[0]) {
         return -1;//
       } else {
        return temp.length();
       }
    }
}

