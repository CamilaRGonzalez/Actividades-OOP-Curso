package Ejercicio3;

public class Character {
    private final String name;
    private IAttackBehavior attackBehavior;
    private IMovementBehavior movementBehavior;

    public Character(String name, IAttackBehavior attackBehavior, IMovementBehavior movementBehavior) {
        this.name = name;
        this.attackBehavior = attackBehavior;
        this.movementBehavior = movementBehavior;
    }

    public void performAttack() {
        System.out.print(name + ": ");
        attackBehavior.attack();
    }

    public void performMove() {
        System.out.print(name + ": ");
        movementBehavior.move();
    }

    public void setAttackBehavior(IAttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    public void setMovementBehavior(IMovementBehavior movementBehavior) {
        this.movementBehavior = movementBehavior;
    }
}
