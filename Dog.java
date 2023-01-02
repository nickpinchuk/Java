public class Dog extends Animal{
    //comments for github
    private String name;
    private int limitation;
    private int swimlimit;

    public Dog (String name, int limitation, int swimlimit) {
        this.name = name;
        this.limitation = limitation;
        this.swimlimit = swimlimit;
    }

    @Override
    void run(int i) {
        if(i <= this.limitation) {
            System.out.println(this.name + " run " + i + " m");
        }
        else {
            System.out.println(this.name + " Not so much running");
        }
    }

    void swim(int i) {
        if(i <= this.swimlimit) {
            System.out.println(this.name + " swim " + i + " m");
        }
        else {
            System.out.println(this.name + " So much does not float");
        }
    }
}
