public class SafeHouse extends NormalLock{
    SafeHouse(Player player) {
        super(player,"Safe House");
    }

    public boolean getLocation(){
        player.setHealth(player.getrHealthy());
        System.out.println("you are healed...");
        System.out.println("You are in the safe house now");
        return true;
    }



}
