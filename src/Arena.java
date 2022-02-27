public class Arena extends NormalLock{
    Arena(Player player) {
        super(player,"Arena");
    }

    public boolean getLocation(){
        int playerMoney = getMoney()
        player.setMoney(playerMoney-5);
        System.out.println("Fee is payed...");
        System.out.println("You are in the Arena now");
        return true;
    }



}
