package org.example.summary._03_05_2024._class.stock;

public class Locomotiv {
    private int id;

    public Locomotiv(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void getFirstVagon(RollingStock rollingStock){
        System.out.printf("Locomotiv %d unhooked vagon %d%n", this.id , rollingStock.unhookFirst().getId());
    }
    public void getLarstVagon(RollingStock rollingStock){
        System.out.printf("Locomotiv %d unhooked vagon %d%n", this.id , rollingStock.unhookLast().getId());
    }
}
