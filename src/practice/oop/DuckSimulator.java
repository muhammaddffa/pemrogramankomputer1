/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author ThinkPad X1 Carbon
 */
import java.util.Scanner;

public class DuckSimulator {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pilih bebek yang ingin Anda lihat:");
            System.out.println("1. Mallard Duck");
            System.out.println("2. Rubber Duck");
            System.out.println("3. Decoy Duck");
            System.out.println("4. Model Duck");
            
            int choice = scanner.nextInt();
            
            Duck duck = null;
            
            switch (choice) {
                case 1 -> duck = new MallardDuck();
                case 2 -> {
                    FlyBehavior canFly = () -> System.out.println("I can't fly");
                    QuackBehavior squeak = () -> System.out.println("Squeak");
                    duck = new RubberDuck(canFly, squeak);
                }
                case 3 -> duck = new DecoyDuck();
                case 4 -> duck = new ModelDuck();
                default -> System.out.println("Pilihan tidak valid.");
            }
            
            if (duck != null) {
                duck.display();
                duck.performQuack();
                duck.performFly();
            }
        }
    }
}


