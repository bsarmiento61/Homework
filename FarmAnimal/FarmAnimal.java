public abstract class FarmAnimal{
    protected String name;
    protected String gender;
    protected double weight;
    protected int age;

    public FarmAnimal(){
        name= "Unknown";
        gender= "Unknown";
        weight = 0.0;
        age= 0;
    }

    public FarmAnimal(String name, String gender, double weight, int age){
        this.name=name;
        this.gender=gender;
        this.weight=weight;
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public double getWeight(){
        return weight;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public void setAge(int age){
        this.age=age;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nGender: " + gender + "\nWeight: " + weight + "\nAge: " + age;
    }

    public abstract String feedLoadingSchedule();
}


class Chicken extends FarmAnimal{
    private String sound;

    public Chicken(String name, String gender,double weight,int age,String sound){
        super(name,gender,weight,age);
        this.sound=sound;
    }

    public String getSound(){
        return sound;
    }
    public void setSound(String sound){
        this.sound=sound;
    }

    @Override
    public String toString(){
         return "Chicken " + sound + " [Name=" + name + ", Gender=" + gender + ", Weight=" + weight + ", Age=" + age + "]";
    }

    @Override
    public String feedLoadingSchedule(){
        return name + ": 8am-4pm";
    }
}

class Cow extends FarmAnimal{
    private String sound;

    public Cow(String name, String gender,double weight,int age,String sound){
        super(name,gender,weight,age);
        this.sound=sound;
    }

    public String getSound(){
        return sound;
    }
    public void setSound(String sound){
        this.sound=sound;
    }

    @Override
    public String toString(){
         return "Cow " + sound + " [Name=" + name + ", Gender=" + gender + ", Weight=" + weight + ", Age=" + age + "]";
    }

    @Override
    public String feedLoadingSchedule(){
        return name + ": 6am-4pm";
    }
}

class Duck extends FarmAnimal{
        private String sound;

    public Duck(String name, String gender,double weight,int age,String sound){
        super(name,gender,weight,age);
        this.sound=sound;
    }

    public String getSound(){
        return sound;
    }
    public void setSound(String sound){
        this.sound=sound;
    }

    @Override
    public String toString(){
         return "Duck " + sound + " [Name=" + name + ", Gender=" + gender + ", Weight=" + weight + ", Age=" + age + "]";
    }

    @Override
    public String feedLoadingSchedule(){
        return name + ": 8am-12pm-6pm";
    }
    
}

class MyFarm {
    public static void main(String[] args) {
        FarmAnimal[] animals = new FarmAnimal[6];
        animals[0] = new Duck("Donald","male",3.2,5,"Quack Quack");
        animals[1] = new Duck("Cheese","female",3.6,5,"Quack Quack");
        animals[2] = new Cow("Molly","female",1600.0,3,"Moo");
        animals[3] = new Chicken("Albert","male",1.6,3,"cock-a-Doodle-doo");
        animals[4] = new Chicken("Amelia","female",1.8,4,"Cluck Cluck");
        animals[5] = new Chicken("Dixie","female",1.7,4,"Cluck Cluck");

        for (FarmAnimal p : animals){
            System.out.println(p.toString());
        }
        for (FarmAnimal p : animals){
            System.out.println(p.feedLoadingSchedule());
        }
    }
}
