import java.util.Scanner;

public class Game {

    Player player;
    Location location;
    Scanner scan3 = new Scanner(System.in);

    public void login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Created by Aliihsanhashas ");
        System.out.println("Contact : aliihsanhashas1@hotmail.com");
        System.out.println("Welcome to Adventure Game !!!!!!!!");
        System.out.println("Enter your game before startıng the game...");
        String PlayerName = scan.nextLine();
        player = new Player(PlayerName);
        player.selectChar();
        start();
    }
    public void start(){
        while (true){                   // play while character is alive 
            System.out.println();
            System.out.println("============================================");
            System.out.println();
            System.out.println("Choose a place to perform the action...");
            System.out.println("1.Safe House ------> you have a safe place,no enemies.");
            System.out.println("2.Cave ------> You may encounter zombies.");
            System.out.println("3.The Forest -------> You may encounter a vampire");
            System.out.println("4. The River --------> you may encounter a bear");
            System.out.println("5.Market Place ------> you can shop");
            System.out.println("Where you want to go");

            int selLoc = scan3.nextInt();
            while (selLoc<1 || selLoc>5){
                System.out.println("Please a valid number");
                selLoc = scan3.nextInt();
            }

            switch (selLoc){
                case 1 :
                    location = new SafeHouse(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if (!location.getLocation()){
                System.out.println("Game Over !!!");
                break;
            }


        }
    }
}
