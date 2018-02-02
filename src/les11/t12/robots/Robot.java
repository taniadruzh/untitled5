package les11.t12.robots;

import les11.t12.robotDetails.Hand;
import les11.t12.robotDetails.Head;
import les11.t12.robotDetails.Leg;

import java.util.Arrays;
import java.util.Objects;

public class Robot {
    private String name;
    private String model;
    private Leg legs[];
    private Hand hands[];
    private Head heads[];

    public Robot() {
    }

    public Robot(String name, String model, Leg[] legs, Hand[] hands, Head[] heads) {
        this.name = name;
        this.model = model;
        this.legs = legs;
        this.hands = hands;
        this.heads = heads;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Robot)) return false;
        Robot robot = (Robot) o;
        return Objects.equals(getName(), robot.getName()) &&
                Objects.equals(getModel(), robot.getModel()) &&
                Arrays.equals(getLegs(), robot.getLegs()) &&
                Arrays.equals(getHands(), robot.getHands()) &&
                Arrays.equals(getHeads(), robot.getHeads());
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(getName(), getModel());
        result = 31 * result + Arrays.hashCode(getLegs());
        result = 31 * result + Arrays.hashCode(getHands());
        result = 31 * result + Arrays.hashCode(getHeads());
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Leg[] getLegs() {
        return legs;
    }

    public void setLegs(Leg[] legs) {
        this.legs = legs;
    }

    public Hand[] getHands() {
        return hands;
    }

    public void setHands(Hand[] hands) {
        this.hands = hands;
    }

    public Head[] getHeads() {
        return heads;
    }

    public void setHeads(Head[] heads) {
        this.heads = heads;
    }

    public boolean getHeadStatus(){
        if (getHeads().length == 1) {
            System.out.println("I have a head, so I can speak.");
            return true;
        }
        else if (getHeads().length > 1){
            System.out.println("I have too much heads, so I have headache.");
            return false;
        }
        else if (getHeads().length < 1){
            System.out.println("I haven't head, so I can't speak.");
            return false;
        }
        return false;
    }

    public boolean getLegsStatus(){
        if (getLegs().length == 2) {
            System.out.println("I have 2 legs, so I can walk.");
            return true;
        }
        else if (getLegs().length > 2){
            System.out.println("I have too much legs, so I can't walk - something prevents me.");
            return false;
        }
        else if (getLegs().length == 1){
            System.out.println("I have only one leg. I can only jump on one leg.");
            return false;
        }
        else if (getLegs().length < 1){
            System.out.println("I haven't legs, so I can't walk.");
            return false;
        }
        return false;
    }

    public boolean getHandStatus(){
        if (getHands().length == 2) {
            System.out.println("I have 2 hands, so I can write.");
            return true;
        }
        else if (getHands().length > 2){
            System.out.println("I have too much hands, so I can write and scratch your back.");
            return false;
        }
        else if (getHands().length == 1){
            System.out.println("I can only write with one hand.");
            return false;
        }
        else if (getHands().length < 1){
            System.out.println("I haven't hand, so I can't write.");
            return false;
        }
        return false;
    }

    public void printRobotStatus(){
        System.out.println("Hello! My name is " + getName() + " and my model is " + getModel() + ".");
        boolean handStatus = getHandStatus();
        boolean headStatus = getHeadStatus();
        boolean legStatus = getLegsStatus();
        if (handStatus && headStatus && legStatus) {
            System.out.println("I am ready to work.");
        }
        else {
            System.out.println("I am not ready to work.");
        }
    }
}
