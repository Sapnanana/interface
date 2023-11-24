public class Pigieon extends Bird implements AnimalBehvior,AnimalMove,AnimalName{
    private String species;
    public Pigieon(){}
    public Pigieon(String name,int age,double weight,String feathercolor,String species){
       super(name, age, weight, feathercolor);
        this.species=species;
    }

    @Override
    public void sleep() {
        System.out.println("Pigeon sleeps");
    }
    @Override
    public void move(){
        System.out.println("Pigeon flies");
    }
}
