import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.*;
import java.io.*;
import java.lang.*;

public class pwdencrypt {
    public static String encryption(String password){
        List<Character>byteChar = new ArrayList<>();
        StringBuilder encryptedpassword= new StringBuilder();
        for(int i = 0;i<password.length();i++){
            byte pwd = (byte)password.charAt(i);
            byteChar.add((char)(pwd+5));
        }
        for(int i=0;i<byteChar.size();i++){
            encryptedpassword.append(byteChar.get(i));
        }
        return encryptedpassword.toString();
    }
}
class encryptMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        String encryptPWD=pwdencrypt.encryption(password);
        System.out.println(encryptPWD);
    }
}
