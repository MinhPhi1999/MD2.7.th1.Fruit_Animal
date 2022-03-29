package Animal;



import endible.Endible;

public class Chicken extends Animal implements Endible {
    @Override
    public String makeSound() {
        return "gà: cục tác lá chanh";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}

