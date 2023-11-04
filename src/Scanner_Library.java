import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Scanner_Library {
    public static List<Integer> scanValue(){
        Scanner scan = new Scanner(System.in);
        List<Integer> newList = new ArrayList<>(10);
        for(int i=0;i<10;i++){
            newList.add(scan.nextInt());
        }
        return newList;
    }
}

class ScannerMain{
    public static void main(String[] args){
        System.out.println(Scanner_Library.scanValue());
    }
}
