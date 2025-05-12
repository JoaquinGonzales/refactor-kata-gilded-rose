package edu.alenasoft;

public class ItemUpdaterFactory {
    public static ItemUpdater create(Item item) {
        if (item.name.equals("Aged Brie")) {
            return new AgedBrieItem();
        } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return new SulfurasUpdater();
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new BackstagePassItem();
        } else if (item.name.toLowerCase().startsWith("conjured")) {
            return new ConjuredItem();
        } else {
            return new DefaultItem();
        }
    }
}
