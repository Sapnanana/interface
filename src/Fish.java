public class Fish extends Animal{

    public Fish(){}
    public Fish(String name,int age,double weight){
        super(name, age, weight);
    }
    @Override
    public void eat() {

    }

    @Override
    public String getvoice() {
        return null;
    }
}
