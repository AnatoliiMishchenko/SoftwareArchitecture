package Classes.Rewards;

import Classes.ItemFabric;
import Classes.iGameItem;

public class StoneGenerator extends ItemFabric{
     @Override
    public iGameItem createItem() {
        return new SelverReward();
    
    }
    
}
