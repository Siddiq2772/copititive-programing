package string;
//**Day 80: Length of last word** – Find the length of the last word in a string.
public class Length_of_last_word {
    public static void main(String[] args) {
       String str = "my name is siddique";
       // logic 1
       String[] wo = str.split(" ");
       System.out.println("length of last word "+wo[wo.length-1].length()); 

       //logic 2
       StringBuffer str2 = new StringBuffer(str);
       int num = 0;
       for (char s : str2.reverse().toString().toCharArray()) {
         while (s!=' ') {
            num++;
         }
         System.out.println(" 2 length of last word "+ num);
         break;
       }
    }
    
}
