package p2;

public class Wall implements Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public String overcome(Member member) {

        return member.jump() + "on a "  + this.height + " m through the wall";
    }
}

