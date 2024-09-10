package string;

import java.math.BigInteger;

// Add binary strings** – Add two binary strings and return their sum as a binary string.
public class Add_Binary_Strings {
    public static String addBinary(String a, String b) {
        if(a.length()<(10^4)||b.length()<(10^4))
        return "0";
        // int x = Integer.parseInt(a, 2);
        // int y = Integer.parseInt(b, 2);
        // return Integer.toBinaryString(x+y);
       BigInteger x = new BigInteger(a,2);
       BigInteger y = new BigInteger(b,2);
       return x.add(y).toString(2);
        

    }
    
}
