package Day37.game;

public class HeroCharacter extends GameCharacter{

    public HeroCharacter(String name, int healthPoints) {
        super(name, healthPoints);
    }

    @Override
    void attack() {
        System.out.println("Attacks with a sword, injures by 30 hp");
    }
}
