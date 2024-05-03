package org.example.summary._03_05_2024._class.iceCream;

public class IceCreamScoop {
    public static void main(String[] args) {
        IceCreamBall iceCreamBall1=new IceCreamBall("Vanilla");
        IceCreamBall iceCreamBall2=new IceCreamBall("Strawberry");
        IceCreamBall iceCreamBall3=new IceCreamBall("Shock");

        Cone cone=new Cone();
        cone.putBall(iceCreamBall1);
        cone.putBall(iceCreamBall3);
        cone.putBall(iceCreamBall2);

        Taster tester=new Taster();
        tester.tasteIce(cone);

    }
}
