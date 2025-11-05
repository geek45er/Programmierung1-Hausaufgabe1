public class Programmieraufgabe6 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) { //link mit aufg. 3
                System.out.println("*.*.*.*.*");
            } else {
                System.out.println(".*.*.*.*.");
            }
        }
    }
}



/*
*.*.*.*.*
.*.*.*.*.
*.*.*.*.*
.*.*.*.*.
*.*.*.*.*
.*.*.*.*.
*.*.*.*.*
.*.*.*.*.
*.*.*.*.*
 gerade = *.
ungerade = .*
8 line breaks

 */