package p2;

public class Main {
    public static void main(String[] args) {
        Member[] members = {new Human("Leo"), new Cat("Tom"), new Robot("Bender")};
        Obstacle[] obstacles = {new racetrack(100), new racetrack(50), new racetrack(70), new Wall(2), new Wall(3), new Wall(5)};

        go(members,obstacles);
    }
private static void go(Member[] members, Obstacle[] obstacles) {
        for (Member member: members)
            for (Obstacle obstacle: obstacles)
                System.out.println(obstacle.overcome(member));
}


}