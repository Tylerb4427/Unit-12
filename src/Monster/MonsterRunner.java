package Monster;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        Zombie mons1 = new Zombie(makeSize(1, keyboard), makeName(1, keyboard));
        Skeleton mons2 = new Skeleton(makeSize(2, keyboard), makeName(2, keyboard));
        System.out.println("Monster 1- " + mons1.toString());
        System.out.println("Monster 2- " + mons2.toString());
        if (mons1.isBigger(mons2)) {
            System.out.println("Monster 1 is bigger than Monster 2");
        } else if (mons1.isSmaller(mons2)) {
            System.out.println("Monster 1 is smaller than Monster 2");
        }
        if (mons1.namesTheSame(mons2)) {
            System.out.println("Monster 1 has the same name as Monster 2");
        } else {
            System.out.println("Monster 1 does not have the same name as Monster 2");
        }

    }

    public static int makeSize(int num, Scanner keyboard) {
        System.out.print("Enter monster " + num + "'s size:: ");
        return keyboard.nextInt();
    }

    public static String makeName(int num, Scanner keyboard) {
        System.out.print("Enter monster " + num + "'s name:: ");
        keyboard.nextLine();
        return keyboard.nextLine();
    }
}
