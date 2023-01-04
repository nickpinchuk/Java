package p2;

public class Robot implements Member{
    private String name;

    public Robot(String name) {
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
