// Prog4: Write a program to concatenate 2 strings in java. Concatenation is performed in such a way that reverse of 1st string is joined with reverse of 2nd string.
// Input: Hello, World
// Output olleHdlroW

public class pc {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        String str3 = str1.concat(str2);

        System.out.println(str3);

        StringBuffer sb = new StringBuffer(str1);

        sb.reverse();

        StringBuffer sb1 = new StringBuffer(str2);

        sb1.reverse();

        System.out.println(sb);
        System.out.println(sb1);
        //StringBuffer sb3=sb+sb1;
        System.out.println(sb.append(sb1));
        }

    

    

}

