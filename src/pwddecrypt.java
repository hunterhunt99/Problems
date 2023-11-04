import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.*;
import java.io.*;
import java.lang.*;

public class pwddecrypt {
    public static String decryption(String password){
        List<Character>byteChar = new ArrayList<>();
        StringBuilder decryptedpassword= new StringBuilder();
        for(int i = 0;i<password.length();i++){
            byte pwd = (byte)password.charAt(i);
            byteChar.add((char)(pwd-5));
        }
        for(int i=0;i<byteChar.size();i++){
            decryptedpassword.append(byteChar.get(i));
        }
        return decryptedpassword.toString();
    }
}
class dycryptMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        String encryptPWD=pwddecrypt.decryption(password);
        System.out.println(encryptPWD);
    }
}
