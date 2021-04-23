package com.study.designpatterns.combinationmode;

import java.util.EventObject;

/**
 * @author jhye4
 * @date 2021/4/4 22:03
 */
public abstract class Duck  {

    public FlyBehavior flyBehavior;

    public QuackBehavior quackBehavior;

    public void fly(){
        flyBehavior.fly();  //委托给行为类
    }

    public void quack(){
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
