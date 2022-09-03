import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        double  kdv,kdvo,tutar,kdvlitutar;
        System.out.println("Tutarı giriniz");
        tutar=inp.nextDouble();
        kdvo= tutar>1000 ? 0.08 : 0.18;
        kdv=tutar*kdvo;
        kdvlitutar=kdv+tutar;
        System.out.println("kdv=" + kdv );System.out.println( "kdvlitutar=" + kdvlitutar);

    }
}