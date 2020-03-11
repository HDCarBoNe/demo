package org.dp.birdes;

import org.dp.birdes.bo.*;

public class App {
    public static void main(String[] args) {
        Bird[] tabBirds = new Bird[10];
        tabBirds[0] = new Penguin();
        tabBirds[1] = new Duck();
        tabBirds[2] = new Dove();

        for (Bird item : tabBirds){
            if (item == null){
                break;
            }
            item.toString();
        }

        ICanFly[] tabsFly = new ICanFly[15];
        tabsFly[0] = new Dove();
        tabsFly[1] = new Duck();

        for (ICanFly item : tabsFly){
            if (item == null){
                break;
            }
            item.interfaceFly();
        }

        ICanSwim[] tabsSwim = new ICanSwim[15];
        tabsSwim[0] = new Penguin();
        tabsSwim[1] = new Duck();

        for (ICanSwim item : tabsSwim){
            if (item == null){
                break;
            }
            item.InterfaceSwim();
        }
    }
}
