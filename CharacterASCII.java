import java.util.Scanner;
public class CharacterASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch + " = " + (int) ch);
        }
        sc.close();
    }
}
OUTPUT:
Enter a string: KAVERI
K = 75
A = 65
V = 86
E = 69
R = 82
I = 73
