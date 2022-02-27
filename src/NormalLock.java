public abstract class NormalLock extends Location{
    NormalLock(Player player , String name){
        super(player);
        this.name = name;
    }

    public boolean getLocation(){
        return true;
    }
}
