package yut.controller;

import yut.model.view.GameMap;
import yut.model.vo.*;

import java.util.Scanner;

public class GameManager {
    public static void main(String[] args) {
        Apeach apeach = null;
        Frodo frodo = null;
        Neo neo = null;
        Ryan ryan = null;
        int playerNums = 0;
        Player[] players = new Player[4];

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("name: ");
            String name = sc.nextLine();
            System.out.println("who will you pick");
            if (apeach == null) {
                System.out.println("0 Apeach");
            }
            if (frodo == null) {
                System.out.println("1 Frodo");
            }
            if (neo == null) {
                System.out.println("2 Neo");
            }
            if (ryan == null) {
                System.out.println("3 Ryan");
            }
            int pick = sc.nextInt();
            sc.nextLine();
            switch (pick) {
                case 0:
                    apeach = new Apeach(name);
                    break;
                case 1:
                    frodo = new Frodo(name);
                    break;
                case 2:
                    neo = new Neo(name);
                    break;
                case 3:
                    ryan = new Ryan(name);
                    break;
                default:
                    System.out.println("잘못쳤으니 처음부터 시작");
                    continue;
            }
            playerNums++;

            if (playerNums > 1) {
                System.out.print("will there be more players? (y/n)");
                char yn = sc.nextLine().charAt(0);

                if (yn == 'n' || yn == 'N') {
                    break;
                }
            }

        } while (true);

        players[0] = apeach;
        players[1] = frodo;
        players[2] = neo;
        players[3] = ryan;
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                System.out.println("players[" + i + "] " + players[i].toString());
            }
        }

        // 선택 끝
        // 지도보이기.
        for (int i = 0; i < players.length; i++) {

        }


    }

    public void display(Player[] players, GameMap map){

        // ○       ○       ○       ○       ○       ○
        // ○                                       ○
        //         ○                       ○
        //             ○               ○
        // ○                   ○                   ○
        //             ○               ○
        // ○                                       ○
        //         ○                       ○
        // ○                                       ○
        // ○       ○       ○       ○       ○       ○

        Object ten = map.itemGrid[10];
        // 첫줄 10 9 8 7 6 5
        System.out.printf("○       ○       ○       ○       ○       ○\n");
        // 둘째줄 11 4
        System.out.printf("○                                       ○\n");
        // 25 20
        System.out.printf("        ○                       ○\n");
        // 26 21
        System.out.printf("            ○               ○\n");
        // 12 22 3
        System.out.printf("○                   ○                   ○\n");
        // 23 27
        System.out.printf("            ○               ○\n");
        // 13 2
        System.out.printf("○                                       ○\n");
        // 24 28
        System.out.printf("        ○                       ○\n");
        // 14 1
        System.out.printf("○                                       ○\n");
        // 15 16 17 18 19 0
        System.out.printf("○       ○       ○       ○       ○       ○");
        // 🥮 🚧
    }

}
