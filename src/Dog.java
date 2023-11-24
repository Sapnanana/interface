public class Dog extends Mammal implements AnimalBehvior,AnimalMove,AnimalName{
    public Dog(){}
    public Dog(String name,int age,double weight){
        super(name, age, weight);
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps!");
    }
    @Override
    public void move(){
        System.out.println("Dog runs");
    }
}
