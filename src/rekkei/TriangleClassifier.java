package rekkei;

import java.util.Scanner;

public class TriangleClassifier {
    static Scanner sc = new Scanner(System.in);
    public static String triangle(int a, int b, int c){
        if(a>0 && b>0 && c>0){
            if(a==b&&b==c){
                return "tam giac deu";
            } else if (a==b || b == c || c == a) {
                return "tam giac can";
            } else if (a+b > c || b+c >a || a+c > b) {
                return "tam giac thuong";
            }else {
                return "khong phai tam giac";
            }
        }else {
            return "khong phai tam giac";
        }
    }
}
