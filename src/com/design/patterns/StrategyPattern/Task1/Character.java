package com.design.patterns.StrategyPattern.Task1;

public abstract class Character {
    WeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
