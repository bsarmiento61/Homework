import java.util.ArrayList;
interface Flight{
    void fly();
}

class Airplane implements Flight{
    private String model;
    private int year;

    public Airplane(){
        model="unknown";
        year=0;
    }
    public Airplane(String model, int year){
        this.model=model;
        this.year=year;
    }

    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }

    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    @Override
    public void fly(){
         System.out.println(": I'm an airplane that relies on an engine to fly.");
    }

    @Override
    public String toString(){
        return "Airplane " + "[model=" + model + ", year=" + year + "]";
    }
}

class Bird implements Flight{
    private String type;

    public Bird(){
        type="unknown";
    }
    public Bird(String type){
        this.type=type;
    }

    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }

    @Override
    public void fly(){
         System.out.println(": I'm an airplane that relies on an engine to fly.");
    }

    @Override
    public String toString(){
        return "Bird [type=" + type + "]";
    }
}

    class ThingsThatFly{
        public static void main(String[] args){
            Airplane airplane = new Airplane("Boeing 747", 2016);
        Bird eagle = new Bird("Eagle");
        Bird hummingbird = new Bird("Hummingbird");

        
        ArrayList<Flight> flyingObjects = new ArrayList<>();
        flyingObjects.add(airplane);
        flyingObjects.add(eagle);
        flyingObjects.add(hummingbird);

        
        for (Flight f : flyingObjects) {
            System.out.print(f.toString());
            f.fly();
        }
    }
    }