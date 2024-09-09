package string;
//Jewels and stones** – Count how many stones are jewels based on two string inputs.
public class Stone_in_jewels {
    public static void main(String[] args) {
      String  J = "z",
                S = "ZZZZZz";
        int i=0,j=0;
        while (i<J.length()) {
            for (char c : S.toCharArray()) {
                if(J.charAt(i)==c)
                j++;
            }
            i++;
        }
        if (i==J.length()) {
            System.out.println(j);
        }
    }
}
