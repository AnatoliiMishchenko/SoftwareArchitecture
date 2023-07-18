package Classes.Rewards;

import Classes.ItemFabric;
import Classes.iGameItem;

public class ManaGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new ManaReward();
    
    }
    
}
