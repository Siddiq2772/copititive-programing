package string;
//Find the difference** – Identify the extra character in a modified version of a string.
public class Find_the_difference {
    public static void main(String[] args) {

        String s1 ="my name is siddiq",//old array
               s2 = "my name is mohd siddique";//new array

        char[] a1 =s1.toCharArray(),
                a2 = s2.toCharArray();
            System.out.println("modified characters: ");
        for (int i = 0; i <a2.length; i++) {
            if(i<a1.length){
                if((a1[i]!=a2[i]))
                    System.out.println(a2[i]+"  ");
            }else
                System.out.println(a2[i]+"  ");
                
                
                
        }
    }
    
}
