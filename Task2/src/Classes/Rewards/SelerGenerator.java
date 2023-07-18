package Classes.Rewards;

import Classes.ItemFabric;
import Classes.iGameItem;

public class SelerGenerator extends ItemFabric{
    @Override
    public iGameItem createItem() {
        return new SelverReward();
    
    }
    
}
