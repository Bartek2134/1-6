import java.util.Scanner;

public class Main{

    public static void main(String [] args){
        Scanner wpisz = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int a = wpisz.nextInt();
        if(liczbaPierwsza(a)==true)
            System.out.println("Twoja liczba jest liczba pierwsza");
        else
            System.out.println("To nie liczba pierwsza");
    }
    public static boolean liczbaPierwsza(int liczba){
        if(liczba<2){
            return false;
        }
        int i;
        for(i=2;i<=liczba/2;i++) {

            if(liczba%i==0)
                return false;
        }
        return true;
    }
}