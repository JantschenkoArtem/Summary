package org.example.summary._03_05_2024._class.iceCream;

public class IceCreamBall {
     private String taste;

    public IceCreamBall(String taste) {
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    @Override
    public String toString() {
        return "IceCreamBall (" +
                "taste='" + taste + '\'' +
                ')';
    }
}
