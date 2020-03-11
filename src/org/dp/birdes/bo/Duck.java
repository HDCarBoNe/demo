package org.dp.birdes.bo;

public class Duck extends Bird implements ICanFly,ICanSwim{
    @Override
    public void interfaceFly() {
        System.out.println("I fly like Donald !");
    }

    @Override
    public void InterfaceSwim() {
        System.out.println("I swim like Petit Grégorie");
    }
}
