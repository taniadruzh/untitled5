package les10;

/**
 * Created by java on 30.01.2018.
 */
public class Animals {
    private String animal;

    public void breath(){
        System.out.println("I can breath");
    }

    public Animals() {
    }

    public Animals(String animal) {
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}
