import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> mas = new ArrayList<>();


        for (int i = 0; i < num; i++) {
            mas.add(sc.nextInt());
        }

        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++) {
            String spic = sc.nextLine();
            if (spic.equals("Insert")) {
                String[] ins = sc.nextLine().split(" ");
                mas.add(Integer.parseInt(ins[0]), Integer.parseInt(ins[1]));
            } else {
                int removeIndex = Integer.parseInt(sc.nextLine());
                mas.remove(removeIndex);
            }
        }

        for (Integer sap : mas) {
            System.out.print(sap + " ");
        }
    }
}
