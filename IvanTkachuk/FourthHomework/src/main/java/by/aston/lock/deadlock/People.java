package main.java.by.aston.lock.deadlock;

public class People {
    private final String name;

    public People(String name) {
        this.name = name;
    }

    public void goesTo(People second){
        System.out.println(this.name + " goes " + second.getName());
        second.waitingFor(this);
    }

    public void waitingFor(People second){
        System.out.println(second.getName() + " waits " + this.name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }
}
