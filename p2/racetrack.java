package p2;

public class racetrack implements Obstacle{
    private int lendth;

    public racetrack(int lendth) {
        this.lendth = lendth;
    }

    @Override
    public String overcome(Member member) {
        return member.run() +this.lendth+ "m on the race track";
    }
}
