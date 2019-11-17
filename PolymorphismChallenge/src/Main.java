public class Main {

    public static void main(String[] args) {

        Car jeep = new Jeep();
        jeep.startEngine();

        Car edge = new Edge();
        edge.startEngine();

        Car focus = new Focus();
        focus.startEngine();
    }
}

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;

        this.engine = true;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Calling startEngine in base class");
    }

    public void accelerate() {
        System.out.println("Calling accelerate in base class");
    }

    public void brake() {
        System.out.println("Calling brake in base class");
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Jeep extends Car {
    public Jeep() {
        super("Jeep", 4);
    }

    public void startEngine() {
        System.out.println("Calling startEngine in Jeep");
    }
}

class Edge extends Car {
    public Edge() {
        super("Edge", 4);
    }

    public void startEngine() {
        System.out.println("Calling startEngine in Edge");
    }
}

class Focus extends Car {
    public Focus() {
        super("Focus", 4);
    }
}


