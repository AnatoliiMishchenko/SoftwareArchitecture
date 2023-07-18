package Classes.Rewards;

import Classes.ItemFabric;
import Classes.iGameItem;

public class GameGenerator extends ItemFabric{
    @Override
    public iGameItem createItem() {
        return new GemaReward();
    
    }
    
}
 