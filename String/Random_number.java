import java.util.Random;

public class Random_number {
   public static void main(String[] args) {
    Random rd=new Random();
    int num=rd.nextInt(100);
    System.out.println(num);
   } 
}
