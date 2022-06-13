package com.design.patterns.StrategyPattern.Example;
/*
This is a concrete class
 */

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
