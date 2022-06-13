package com.design.patterns.StrategyPattern.Task1;

public class KnifeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Knife is for cutting");
    }
}
