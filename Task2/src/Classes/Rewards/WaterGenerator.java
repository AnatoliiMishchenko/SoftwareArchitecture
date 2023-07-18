package Classes.Rewards;

import Classes.ItemFabric;
import Classes.iGameItem;

public class WaterGenerator extends ItemFabric{

    @Override
    public iGameItem createItem() {
        return new WaterReward();
    
    }
    
}
