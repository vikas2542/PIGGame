import java.util.Random;

class Die {
    Random random = new Random();

    public int roll() {
        return random.nextInt(6) + 1;
    }
}