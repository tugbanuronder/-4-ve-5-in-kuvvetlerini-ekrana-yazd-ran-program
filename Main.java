import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi,i=0,k=0;

        System.out.print("Sınır giriniz:");
        sayi=input.nextInt();

        System.out.println("4'ün katları:");
        for(i=1 ; i<=sayi ;i *= 4){
            System.out.println(+i);
        }

        System.out.println("5'in katları:");
        for(k=1 ; k<=sayi ;k *= 5){
            System.out.println(k);
        }

    }
}