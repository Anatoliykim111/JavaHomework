package Day10.task2;

public class Paladin extends Hero implements Healer{
    public Paladin() {
        physAttack = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health + 25 > 100){
            health = 100;
        }
        else
            health+=25;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 10 > 100){
            hero.health = 100;
        }
        else
            hero.health +=10;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
