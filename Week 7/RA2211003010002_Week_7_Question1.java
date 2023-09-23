import java.util.Random;

class RA2211003010002_RandomIntegerGenerator implements Runnable {
    private int randomNum;

    @Override
    public void run() {
        Random random = new Random();
        randomNum = random.nextInt(100);
        System.out.println("Random Number: " + randomNum);
    }

    public int getRandomNum() {
        return randomNum;
    }
}

class RA2211003010002_Square implements Runnable {
    private RA2211003010002_RandomIntegerGenerator generator;

    public RA2211003010002_Square(RA2211003010002_RandomIntegerGenerator generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        if (generator.getRandomNum() % 2 == 0) {
            System.out.println("Square: " + Math.pow(generator.getRandomNum(), 2));
        }
    }
}

class RA2211003010002_Cube implements Runnable {
    private RA2211003010002_RandomIntegerGenerator generator;

    public RA2211003010002_Cube(RA2211003010002_RandomIntegerGenerator generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        if (generator.getRandomNum() % 2 != 0) {
            System.out.println("Cube: " + Math.pow(generator.getRandomNum(), 3));
        }
    }
}

public class RA2211003010002_Week_7_Question1{
    public static void main(String[] args) throws InterruptedException {
        RA2211003010002_RandomIntegerGenerator generator = new RA2211003010002_RandomIntegerGenerator();
        Thread RA2211003010002_t1 = new Thread(generator);
        Thread RA2211003010002_t2 = new Thread(new RA2211003010002_Square(generator));
        Thread RA2211003010002_t3 = new Thread(new RA2211003010002_Cube(generator));

        RA2211003010002_t1.start();
        RA2211003010002_t1.join();
        RA2211003010002_t2.start();
        RA2211003010002_t3.start();
    }
}