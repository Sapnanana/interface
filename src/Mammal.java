public class Mammal extends Animal{

    public Mammal(){}
    public Mammal(String name, int age,double weight){
        super (name,age,weight);
    }
    @Override
    public void eat() {

    }

    @Override
    public String getvoice() {
        return null;
    }
}
