package com.design.patterns.StrategyPattern.Example;
/*
This is a concrete class
 */

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
