public class Arena extends NormalLock{
    Arena(Player player) {
        super(player,"Arena");
    }

    public boolean getLocation(){
        System.out.println("Current Money = "+player.getMoney());
        int playerMoney = player.getMoney();
        player.setMoney(playerMoney-5);
        System.out.println("Fee is payed...");
        System.out.println("You are in the Arena now");
        System.out.println("Money of player after payment = "+player.getMoney());
        return true;
    }



}
