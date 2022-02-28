public class MarketPlace extends NormalLock {
    MarketPlace(Player player) {
        super(player, "Market Place");
    }

    public boolean getLocation(){
        System.out.println("Money = " + getPlayer().getMoney());
        System.out.println("1.Weapons");
        System.out.println("2.Armors");
        System.out.println("3.Exit");
        System.out.println("your choice");
        int selTool = scan12.nextInt();
        int selItemID;
        switch (selTool){
            case 1 :
                selItemID = weaponMenu();
                buyWeapon(selItemID);
                break;
            case 2:
                selItemID = armorMenu();
                buyArmor(selItemID);
            default :

                break;
        }
        return true;
    }

    public int weaponMenu(){
        System.out.println("1.GUN -------> Money = 25  , Damage = 2");
        System.out.println("2.SWORD ------> Money = 35 , Damage = 3");
        System.out.println("3.RİFLE ------> Money = 45 , Damage = 7");
        System.out.println("4.Exit");
        System.out.println("Your weapon choice");
        int selWeaponID = scan12.nextInt();
        return selWeaponID;
    }

    public int armorMenu(){
        System.out.println("1.LİGHT ARMOR --------> , Money = 15 , Block = 1");
        System.out.println("2.MEDİUM ARMOR -------> , Money = 25 , Block = 3");
        System.out.println("3.HEAVY ARMOR --------> , Money = 40 , Block = 5");
        System.out.println("4.Exit");
        int selArmorID = scan12.nextInt();
        return selArmorID;
    }

    public void buyArmor(int ItemID){
        int block = 0 , price = 0;
        String aName = null;
        switch (ItemID){
            case 1:
                price = 15;
                block = 1;
                aName = "LİGHT ARMOR";
                break;
            case 2:
                price = 25;
                block = 3;
                aName = "MEDİUM ARMOR";
                break;
            case 3:
                price = 40;
                block = 5;
                aName = "HEAVY ARMOR";
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid number please re-enter");
                break;
        }
        if (price>0){
            if (player.getMoney()>=price){
                player.getInventory().setaName(aName);
                player.getInventory().setArmor(block);
                player.setMoney(player.getMoney()-price);
                System.out.println("Armor is purhased.your before armor = " + player.getInventory().getArmor() + " " + "New armor = " + " " + player.getInventory().getArmor());
                System.out.println("Remening Money = " + player.getMoney());
            }else{
                System.out.println("Not enoght money");
            }
        }
    }

    public void buyWeapon(int ItemID){
        int damage = 0,price = 0;
        String wName = null;
        switch (ItemID){
            case 1:
                price = 25;
                damage = 2;
                wName = "GUN";
                break;
            case 2:
                price = 35;
                damage = 3;
                wName = "SWORD";
                break;
            case 3:
                price = 45;
                damage = 7;
                wName = "RİFLE";
                break;
            case 4:

                break;
            default:
                System.out.println("invalid process");
                break;
        }

        if (price>0){
            if (player.getMoney()>=price){
                player.getInventory().setDamage(damage);
                player.getInventory().setwName(wName);
                player.setMoney(player.getMoney()-price);
                System.out.println("Weapon is purchased. Your before damage = " + player.getDamage() + " " +"Your new damage = " + " " + player.getTotalDamage());
                System.out.println("Remaning Money = " + player.getMoney());
            }else{
                System.out.println("Not enoght money !!!!");
            }
        }

    }

}
