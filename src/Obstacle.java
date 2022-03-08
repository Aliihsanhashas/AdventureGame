import java.util.Random;

public class Obstacle {
    private String name;
    private int damage , award , health , MaxNumber ;

    Obstacle(String name , int damage , int health , int award, int MaxNumber){// Constructor
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.award = award;
        this.MaxNumber = MaxNumber;
    }

    public int ObstacleCount(){
        Random r = new Random();
        return r.nextInt(this.MaxNumber) + 1;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
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

    public int getAward(){
        return award;
    }

    public void setAward(int award){
        this.award = award;
    }

    public int getMaxNumber(){
        return MaxNumber;
    }

    public void setMaxNumber(){
        this.MaxNumber = MaxNumber;
    }
}
