package org.example.summary._03_05_2024._class.stock;

public class Main {
    public static void main(String[] args) {
        Vagon vagon=new Vagon(1);
        Vagon vagon1=new Vagon(2);
        Vagon vagon2=new Vagon(3);
        Vagon vagon3=new Vagon(4);
        Vagon vagon4=new Vagon(5);

        RollingStock rollingStock=new RollingStock();
        rollingStock.addLaststVagon(vagon);
        rollingStock.addLaststVagon(vagon1);
        rollingStock.addLaststVagon(vagon2);
        rollingStock.addLaststVagon(vagon3);
        rollingStock.addLaststVagon(vagon4);


        Locomotiv locomotiv1=new Locomotiv(1);
        Locomotiv locomotiv2=new Locomotiv(2);

        while (!rollingStock.isEmpty()){
            locomotiv1.getFirstVagon(rollingStock);
            if (rollingStock.isEmpty())break;
            locomotiv2.getLarstVagon(rollingStock);
        }
    }
}
