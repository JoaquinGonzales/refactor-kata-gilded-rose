package edu.alenasoft;

public class AgedBrieItem implements ItemUpdater{
    @Override
    public void update(Item item) {
        item.sellIn--;
        int increase = 0;
        if (item.sellIn < 0)
        {
            increase = 2;
        }
        else {
            increase = 1;
        }
        item.quality = Math.min(50, item.quality + increase);
    }
}
