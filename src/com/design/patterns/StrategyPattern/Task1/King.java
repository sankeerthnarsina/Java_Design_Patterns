package com.design.patterns.StrategyPattern.Task1;

public class King extends Character{

    public King(){
        weapon = new SwordBehavior();
    }
    @Override
    public void fight() {

    }
}
