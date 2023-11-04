/**
 * Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.
 *
 * To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.
 */

/**
 * Problem Statement
 *
 * Every line of input will contain a String followed by an integer.
 * Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.
 */

/**
 * Output Format
 *
 * In each line of output there should be two columns:
 * The first column contains the String and is left justified using exactly 15  characters.
 * The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
 */
/**
 * Input Values
 *
 * java 100
 * cpp 65
 * python 50
 *
 * Output Format
 *
 * ================================
 * java           100
 * cpp            065
 * python         050
 * ================================
 */

import java.util.Scanner;

public class Output_Formatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n",s1,x);
            /*   String s2=" ";
                String s3="";
                for(int j=1;j<=(15-s1.length());j++){
                    s3+=s2;
                }
                String value= String.valueOf(x);
                String number="";
                if(value.length()<3){
                    for(int k=0;k<(3-value.length());k++){
                        number=number+"0";
                    }
                    value=number+value;
                }

                System.out.println(s1+s3+value);
            }*/
        }
        System.out.println("================================");
    }
}
