import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    @Test
    public void hasVolume() {
        WaterBottle waterbottle = new WaterBottle(600);
        assertEquals(600, waterbottle.getVolume());
    }

    @Test
    public void Drink() {
        WaterBottle waterbottle = new WaterBottle(600);
        waterbottle.Drink();
        waterbottle.Drink();
        assertEquals(580, waterbottle.getVolume());
    }

    @Test
    public void Refill() {
        WaterBottle waterbottle = new WaterBottle(600);
        waterbottle.Drink();
        waterbottle.Refill();
        assertEquals(600, waterbottle.getVolume());
    }

    @Test
    public void Empty() {
        WaterBottle waterbottle = new WaterBottle(600);
        waterbottle.Empty();
        assertEquals(0, waterbottle.getVolume());
    }

}
