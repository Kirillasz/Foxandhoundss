package org.example.Menu;

import java.util.Scanner;

public class Menu {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Szép napot játékos");
        System.out.println("Kérlek add meg a neved");
        String nev= scanner.nextLine();


        Menu kezdes = new Menu();

        System.out.println("Kedves "+nev +",kezdődik a játék!");
        System.out.println("Sok szerencsét!");
        kezdes.start();
    }

    private void start() {
    }
}
