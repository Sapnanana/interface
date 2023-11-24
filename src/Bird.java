public class Bird extends Animal{
    private String feathercolor;
    public Bird(){
    }
    public Bird(String name,int age,double weight, String feathercolor){
        super(name, age, weight);
        this.feathercolor=feathercolor;

    }
    @Override
    public void eat() {

    }

    @Override
    public String getvoice() {
        return null;
    }
}
