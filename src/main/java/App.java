import java.util.Scanner;
import java.lang.String;

public class App {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    public static final char str = 0;
    public static final char count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi bất kỳ : ");
        String s = sc.nextLine();
        System.out.println("Chuỗi vừa nhập là: \n" + s);
        System.out.println("Chuỗi có các chữ IN HOA là: " + printUppercaseInString(s));
        String str = s;
        System.out.print("Chuỗi đã nhập có các ký tự không phải số là: " + printNonNumbericInString(s));
        System.out.print("\nTổng số từ của chuỗi đã nhập là: " + countWords(s));
    }

    public static String printUppercaseInString(String s) {
        String rs = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                rs = rs + s.charAt(i);
            }
        }
        return rs;
    }

    public static String printNonNumbericInString(String s) {
        Scanner sc = new Scanner(System.in);
        for(char c = '0'; c <= '9';c++) {
            s = s.replace(c + "", "");
        }
        return s;
    }

    public static int printCInString(String s) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                answer ++;
            }
            System.out.print(answer);
        }
        return answer;
    }

    public static int countWords(String input) {
        if (input == null) {
            return -1;
        }
        int count = 0;
        int size = input.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB
                    && input.charAt(i) != BREAK_LINE) {
                    count++;
                if(notCounted) {
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }

}
