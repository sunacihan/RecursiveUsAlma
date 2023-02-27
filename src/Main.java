import java.util.Scanner;

public class Main {
    static int us(int alt, int us){
        if(us<=1)
            return alt;
        us--;
        return alt*us(alt,us);

    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz:");
        int alt=input.nextInt();
        System.out.print("Üssü giriniz:");
        int us=input.nextInt();

        System.out.println("Sonuç:"+us(alt,us));
    }
}