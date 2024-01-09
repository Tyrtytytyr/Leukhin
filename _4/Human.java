package _4;

public class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }

    public void introduce() {
        System.out.println("Hello, I am a human with " + head.getHairColor() + " hair and " + head.getEyesCount() + " eyes.");
        System.out.println("My left leg is " + leftLeg.getLength() + " cm long and size " + leftLeg.getSize() + ".");
        System.out.println("My right leg is " + rightLeg.getLength() + " cm long and size " + rightLeg.getSize() + ".");
        System.out.println("My left hand is " + leftHand.getLength() + " cm long and " + (leftHand.isHasFingers() ? "has fingers" : "does not have fingers") + ".");
        System.out.println("My right hand is " + rightHand.getLength() + " cm long and " + (rightHand.isHasFingers() ? "has fingers" : "does not have fingers") + ".");
    }
}
