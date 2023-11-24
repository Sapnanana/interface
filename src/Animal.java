public abstract class Animal implements AnimalMove,AnimalName {
    private String name;
    private int age;
    private double weight;

    public Animal(){}
    public Animal(String name,int age,double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;

    }
    public abstract void eat();
    public abstract String getvoice();
    public String toString(){
        return "Animalname"+name + " age = "+age+ "weight= "+weight;
    }
}
