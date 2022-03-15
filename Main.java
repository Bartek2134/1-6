import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  System.out.print("Podaj liczbe: ");
    Scanner wpisz = new Scanner(System.in);
      int liczba;
      liczba = wpisz.nextInt();
    if(sprawdzCzyPierwsza(liczba)==true)
      System.out.println("To liczba pierwsza");
    else  
      System.out.println("To nie liczba pierwsza");
  }
}
public static boolean sprawdzCzyPierwsza(int liczba){
  if(liczba<0)
    return false;
}