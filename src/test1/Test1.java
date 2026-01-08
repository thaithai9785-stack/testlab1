
package test1;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        String partern="[CcGgKk]\\d{4}";
        String data;
        boolean lap=true;
        
        Scanner nd1= new Scanner(System.in);
        
        do {
            System.out.println("hay nhập mã khách hàng: ");
            data= nd1.nextLine();
            
            if(data.matches(partern))
            
        } while (lap);
        
    }
    
}
