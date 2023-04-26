import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Enetr the no form 1to 10:-");
        num = sc.nextInt();

        switch (num) {
            case 1:
            case 3:
            case 5:
            case 9:
                System.out.println("ODD");
                break;
            case 2:
            case 4:
            case 8:
            case 6:
                System.out.println("EVEN");

        }
    }

}
