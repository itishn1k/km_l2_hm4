import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Список a, Введите что угодно №" + (i + 1) + ": ");
            a.add(scanner.nextLine());
        }

        System.out.println(a);

        for (int i = 0; i < 5; i++) {
            System.out.print(" Список B, Введите что угодно №" + (i + 1) + ": ");
            b.add(scanner.nextLine());
        }
        System.out.println(b);
        Collections.reverse(b);

        int x = 0;
        while (c.size() < a.size() + b.size()) {
            c.add(a.get(x));
            c.add(b.get(x));
            x++;
        }

        System.out.println(c + "\n");

        c.sort(Comparator.comparingInt(String::length));
        System.out.println(c);
    }
}