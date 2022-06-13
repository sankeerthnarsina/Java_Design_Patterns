package com.design.patterns.StrategyPattern.Task1;

public class Troll extends Character{

    public Troll(){
        weapon = new AxeBehavior();
    }
    @Override
    public void fight() {

    }
}
