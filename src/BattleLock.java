import java.util.Locale;
import java.util.Scanner;

public abstract class BattleLock extends Location{
    protected Obstacle obstacle;
    Scanner scan12 = new Scanner(System.in);


    BattleLock(Player player , String name , Obstacle obstacle){
        super(player);
        this.obstacle = obstacle;
        this.name = name;
    }

    public boolean getLocation(){ // savaşların durumunda işimize yarayacak
        int obsCount = obstacle.ObstacleCount();
        System.out.println("You are here now !!!" + getName());
        System.out.println("You Healt = " + player.getHealth());
        System.out.println(" Be carefuly.Here " + obsCount + " piece " + obstacle.getName() + " alive ");
        System.out.println("You BATTLE or RUN !!!!!        " + "Press <B> to fight,press <R> to run");
        String selCase = scan12.next();
        selCase = selCase.toUpperCase();
        if (selCase.equals("B")){
            combat(obsCount);
            if (combat(obsCount)){
                System.out.println(this.getName() + "You destroyed the enemies.");
                return true;
            }else{
                System.out.println("you are died");
                return false;
            }

        }
        return true;
    }

    public boolean combat(int obsCount){
        int defObsHealth = obstacle.getHealth();
        for (int i = 0; i<obsCount ; i++){
            playerStats();
            enemyStats();
            while (player.getHealth()>0 && obstacle.getHealth()>0){
                System.out.println("<H>it and <R>un");
                String selCase = scan12.nextLine();
                selCase = selCase.toUpperCase();
                if (selCase.equals("H")){
                    System.out.println("Your HİT !!!");
                    obstacle.setHealth(obstacle.getHealth()-player.getTotalDamage());
                    System.out.println("Player Healt = " + player.getHealth());
                    System.out.println(obstacle.getName() + " Obstacle Healt = " + obstacle.getHealth());
                    if (obstacle.getHealth()>0){
                        System.out.println();
                        System.out.println("Obstacle hit you");
                        player.setHealth(player.getHealth()-(obstacle.getDamage()-player.getInventory().getArmor()));
                        System.out.println();
                        System.out.println("you health = " + player.getHealth());

                    }
                }else{
                    break;
                }
                if(obstacle.getHealth() <= 0 && player.getHealth()>0){

                    System.out.println("You destroyed the enemies");
                    player.setMoney(player.getMoney() + obstacle.getAward());
                    System.out.println("You Money = " + player.getMoney());
                    obstacle.setHealth(defObsHealth);
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public void  playerStats(){
        System.out.println("Player values ----------->");
        System.out.println("You health = " + player.getHealth());
        System.out.println("You damage = " + player.getTotalDamage());
        System.out.println("You money = " + player.getMoney());
        if (player.getInventory().getDamage() > 0){
            System.out.println("You Weapon = " + player.getInventory().getwName());
        }
        if (player.getInventory().getArmor() > 0){
            System.out.println("you armor = " + player.getInventory().getaName());
        }
    }
    public void enemyStats(){
        System.out.println("Enemies values ---------->");
        System.out.println("Enemies Type = " + obstacle.getName());
        System.out.println("Enemies health = " + obstacle.getHealth());
        System.out.println("Enemies damage = " + obstacle.getDamage());
        System.out.println("Award = " + obstacle.getAward());
    }
}
