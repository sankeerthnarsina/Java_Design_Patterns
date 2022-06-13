package com.design.patterns.StrategyPattern.Task1;

public class SwordBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Sword is for swinging");
    }
}
