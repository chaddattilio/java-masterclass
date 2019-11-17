public class Main {

    public static void main(String[] args) {

        Car jeep = new Jeep(4, "Jeep");
        jeep.startEngine();

        Car edge = new Edge(4, "Edge");
        edge.startEngine();

        Car focus = new Focus(4, "Focus");
        focus.startEngine();
    }
}

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(int cylinders, String name) {
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
    public Jeep(int cylinders, String name) {
        super(cylinders, name);
    }

    public void startEngine() {
        System.out.println("Calling startEngine in Jeep");
    }
}

class Edge extends Car {
    public Edge(int cylinders, String name) {
        super(cylinders, name);
    }

    public void startEngine() {
        System.out.println("Calling startEngine in Edge");
    }
}

class Focus extends Car {
    public Focus(int cylinders, String name) {
        super(cylinders, name);
    }
}


