public class Blowfish extends Fish implements AnimalBehvior,AnimalMove,AnimalName{
    public Blowfish(){}
    public Blowfish(String name,int age,double weight){super(name, age, weight);}

    @Override
    public void sleep() {
        System.out.println("Blowfish sleeps");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swims");
    }
}
