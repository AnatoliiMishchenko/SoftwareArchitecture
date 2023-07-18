package Classes.Rewards;

import Classes.ItemFabric;
import Classes.iGameItem;

public class TreeGenerator extends ItemFabric{

    @Override
    public iGameItem createItem() {
        return new TreeReward();
    
    }
    
}
