public abstract class BattleLock extends Location{
    Obstacle obstacle;


    BattleLock(Player player , String name , Obstacle obstacle){
        super(player);
        this.obstacle = obstacle;
        this.name = name;
    }

    public boolean getLocation(){ // savaşların durumunda işimize yarayacak
        return true;
    }
}
