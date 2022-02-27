import java.util.Scanner;

public class Player {

    private int damage,health,money,rHealthy;
    private String name,cName;
    private Inventory ınventory;
    Scanner scan2 = new Scanner(System.in);

    public Player(String name){
        this.name = name;
    }

    public void selectChar(){
        switch (CharMenu()){
            case 1 :
                initPlayer("Samuraı" , 5 , 21 , 15);
                break;
            case 2 :
                initPlayer("Archer" , 7 , 18 , 20);
                break;
            case 3 :
                initPlayer("Knight" , 8 , 24 , 5);
                break;
            case 4 :
                initPlayer("Mustapha" , 3 , 35 , 65);
                break;
            default :
                initPlayer("Samurai" , 5 , 21 , 15);
                break;
        }
        System.out.println(" Character = " + getcName() + " -- Damage = " + getDamage() + " -- Healty = " + getHealth() + " -- Money = " + getMoney());
    }
    public int CharMenu(){
        System.out.println("Please select a character !!!");
        System.out.println( "1 - " + " Type = Samurai   Damage = 5   Healty = 21   Money = 15");
        System.out.println( "2 - " + " Type = Archer    Damage = 7   Healty = 18   Money = 20");
        System.out.println( "3 - " + " Type = Knight    Damage = 8   Healty = 24   Money = 5");
        System.out.println( "4 - " + " Type = Mustapha  Damage = 3   Healty = 35   Money = 65");
        System.out.println("Your Choice");
        int charID = scan2.nextInt();
        while (charID<1 || charID>4){
            System.out.println(" Please enter a valid number ");
            charID = scan2.nextInt();
        }
        return charID;
    }

    public void initPlayer(String cname , int dmg , int hlty , int mny){
        setcName(cname);
        setDamage(dmg);
        setHealth(hlty);
        setMoney(mny);
        setrHealthy(hlty);
    }

    public int getDamage(){
        return damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getMoney(){
        return money;
    }

    public void setMoney(int money){
        this.money = money;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getcName(){
        return cName;
    }

    public void setcName(String cName){
        this.cName = cName;
    }

    public int getrHealthy(){
        return rHealthy;
    }

    public void setrHealthy(int rHealthy){
        this.rHealthy = rHealthy;
    }

    public Inventory getInventory(){
        return ınventory;
    }

    public void setInventory(Inventory ınventory){
        this.ınventory = ınventory;
    }
}
