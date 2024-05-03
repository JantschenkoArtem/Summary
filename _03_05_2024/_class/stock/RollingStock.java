package org.example.summary._03_05_2024._class.stock;

import java.util.ArrayDeque;
import java.util.Deque;

public class RollingStock {
   private Deque<Vagon>vagons;

    public RollingStock() {
        this.vagons=new ArrayDeque<>();
    }
    public void addFirstVagon(Vagon vagon){
        vagons.addFirst(vagon);
    }
    public void addLaststVagon(Vagon vagon){
        vagons.addLast(vagon);
    }
    public Vagon unhookFirst(){
       return vagons.removeFirst();
    }

    public Vagon unhookLast(){
        return vagons.removeLast();
    }
    public boolean isEmpty(){
        return vagons.isEmpty();
    }
}
