package les8.magazPac;

import les7.magazPac.*;
import les8.magazPac.sport_goods.Boots;
import les8.magazPac.sport_goods.Dress;

/**
 * Created by java on 19.01.2018.
 */
public class MagazRunner {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Produser produser = new Produser("Kirova","bla@bla.com","49008");
        Boots boots = new Boots("Nike",37,1500,10,produser);
        Dress dress = new Dress("Columbia",42,1500,15);


        addGoodsToTheShop(shop, boots, dress);

        System.out.println(shop.getBoots().getPrise());
        System.out.println(boots.getPrise());
        System.out.println(shop.getBoots().getProducer().getAdres());
    }

    private static void addGoodsToTheShop(Shop shop, Boots boots, Dress dress) {
        shop.setBoots(boots);
        shop.setDress(dress);
    }
}
