package main.java.by.aston.lock.livelock;

public class Person {

    private final String name;
    private Person opponent;
    private boolean hasYielded = false;

    public Person(String name) {
        this.name = name;
    }

    public void setOpponent(Person opponent) {
        this.opponent = opponent;
    }

    public void interact() {
        while (true) {

            if (hasYielded) {
                System.out.println(name + ": жду когда " + opponent.name + " уступит мне");
                if (!opponent.hasYielded) {
                    continue;
                }

                System.out.println(name + ": оба уступили, начинаем сначала");
                hasYielded = false;
                opponent.hasYielded = false;
                sleep(500);
                continue;
            }

            if (opponent.hasYielded) {
                System.out.println(name + ": уступаю " + opponent.name);
                hasYielded = true;
                sleep(500);
                continue;
            }

            System.out.println(name + ": предлагаю " + opponent.name + " уступить");
            sleep(500);
        }
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
