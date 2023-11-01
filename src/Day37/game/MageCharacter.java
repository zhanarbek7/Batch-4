package Day37.game;

public class MageCharacter extends GameCharacter{

    public MageCharacter(String name, int healthPoints) {
        super(name, healthPoints);
    }

    @Override
    void attack() {
        System.out.println("Casts a powerful spell, injures by 50 hp");
    }




}
