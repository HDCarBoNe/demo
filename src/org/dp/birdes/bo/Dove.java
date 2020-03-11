package org.dp.birdes.bo;

public class Dove extends Bird implements ICanFly {

    @Override
    public void interfaceFly() {
        System.out.println("I fly like a dove !");
    }
}
