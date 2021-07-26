package Day10.task2;

public class Warrior extends Hero implements PhysAttack {
    public Warrior() {
        physAttack = 30;
        physDef = 0.8;
        magicDef = 0;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
