public class Programmieraufgabe5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}






/*

*
**
***
****
*****
****
***
**
*
Verwenden Sie Schleifen etc. - geben Sie nicht einfach explizit mit 9 System.out.println die Zeilen aus!
 */