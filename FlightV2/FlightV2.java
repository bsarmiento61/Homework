interface Flight {
    void fly();
}

interface Movement extends Flight {
    void walk();
    void jump();
}

class Airplane implements Movement {
    private String model;
    private int year;

    public Airplane(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() { return model; }
    public int getYear() { return year; }

    @Override
    public void fly() {
        System.out.println("I rely on my engine to fly.");
    }

    @Override
    public void walk() {
        System.out.println("I tax on my wheels.");
    }

    @Override
    public void jump() {
        System.out.println("I cannot jump.");
    }

    @Override
    public String toString() {
        return "Airplane [model=" + model + ", year=" + year + "]";
    }
}


class Bird implements Movement {
    private String type;

    public Bird(String type) {
        this.type = type;
    }

    public String getType() { return type; }

    @Override
    public void fly() {
        System.out.println("I flap my wings to fly.");
    }

    @Override
    public void walk() {
        System.out.println("I walk on my feet.");
    }

    @Override
    public void jump() {
        System.out.println("I jump by leaping from my feet.");
    }

    @Override
    public String toString() {
        return "Bird [type=" + type + "]";
    }
}

class ThingsThatMove {
    public static void main(String[] args) {
        Movement[] movingObjects = new Movement[3];
        movingObjects[0] = new Airplane("Boeing 747", 2016);
        movingObjects[1] = new Bird("Eagle");
        movingObjects[2] = new Bird("Hummingbird");

        for (Movement m : movingObjects) {
            System.out.println(m.toString() + ":");
            m.fly();
            m.walk();
            m.jump();
            System.out.println();
        }
    }
}
