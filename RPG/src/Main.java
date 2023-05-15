import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Archer bob = new Archer(8.0, 20, 0.2);
        Warrior mark = new Warrior(12, 25, 0.4);

        int classe = 0;
        int sottoClasse = 0;
        int move = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("select a class you want to play (in numbers):");
        System.out.println("1] Melee , 2] Ranged, 3] Elementalist");
        classe = scanner.nextInt();

        switch (classe) {
            case 1:
                System.out.println("select a subclass you want to play (in numbers):");
                System.out.println("1] Warrior, 2] Lancer, 3] Tank");
                sottoClasse = scanner.nextInt();
                switch (sottoClasse) {
                    case 1:
                        System.out.println("select a move you want to use ( in numbers)");
                        System.out.println("1] Slash , 2] Heavy slash, 3] ultimate move");
                        move = scanner.nextInt();
                        switch (move) {
                            case 1:

                                System.out.println("damage done = ");
                                mark.slash();
                                break;
                            case 2:
                                System.out.println("damage done = ");
                                mark.heavySlash();
                                break;
                            case 3:
                                System.out.println("damage done = ");
                                mark.ultimateMove();
                                break;
                        }
                    case 2:
                    case 3:
                }

            case 2:
                System.out.println("select a subclass you want to play (in numbers):");
                System.out.println("1] Archer, 2] Ninja, 3] Sniper");
                sottoClasse = scanner.nextInt();
                switch (sottoClasse) {
                    case 1:
                        System.out.println("select a move you want to use ( in numbers)");
                        System.out.println("1] Shot , 2] Multishot, 3] ultimate move");
                        move = scanner.nextInt();
                        switch (move) {
                            case 1:

                                System.out.println("damage done = ");
                                bob.shot();
                                break;
                            case 2:
                                System.out.println("damage done = ");
                                bob.multiShot();
                                break;
                            case 3:
                                System.out.println("damage done = ");
                                bob.ultimateMove();
                                break;
                        }

                    case 3:
                }

        }
    }
}








