package Day10.task2;

public abstract class Hero implements PhysAttack{
    int health;
    int physAttack;
    double physDef;
    double magicDef;

    public Hero() {
        this.health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attack = physAttack * (1 - hero.physDef);

        if(hero.health - attack < 0)
            hero.health = 0;
        else
            hero.health -= attack;
    }
}
