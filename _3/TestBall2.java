package _3;
public class TestBall2 {
    public static void main(String[] args) {
        Ball2 ball = new Ball2(0, 0); // Создание объекта мяча с начальным положением (0, 0)
        System.out.println(ball); // Выводит "Ball @ (0, 0)"

        ball.setXY(5, 10); // Задание нового положения мяча (5, 10)
        System.out.println(ball); // Выводит "Ball @ (5, 10)"

        ball.setXYSpeed(2, 3); // Задание новой скорости мяча (2, 3)
        ball.move(); // Перемещение мяча на основе текущей скорости
        System.out.println(ball); // Выводит "Ball @ (7, 13)"
    }
}