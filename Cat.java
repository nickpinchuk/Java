public class Cat  extends Animal{
    //comments for github
    private String name;
    private int limitation;

    public Cat(String name, int limitation) {
        this.name = name;
        this.limitation = limitation;
    }

    @Override
    void run(int i) {
        if (i <= this.limitation) {
            System.out.println(this.name + " run " + i + " m");
        } else {
            System.out.println(this.name + " Not so much running");
        }
    }
}
