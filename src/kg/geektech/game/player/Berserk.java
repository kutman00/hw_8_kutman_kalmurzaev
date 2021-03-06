package kg.geektech.game.player;

import kg.geektech.game.general.RPG_Game;
public class Berserk extends Hero {
    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void hit(Hero[] heroes) {

    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        int coeff = RPG_Game.random.nextInt(40);
        boss.setHealth(boss.getHealth() - (this.getDamage() + coeff));
        this.setHealth(this.getHealth()-(boss.getDamage()-coeff));
        System.out.println("Berserk атаковал " + (this.getDamage() + coeff));

        }
    }