
import java.util.Scanner;

public class harsad_num {

    public static int fibinachi(int num){

        int data=0;
        int a=0;
        int b=1;
        if(num==0 || num==1){
           return  num; 
        }

        for(int i=2;i<=num;i++){

            data+=a+b;
            System.out.println(data);
            a=b;
            b=data;

        }
    

        return data;



    }
   public static void main(String[] args) {


int fibdata=fibinachi(5);
System.out.println(fibdata);

    

   } 
}
