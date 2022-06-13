package com.design.patterns.StrategyPattern.Task1;

public class Queen extends Character{

    public Queen(){
        weapon = new KnifeBehavior();
    }
    @Override
    public void fight() {

    }
}
