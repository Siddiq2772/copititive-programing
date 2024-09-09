package string;
//- **Day 93: Longest uncommon subsequence** – Identify the longest uncommon subsequence between two strings.
public class Longest_uncommon_sequence_1 {
    
    public static int  findLUSlength(String a, String b) {
        if(!a.equals(b))
            return a.length()<b.length()?b.length():a.length();
        else
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(findLUSlength("aaa","aab"));
    }
}

