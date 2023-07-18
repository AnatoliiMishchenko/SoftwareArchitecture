package Classes.Rewards;

import Classes.iGameItem;

public class WaterReward implements iGameItem{
    
    @Override
    public void open() {
       System.out.println("Water");
    }
    
}
