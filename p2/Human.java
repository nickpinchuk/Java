package p2;

public class Human implements Member{
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String run() {
        return this.name + " run ";
    }

    @Override
    public String jump() {
        return this.name + " jumped ";
    }
}
