package org.example.summary._03_05_2024._class.iceCream;

public class Taster {
    public void tasteIce(Cone cone) {
        while (!cone.isEmpty()) {
            IceCreamBall ball = cone.takeBall();
            System.out.println("I tasted " + ball.getTaste());
        }
    }
}
