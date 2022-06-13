package com.design.patterns.StrategyPattern.Task1;

public class Knight extends Character{

    public Knight(){
        weapon = new BowAndArrowBehavior();
    }
    @Override
    public void fight() {

    }
}
