
package um.myum.test2;

import java.util.Scanner;


public class W05E02 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int x=0;
        int y=0;
        while(true){
            System.out.println("Enter a no. : ");
            x= inp.nextInt();
            if(x==0)
                break;
            else
                y =y+x;
            
        }
        System.out.println("Sum is : "+y);
    }
    
}
