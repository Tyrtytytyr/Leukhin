package _4;

public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("brown", 2);
        Leg leftLeg = new Leg(80, 42);
        Leg rightLeg = new Leg(80, 42);
        Hand leftHand = new Hand(20, true);
        Hand rightHand = new Hand(22, true);

        Human human = new Human(head, leftLeg, rightLeg, leftHand, rightHand);
        human.introduce();

        leftHand.wave();
        rightHand.wave();
        leftLeg.walk();
        rightLeg.walk();
        head.shakeHead();
    }
}
