package joMama;

public class Main {
    public static void main(String args[]) throws InterruptedException {
        Overseer joe = new Overseer();

        int x = 0;
        while(x == 0) {
            if(!joe.menu()) {
                x++;
            }
        }

    }
}
