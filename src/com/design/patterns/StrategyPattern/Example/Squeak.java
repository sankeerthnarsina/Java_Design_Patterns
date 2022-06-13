package com.design.patterns.StrategyPattern.Example;

/*
This is a concrete class
 */

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
