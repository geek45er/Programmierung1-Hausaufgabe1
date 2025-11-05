import java.util.Scanner;

public class Programmieraufgabe7 {

public static int getMax(int a, int b, int c) {
    int max = a;
    if (b > max ) {
        max = b;
    } {
    if (c > max)
        max = c;
}
    return max;
}
    public static void main(String[] args) {
    System.out.println(getMax(23, 56, 99));
    System.out.println(getMax(-232323, 2323232, 5345345));
    }
}












/*

Implementieren Sie in der Datei src/Programmieraufgabe7.java eine Methode public static int getMax(int a, int b, int c),
welche die größte der drei übergebenen Zahlen zurückgibt. Sie können gerne auch eine public static void main(String[] args) implementieren,
in der Sie unterschiedliche Aufrufe von getMax testen, aber Sie müssen es nicht tun - die Tests überprüfen nur, ob die Methode da ist und sich korrekt verhält.
 */