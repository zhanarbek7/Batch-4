package Day37.game;

import javax.naming.Name;

public abstract class GameCharacter {
    String name;
    int healthPoints;

    public GameCharacter(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
    }

    abstract void attack();

    public void greeting(){
        System.out.println(name + " "+ healthPoints + " greets you!");
    }


}
