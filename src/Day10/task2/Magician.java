package Day10.task2;

public class Magician extends Hero implements MagicAttack{
    int magicAttack = 20;

    public Magician() {
        physDef = 0;
        physAttack = 5;
        magicDef = 0.8;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attack = magicAttack * (1 - hero.magicDef);
        hero.health -= attack;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
