package Day10.task2;

public class Shaman extends Hero implements Healer, MagicAttack, PhysAttack{
    int magicAttack = 15;

    public Shaman() {
        physAttack = 10;
        physDef = 0.2;
        magicDef = 0.8;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attack = magicAttack * (1 - hero.magicDef);
        hero.health -= attack;
    }

    @Override
    public void healHimself() {
        if (health + 50 > 100){
            health = 100;
        }
        else
            health+=50;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 30 > 100){
            hero.health = 100;
        }
        else
            hero.health +=30;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
