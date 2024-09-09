package string;
import java.util.*;
//- **Day 97: Repeated DNA sequence** – Identify repeated DNA sequences (substrings) of length 10.
public class Repeated_DNA_sequence {
    public static List<String> findRepeatedDnaSequences(String s) {
     List<String> list = new ArrayList<>();
     List<String> ans = new ArrayList<>();
        for (int j=0;j<s.length();j++) {
            int len=j,i=0;
            String temp ="";
            while (len<s.length()&&i<10) {
                temp+=s.charAt(len);
                len++;
                i++;
                
            }
            if(temp.length()!=10)
            break;
            list.add(temp);
            
        }

        for (int i = 0; i < list.size(); i++) {
            int j =i+1;
            while (j<list.size()) {
                if(list.get(i).equals(list.get(j))&&!ans.contains(list.get(i)))
                 ans.add(list.get(i));
                 j++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }
}

// public List<String> findRepeatedDnaSequences(String s) {
//     Set seen = new HashSet(), repeated = new HashSet();
//     for (int i = 0; i + 9 < s.length(); i++) {
//         String ten = s.substring(i, i + 10);
//         if (!seen.add(ten))
//             repeated.add(ten);
//     }
//     return new ArrayList(repeated);
// }