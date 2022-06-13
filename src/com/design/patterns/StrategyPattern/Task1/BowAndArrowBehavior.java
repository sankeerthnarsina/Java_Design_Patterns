package com.design.patterns.StrategyPattern.Task1;

public class BowAndArrowBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("BowAndArrow is for shooting");
    }
}
