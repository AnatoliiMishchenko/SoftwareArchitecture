package Classes.Rewards;

import Classes.iGameItem;

public class GemaReward implements iGameItem {
    @Override
    public void open() {
       System.out.println("Gem");
    }
}
