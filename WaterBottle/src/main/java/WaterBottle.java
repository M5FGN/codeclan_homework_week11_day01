public class WaterBottle {
    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        System.out.println(this.volume);
        return this.volume;
    }

    public int Drink() {
        volume = volume - 10;
        return volume;
    }

    public int Refill() {
        volume = 600;
        return volume;
    }

    public int Empty() {
        volume = 0;
        return volume;
    }
}
