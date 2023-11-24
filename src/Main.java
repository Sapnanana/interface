public class Main {
    public static void main(String[] args)
    {
        AnimalBehvior[]animalBehviors = new AnimalBehvior[3];
        animalBehviors[0]= new Dog("Buddy",3,10.0);
        animalBehviors[1]=new Pigieon("Piddy",2,40.5,"Yellowish","Rock Pigieon");
        animalBehviors[2]=new Blowfish("Jerry",2,5.6);
        for(AnimalBehvior animalBehvior:animalBehviors){
            animalBehvior.sleep();
        }
        AnimalMove[]animalMoves=new AnimalMove[3];
        animalMoves[0]= new Dog("Buddy",3,10.0);
        animalMoves[1]=new Pigieon("Piddy",2,40.5,"Yellowish","Rock Pigieon");
        animalMoves[2]=new Blowfish("Jerry",2,5.6);
        for(AnimalMove animalMove:animalMoves){
            animalMove.move();
        }

    }
}