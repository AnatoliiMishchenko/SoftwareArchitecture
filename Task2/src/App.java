import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.ItemFabric;
import Classes.Rewards.GameGenerator;
import Classes.Rewards.GoldGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        ItemFabric generator = new GoldGenerator();

        generator.openReward();
        generator = new GameGenerator();
        generator.openReward();

        Random random = ThreadLocalRandom.current();
        List <ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GameGenerator());
        fabricList.add(new GoldGenerator());

        for(int i = 0; i < 10 ; i++){
            int index = Math.abs(random.nextInt()%2==0?0:1);
            ItemFabric fabric = fabricList.get(index);
            fabric.openReward();            
        }
        
    }
}
