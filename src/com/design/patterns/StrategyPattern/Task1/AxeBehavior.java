package com.design.patterns.StrategyPattern.Task1;

public class AxeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Axe is for chopping");
    }
}
