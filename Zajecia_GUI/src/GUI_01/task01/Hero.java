package GUI_01.task01;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHelloTo(Hero otherHero) {
        System.out.println("Hi " + otherHero.getName() + "!");
    }
}